/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    void notify(String itemName);
}
