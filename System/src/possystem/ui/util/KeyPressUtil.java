/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.ui.util;

import java.awt.event.KeyEvent;

/**
 *
 * @author dushantha.eranga
 */
public class KeyPressUtil
{
    private static final int doublePressSpeed = 300;    // Double keypressed in ms
    private static long timeKeyDown = 0;                // Last keyperessed time
    public static int lastKeyPressedCode;
 
    public static  boolean isDoublePress(KeyEvent ke) 
    {
        if ((ke.getWhen() - timeKeyDown) < doublePressSpeed)
        {
            return true;
        }
        else
        {
            timeKeyDown = ke.getWhen();
        }
        lastKeyPressedCode = ke.getKeyCode();
        return false;
    }
}
