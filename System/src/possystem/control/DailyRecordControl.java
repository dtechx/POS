/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.control;

import java.util.ArrayList;
import java.util.HashMap;
import possystem.core.ItemRecord;
import possystem.core.Item;

/**
 *
 * @author dushantha.eranga
 */
public class DailyRecordControl
{
    private final static HashMap<String, Item> itemHashMap = new HashMap<String, Item>();
    private static ArrayList<ItemRecord> itemRecordList = new ArrayList<>();
    
    private static Item currentItem;
    private static int total;
    
    public static void generateHashMap()
    {
        ArrayList<Item> list = ItemUtility.getItemList();
        for (Item item : list)
        {
            itemHashMap.put(item.getUserCode(), item);
        }
    }
    
    public static Item findItem(String itemCode)
    {
        return itemHashMap.get(itemCode);
    }
    
    public static int getItemRecordListSize()
    {
        return itemRecordList.size();
    }
    
    public static boolean isItemRecordListEmpty()
    {
        return itemRecordList.isEmpty();
    }
    
    public static void addItemRecordToItemList(ItemRecord itemRecord)
    {
        itemRecordList.add(itemRecord);
    }
    
    public static void removeItemRecordFromItemList(ItemRecord itemRecord)
    {
        itemRecordList.remove(itemRecord);
    }
    
    public static ItemRecord getItemRecordFromItemList(int index)
    {
        return itemRecordList.get(index);
    }
    
    public static ItemRecord getLastItemRecordFromItemList()
    {
        return itemRecordList.get(itemRecordList.size() - 1);
    }
    
    public static void clearItemRecordList()
    {
        itemRecordList.clear();
    }
    
    public static void addItemRecord(int qty)
    {
        if(currentItem != null)
        {
            ItemRecord dailyItemRecord = new ItemRecord(currentItem, qty);
            addItemRecordToItemList(dailyItemRecord);
            total = total + dailyItemRecord.getAmount();
        }
    }
    
    public static void undoEntry()
    {
        if(!DailyRecordControl.isItemRecordListEmpty())
        {
            ItemRecord itemRecord = getLastItemRecordFromItemList();
            total = total - itemRecord.getAmount();
            removeItemRecordFromItemList(itemRecord);
        }
    }
    
    /**
     * Set Current item which is going to enter by user
     * @param userEnteredCode
     * @return 
     */
    public static boolean setCurrentItem(String userEnteredCode)
    {
        currentItem = findItem(userEnteredCode);
        if(currentItem != null)
        {
            return true;
        }
        return false;
    }

    public static Item getCurrentItem()
    {
        return currentItem;
    }
    
    public static void clearAll()
    {
        clearItemRecordList();
        currentItem = null;
        total = 0;
    }
    
    public static int getTotal()
    {
        return total;
    }
    
    public static int getBalance(int cash)
    {
        return (cash - DailyRecordControl.getTotal());
    }
}
