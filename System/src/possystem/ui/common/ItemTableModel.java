/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.ui.common;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import possystem.control.BillingControl;
import possystem.core.ItemRecord;
import possystem.ui.billing.BillingWindow;

/**
 *
 * @author dushantha.eranga
 */
public class ItemTableModel extends AbstractTableModel
{
    public ItemTableModel()
    {
        super();
    }
    
    @Override
    public int getRowCount()
    {
        if(!BillingControl.isItemRecordListEmpty())
        {
            return BillingControl.getItemRecordListSize() + 1;
        }
        return BillingControl.getItemRecordListSize();
    }

    @Override
    public int getColumnCount()
    {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        //if (getItemList() == null /*|| getItemList().size() <= rowIndex*/)
        //{
        //    return "Error";
        //}
        
        if(BillingControl.getItemRecordListSize() <= rowIndex)
        {
            if(columnIndex == (getColumnCount() - 1))
            {
                return BillingControl.getTotal();
            }
            else if(columnIndex == (getColumnCount() - 2))
            {
                return "Total";
            }
            else
            {
                return "";
            }
        }
        else
        {
            if (columnIndex == 0)
            {
                return BillingControl.getItemRecordFromItemList(rowIndex).getItem().getUserCode();
            }
            else if (columnIndex == 1)
            {
                return BillingControl.getItemRecordFromItemList(rowIndex).getItem().getItemName();
            }
            else if (columnIndex == 2)
            {
                return BillingControl.getItemRecordFromItemList(rowIndex).getItem().getUnitPrice();
            }
            else if (columnIndex == 3)
            {
                return BillingControl.getItemRecordFromItemList(rowIndex).getQty();
            }
            else if (columnIndex == 4)
            {
                return BillingControl.getItemRecordFromItemList(rowIndex).getAmount();
            }
        }
        return "N/A";
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        if (columnIndex == 0)
        {
            return "Code";
        }
        else if (columnIndex == 1)
        {
            return "Name";
        }
        else if (columnIndex == 2)
        {
            return "Unit Price";
        }
        else if (columnIndex == 3)
        {
            return "Qty";
        }
        else if (columnIndex == 4)
        {
            return "Total";
        }
        else
        {
            return "";
        }
    }

    /**
     * Undo add DailyRecordItem
     */
    public void undoEntry()
    {
        this.fireTableDataChanged();
    }

    /**
     * Update table model
     */
    public void updateTableModel()
    {
        this.fireTableDataChanged();
    }
}
