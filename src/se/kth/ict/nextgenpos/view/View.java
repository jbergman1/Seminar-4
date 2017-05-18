package se.kth.ict.nextgenpos.view;

import se.kth.ict.nextgenpos.controller.Controller;
import se.kth.ict.nextgenpos.model.ItemNotFoundException;
import se.kth.ict.nextgenpos.model.Observer;
import java.util.ArrayList;
import java.util.List;
import se.kth.ict.nextgenpos.model.ProductSpecification;

/**
 * A placeholder for the view.
 */
public class View implements Observer{
    private Controller cont;
    private List<ProductSpecification> items = new ArrayList<ProductSpecification>();

    /**
     * Creates a new View.
     * @param cont  The controller of the application.
     */
    public View(Controller cont) {
	this.cont = cont;
        cont.addObserver(this);
    }

    /**
     * Simulates a view. Makes some calls to the controller.
     */
    public void test() {
	cont.makeNewSale();
        for (int i = 1; i < 5; i++) {
            try{
                enterItem(i);
            } catch (ItemNotFoundException itemNotFound){
                System.out.println(itemNotFound.getMessage());
            }
        }
    }
   /**
    * registers an item using its item id
    * @param itemId id number of item
    */
    private void enterItem(int itemId) throws ItemNotFoundException {

    int quantity = 1;
    System.out.println("");
    System.out.println("Result for " + cont.enterItem(itemId, quantity));
    System.out.println("");

 }

   /**
    * Called by model when a new item gets registered.
    *
    * @param itemName name of the item
    */
    @Override
    public void notify(ProductSpecification itemName) {
        items.add(itemName);
        System.out.println("Items currently registered:");
        items.forEach((itemToShow) -> {
            System.out.println(itemToShow);
        });
    System.out.println("");
    }
}
