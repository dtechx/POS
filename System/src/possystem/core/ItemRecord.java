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
public class ItemRecord
{
    Item item;
    int Qty;
    int amount;

    public ItemRecord(Item item, int Qty)
    {
        this.item = item;
        this.Qty = Qty;
        this.amount = item.getUnitPrice() * this.Qty;
    }

    public Item getItem()
    {
        return item;
    }

    public int getQty()
    {
        return Qty;
    }

    public int getAmount()
    {
        return amount;
    }
    
    
}
