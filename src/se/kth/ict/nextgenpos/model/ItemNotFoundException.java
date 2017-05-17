
package se.kth.ict.nextgenpos.model;

/**
 *
 * @author Jakob
 */

/**
 * Gets thrown when an item is not found in the ProductCatalog
 */
public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message){
        super(message);
    }
}
