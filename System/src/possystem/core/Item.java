/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.core;

/**
 *
 * @author dushantha.eranga
 */
public class Item
{
    private int itemID;
    private String userCode;
    private String itemName;
    private int unitPrice;
    private int currentStock;
    private String itemImagePath;
    private boolean positive;
    
    private static final int counter = 0;

    public Item(int itemID, String userCode, String itemName, int unitPrice)
    {
        this.itemID = itemID;
        this.userCode = userCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.currentStock = 100;
        this.itemImagePath = "";
        this.positive = true;
    }
    
    public Item(int itemID, String userCode, String itemName, int unitPrice, int currentStock, String itemImagePath, boolean sellingItem)
    {
        this.itemID = itemID;
        this.userCode = userCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.currentStock = currentStock;
        this.itemImagePath = itemImagePath;
        this.positive = sellingItem;
    }
    
    public void reduceCurrentStock(int quntity)
    {
        this.currentStock = this.currentStock - quntity;
    }

    public void addToCurrentStock(int quantity)
    {
        this.currentStock = this.currentStock + quantity;
    }

    @Override
    public String toString()
    {
        return this.userCode + " : " + this.itemName;
    }
    
    public String getDisplayString()
    {
        return this.itemID + " : " + this.userCode + " : " + this.unitPrice + " : " + this.itemName;
    }

    public int getItemID()
    {
        return itemID;
    }

    public String getUserCode()
    {
        return userCode;
    }

    public String getItemName()
    {
        return itemName;
    }

    public int getUnitPrice()
    {
        return unitPrice;
    }
    
    
    
}
