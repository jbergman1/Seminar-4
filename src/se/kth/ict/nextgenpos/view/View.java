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
    private List<String> listOfItems = new ArrayList<String>();

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
	enterItem(1);
        enterItem(2);
        enterItem(3);
	enterItem(10);
    }
   /**
    * registers an item using its item id
    * @param itemId id number of item
    */
    private void enterItem(int itemId) {
    try {
    int quantity = 1;
    System.out.println("");
    System.out.println("Result for itemID " + itemId + ": " + cont.enterItem(itemId, quantity));
    } catch (ItemNotFoundException itemNotFound) {
    System.out.println("Couldnt find item in catalog");
    }
 }

   /**
    * Called by model when a new item gets registered.
    *
    * @param itemName name of the item
    */
    public void notify(String itemName) {
        listOfItems.add(itemName);
        System.out.println("Items currently registered:");
        listOfItems.forEach((itemToShow) -> {
            System.out.println(itemToShow);
        });
    System.out.println("");
    }
}
