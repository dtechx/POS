/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem.ui.dailyRecords;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import possystem.control.DailyRecordControl;
import possystem.control.ItemUtility;
import possystem.core.ItemRecord;
import possystem.core.Item;
import possystem.ui.util.NumericJTextField;

/**
 *
 * @author dushantha.eranga
 */
public class DailyRecordWindow extends javax.swing.JFrame
{
    /**
     * Creates new form SummaryWindow
     */
    public DailyRecordWindow()
    {
        initComponents();
        lblItemCodeError.setVisible(false);
        
        // Show All Items in Text Area
        showAllItems();
        
        // Add all items to hashmap having userCode as the key
        DailyRecordControl.generateHashMap();
        
        // Initialize Item Table
        itemTable.initializeItemTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtItemCode = new NumericJTextField(3);
        jLabel1 = new javax.swing.JLabel();
        btnEnterItem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQty = new NumericJTextField(3);
        btnEnterQty = new javax.swing.JButton();
        lblItemCodeError = new javax.swing.JLabel();
        btnUndo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        itemTable = new possystem.ui.common.ItemTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistAllItems = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Item and Qty"));

        txtItemCode.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtItemCodeActionPerformed(evt);
            }
        });

        jLabel1.setText("Item Code");

        btnEnterItem.setText("Enter Item");
        btnEnterItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEnterItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Qty");

        txtQty.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtQtyActionPerformed(evt);
            }
        });

        btnEnterQty.setText("Enter Qty");
        btnEnterQty.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEnterQtyActionPerformed(evt);
            }
        });

        lblItemCodeError.setForeground(new java.awt.Color(255, 0, 0));
        lblItemCodeError.setText("Error");

        btnUndo.setText("Undo");
        btnUndo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUndoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtQty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEnterQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnterItem, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblItemCodeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUndo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemCodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnterItem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEnterQty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUndo)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Daily Records"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemTable, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(itemTable, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));

        jlistAllItems.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jlistAllItems.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jlistAllItemsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlistAllItems);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtItemCodeActionPerformed
    {//GEN-HEADEREND:event_txtItemCodeActionPerformed
        // TODO add your handling code here:
        enterItem();
    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtQtyActionPerformed
    {//GEN-HEADEREND:event_txtQtyActionPerformed
        // TODO add your handling code here:
        // Add DailyRecordItem to table
        enterQuantity();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnEnterItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnterItemActionPerformed
    {//GEN-HEADEREND:event_btnEnterItemActionPerformed
        // TODO add your handling code here:
        enterItem();
    }//GEN-LAST:event_btnEnterItemActionPerformed

    private void btnEnterQtyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEnterQtyActionPerformed
    {//GEN-HEADEREND:event_btnEnterQtyActionPerformed
        // TODO add your handling code here:
        enterQuantity();
    }//GEN-LAST:event_btnEnterQtyActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUndoActionPerformed
    {//GEN-HEADEREND:event_btnUndoActionPerformed
        // TODO add your handling code here:
        undoEntry();
    }//GEN-LAST:event_btnUndoActionPerformed

    private void jlistAllItemsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jlistAllItemsMouseClicked
    {//GEN-HEADEREND:event_jlistAllItemsMouseClicked
        // TODO add your handling code here:
        promptSelectedItem();
    }//GEN-LAST:event_jlistAllItemsMouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        }
//        catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(DailyRecordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(DailyRecordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(DailyRecordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(DailyRecordWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                new DailyRecordWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterItem;
    private javax.swing.JButton btnEnterQty;
    private javax.swing.JButton btnUndo;
    private possystem.ui.common.ItemTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList jlistAllItems;
    private javax.swing.JLabel lblItemCodeError;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    /**
     * Show all Items in List
     */
    private void showAllItems()
    {
        DefaultListModel<Item> listModel = new DefaultListModel<>();
        
        for (Item item : ItemUtility.getItemList())
        {
            listModel.addElement(item);
        }
        
        jlistAllItems.setModel(listModel);
    }
    
    /*
    private void showAllItems()
    {
        jtaItemList.append("Item ID" + "\t" + "Unit Price" + "\t" + "Code" + "\t" + "Name" + "\n");
        for (Item item : ItemUtility.getItemList())
        {
            jtaItemList.append(item.getItemID() + "\t" + item.getUnitPrice() + "\t" + item.getUserCode()+ "\t" + item.getItemName());
            jtaItemList.append("\n");
        }
    }
    */

    /**
     * Enter Item Code
     */
    private void enterItem()
    {
        boolean foundItem = DailyRecordControl.setCurrentItem(txtItemCode.getText());
        if(foundItem)
        {
            txtQty.requestFocus();
            txtQty.selectAll();
            showItemCodeError(false);
            
            jlistAllItems.setSelectedIndex(DailyRecordControl.getCurrentItem().getItemID() - 1);
        }
        else
        {
            // Error occurred
            txtItemCode.selectAll();
            showItemCodeError(true);
        }
    }

    /**
     * Enter Quantity
     */
    private void enterQuantity()
    {
        int qty = Integer.parseInt(txtQty.getText());
        DailyRecordControl.addItemRecord(qty);

        itemTable.updateTable();
        txtItemCode.requestFocus();
        txtItemCode.selectAll();
    }
    
    /**
     * Show Item Code Error
     * @param flag 
     */
    private void showItemCodeError(boolean flag)
    {
        lblItemCodeError.setVisible(flag);
        if(flag)
        {
            txtItemCode.setBackground(Color.PINK);
        }
        else
        {
            txtItemCode.setBackground(Color.WHITE);
        }
    }

    /**
     * Undo Entry adding
     */
    private void undoEntry()
    {
        DailyRecordControl.undoEntry();
        itemTable.updateTable();
        txtItemCode.requestFocus();
    }

    /**
     * Prompt selected item to Item Code text field
     */
    private void promptSelectedItem()
    {
        Item item = (Item)jlistAllItems.getSelectedValue();
        txtItemCode.setText(item.getUserCode());
        enterItem();
    }
}
