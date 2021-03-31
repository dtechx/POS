/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.ui.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author dushantha.eranga
 */
public class NumericJTextField extends JTextField
{
    /**
     * Create Numeric JTextField by specifying input length
     * @param lengthLimit text input length
     */
    public NumericJTextField(final int lengthLimit)
    {
        super();
        setDocument(new PlainDocument()
        {
            @Override
            public void insertString(int offs, String str, AttributeSet a)
                    throws BadLocationException
            {
                if (getLength() + str.length() <= lengthLimit)
                {
                    if(isNumeric(str))
                    {
                        super.insertString(offs, str, a);
                    }
                }
            }
        });
    }
    
    /**
     * check is Numeric
     * @param str
     * @return true if all digits
     */
    private boolean isNumeric(String str)
    {
        //reg ex for digits
        String expression = "([0-9]*)";
        CharSequence inputStr = str;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.matches();
    }
}
