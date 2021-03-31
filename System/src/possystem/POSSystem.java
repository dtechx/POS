/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

import possystem.control.ItemUtility;
import possystem.ui.WindowSelector;

/**
 *
 * @author dushantha.eranga
 */
public class POSSystem
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Generate Item Object List
        ItemUtility.generateItemObjects();
        
        // Show Window Selector
        WindowSelector windoSelector = new WindowSelector();
        windoSelector.setVisible(true);
    }
    
}
