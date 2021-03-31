package possystem.ui.itemSelector;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author dushantha.eranga
 */
public class ItemSelector implements ActionListener
{
    
    // UI components
    JComboBox<String> gridValue;



    private ArrayList<String> referenceTypeValues; // Contains current reference type values. (default "referenceType1Values")
    ArrayList<Object> gridInfo; // Contains the validated grid information. (Grid reference type, Validated grid location)


    public ItemSelector()
    {
        referenceTypeValues = new ArrayList<String>();


        gridValue = new JComboBox<String>();
        gridValue.setEditable(true);
        
        gridValue.setModel(new DefaultComboBoxModel<String>());
        gridValue.setSize(130, 20);
        gridValue.setPreferredSize(gridValue.getSize());
        
        /*
        gridValue.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                performKeyReleaseEventForComboBoxEditor(e);
            }

        });
        
        gridValue.getEditor().getEditorComponent().addFocusListener(new FocusListener()
        {

            @Override
            public void focusGained(FocusEvent e)
            {
                
            }

            @Override
            public void focusLost(FocusEvent e)
            {
//                if (isValidGridLocation)
//                {
//                    ((JTextField) gridValue.getEditor().getEditorComponent()).setText(gridLocationWithSpaces);
//                }
            }
        });
        
        // Mouse listner for the button component of the JComboBox.
        gridValue.getComponent(0).addMouseListener(new MouseListener()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                // Create and set the suggestion list when the arrow key of the combo box is pressed.
                setSuggestionsList(createReferencePointsSuggestionsList(referenceTypeValues, (JTextField) gridValue.getEditor().getEditorComponent()).getText());
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                
            }
        });
        gridValue.setFocusable(true);
        */
        
    }
    /**
     * Perform key release event for combo box editor.
     *
     * @param e Key event
     */
    public void performKeyReleaseEventForComboBoxEditor(KeyEvent e)
    {
        // If delete or back space key event is performed start validation from the initial level.
        // (Get the current reference point list and set validation level to Reference point validation level)
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_DELETE)
        {
        }

        // Create and set the suggestion list all key strokes other than arrow keys,
        // because these key events are used to popUp menu actions.
        if (e.getKeyCode() != KeyEvent.VK_DOWN && e.getKeyCode() != KeyEvent.VK_UP
                && e.getKeyCode() != KeyEvent.VK_LEFT && e.getKeyCode() != KeyEvent.VK_RIGHT)
        {
            setSuggestionsList(createReferencePointsSuggestionsList(referenceTypeValues, ((JTextField) gridValue.getEditor().getEditorComponent()).getText()));
        }

        // Perform validation for all key events except left and right key events, 
        // because those keys are used to travers through the grid text.
        if (e.getKeyCode() != KeyEvent.VK_LEFT && e.getKeyCode() != KeyEvent.VK_RIGHT)
        {
            //performValidation();
        }
    }
    
    /**
     * Perform validation for the user input given in the grid selector.
     *
     */
    public void performValidation()
    {
        
    }

    /**
     * Set the suggestions to the "gridValue" model
     *
     * @param suggestions Array of suggestions.
     */
    public void setSuggestionsList(String[] suggestions)
    {
        String gridText = gridValue.getEditor().getItem().toString();
        int caretPosition = ((JTextField) gridValue.getEditor().getEditorComponent()).getCaretPosition();

        // Hide the popup window and remove the items.
        gridValue.hidePopup();
        gridValue.removeAllItems();
        
        // If suggestions are given add the new ones.
        if (suggestions != null && suggestions.length != 0)
        {
            // Add the new suggestions.
            for (String suggestion : suggestions)
            {
                gridValue.addItem(suggestion);
            }

            // Show the popup window.
            gridValue.showPopup();
        }
        
        // Reset the user entered value to the combo box editor and set the cursor postion, so the user can type furthermore.
        setGridValueTextWithFocus(gridText, caretPosition);
    }
    
    /**
     * Set the text for the "gridValue" combo box with the focus to the text editor.
     * 
     * @param gridText
     */
    private void setGridValueTextWithFocus(String gridText, int caretPosition)
    {
        // Set the text.
        ((JTextField) gridValue.getEditor().getEditorComponent()).setText(gridText);
        // Set the cursor position.
        if(caretPosition > gridText.length())
        {
            ((JTextField) gridValue.getEditor().getEditorComponent()).setCaretPosition(gridText.length());
        }
        else if (caretPosition < 0)
        {
            ((JTextField) gridValue.getEditor().getEditorComponent()).setCaretPosition(0);
        }
        else
        {
            ((JTextField) gridValue.getEditor().getEditorComponent()).setCaretPosition(caretPosition);
        }
        
    }

    /**
     * Create suggestion list according to a filter list.
     * 
     * @param filterList Allowed reference points type list.
     * @param valueList contains the reference points name list.
     * @return Array of reference point suggestions.
     */
    private String[] createReferencePointsSuggestionsList(ArrayList<String> filterList, String valueList)
    {
        ArrayList<String> filteredValueList = new ArrayList<String>();
        String gridText = "";
        
        // Create the filtered value list.
        if (filterList != null)
        {
            for (String item : filterList)
            {
                
                if (item.contains(valueList))
                {
                   filteredValueList.add(item);
                }
            }
        }
        
      
        if (gridValue.getEditor().getItem() != null)
        {
            gridText = gridValue.getEditor().getItem().toString();
        }
        
        // Create and return the suggestion list.
        return  createSuggestionsList(gridText, filteredValueList);
    }

    /**
     * Create suggestion list according to a filter.
     * 
     * @param filter use as a delimeter to filter the valueList.
     * @param valueList List to be filtered to create the suggestions.
     * @return Array of suggestions.
     */
    private String[] createSuggestionsList(String filter, ArrayList<String> valueList)
    {
        String[] suggestions;
        ArrayList<String> suggestionsList = new ArrayList<String>();
        
        if (filter != null && !filter.equals(""))
        {
            // Create the suggestion list according to the filter.
            for (String item : valueList)
            {
                if (item.toUpperCase().contains(filter.toUpperCase()))
                {
                    suggestionsList.add(item);
                }
            }

            suggestions = new String[suggestionsList.size()];
            int index = 0;

            for (String item : suggestionsList)
            {
                suggestions[index++] = item;
            }
        }
        else
        {
            // If no filter is given load all the values.
            suggestions = new String[valueList.size()];
            int index = 0;
            for (String item : valueList)
            {
                suggestions[index++] = item;
            }
        }

        //return valueList.toArray();
        return suggestions;
    }

    /**
     * Set default values
     */
    public void refreshPanel()
    {
        gridValue.getEditor().setItem("");
    }
    

    /**
     * Show the validation using a style and set relative position.
     *
     * @param isValidGridLocation
     */
    public void showValidation(boolean isValidGridLocation)
    {
        if (isValidGridLocation)
        {
            // Set the text color to black.
            gridValue.getEditor().getEditorComponent().setForeground(Color.black);
        }
        else
        {
            // Set the text color to red.
            gridValue.getEditor().getEditorComponent().setForeground(Color.red);
        }
    }


    /**
     * Action performed event.
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("actionPerformed");
    }


}
