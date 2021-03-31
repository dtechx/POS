/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.control;

import java.util.ArrayList;
import possystem.core.Item;

/**
 *
 * @author dushantha.eranga
 */
public class ItemUtility
{
    public static ArrayList<Item> itemList = new ArrayList<>();
    
    public static enum ItemList
    {
        FishBun(1, "111", "Fish Bun", 30),
        EggBun(2, "112", "Egg Bun", 35),
        ChickenBun(3, "113", "Chicken Bun", 50),
        
        FishRoll(4, "114", "Fish Roll", 35),
        EggRoll(5, "115", "Egg Roll", 40),
        
        OmletteBurger(6, "116", "Omlette Burger", 65),
        ChickenBurger(7, "117", "Chicken Burger", 90),
        
        EggPastry(8, "118", "Egg Pastry", 35),
        FishPastry(9, "119", "Fish Pastry", 40),
        
        FishPatty(10, "120", "Fish Patty", 30),
        ChickenPatty(11, "121", "Chicken Patty", 40),
        
        EggFriedRiceHalf(12, "211", "Egg Fried Rice - Half", 150),
        EggFriedRiceFull(13, "212", "Egg Fried Rice - Full", 250),
        EggFriedRiceFamily(14, "213", "Egg Fried Rice - Family", 350),
        
        ChickenFriedRiceHalf(15, "214", "Chicken Fried Rice - Half", 180),
        ChickenFriedRiceFull(16, "215", "Chicken Fried Rice - Full", 280),
        ChickenFriedRiceFamily(17, "216", "Chicken Fried Rice - Family", 380),
        
        MixedFriedRiceHalf(18, "217", "Mixed Fried Rice - Half", 210),
        MixedFriedRiceFull(19, "218", "Mixed Fried Rice - Full", 310),
        MixedFriedRiceFamily(20, "219", "Mixed Fried Rice - Family", 410),
        
        EggKoththuHalf(21, "311", "Egg Koththu - Half", 140),
        EggKoththuFull(22, "312", "Egg Koththu - Full", 240),
        EggKoththuFamily(23, "313", "Egg Koththu - Family", 340),
        
        ChickenKoththuHalf(24, "314", "Chicken Koththu - Half", 170),
        ChickenKoththuFull(25, "315", "Chicken Koththu - Full", 270),
        ChickenKoththuFamily(26, "316", "Chicken Koththu - Family", 370),
        
        MixedKoththuHalf(27, "317", "Mixed Koththu - Half", 200),
        MixedKoththuFull(28, "318", "Mixed Koththu - Full", 300),
        MixedKoththuFamily(29, "319", "Mixed Koththu - Family", 400),
        
        WaterBottle400ml(30, "411", "Water Bottle - 400ml", 50),
        WaterBottle750ml(31, "412", "Water Bottle - 750ml", 80),
        WaterBottle1L(32, "413", "Water Bottle - 1L", 110),
        WaterBottle4L(33, "414", "Water Bottle - 4L", 110);
        

        private int itemID;
        private String userCode;
        private String itemName;
        private int unitPrice;

        // Constructor
        ItemList(int itemID, String userCode, String itemName, int unitPrice)
        {
            this.itemID = itemID;
            this.userCode = userCode;
            this.itemName = itemName;
            this.unitPrice = unitPrice;
        }
    };
    
    public static void generateItemObjects()
    {
        itemList = new ArrayList<>();
        for (ItemList type : ItemList.values())
        {
            itemList.add(new Item(type.itemID, type.userCode, type.itemName, type.unitPrice));
        }
    }

    public static ArrayList<Item> getItemList()
    {
        return itemList;
    }
}
