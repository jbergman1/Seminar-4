
package se.kth.ict.nextgenpos.model;

/**
 *
 * @author Jakob
 */
public interface Observer {
    /**
     * Called by model when a new item gets registered
     * @param itemName name of the item
     */
    void notify(ProductSpecification itemName);
}
