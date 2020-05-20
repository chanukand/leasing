/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.util;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author shawer kota
 */
public abstract class search extends javax.swing.JDialog {

    int searchtype = 0;

    /**
     * Creates new form StockSearch
     */
    public search(java.awt.Frame parent, boolean modal, int Type, int mainid, String searchValue) {

        super(parent, modal);
        initComponents();

        Toolkit theKit = getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        int widW = wndSize.width;
        int heiW = wndSize.height;
        int wid = this.getWidth();
        int hei = this.getHeight();
        int setW = (widW - wid) / 2;
        int setH = (heiW - hei) / 2;
        setLocation(setW, setH);
        searchtype = Type;
        searchText.setText(searchValue);

        if (searchtype == 1) {
            showGrid(); //show CSUs Data
        } else if (searchtype == 2) {
            showGrid1();//show Expences data
        } else if (searchtype == 3) {
            showGrid2();//show Customer data
        }
    }

    private void showGrid() {
        txtNo.setText("CSU Code");
        try {
            String colu[] = new String[]{"CSU Code", "CSU Name"};
            DefaultTableModel model = new DefaultTableModel(colu, 0) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            tblGrid.setModel(model);
            tblGrid.getTableHeader().setPreferredSize(new Dimension(tblGrid.getTableHeader().getPreferredSize().width, 35));
            JTableHeader head = tblGrid.getTableHeader();
            head.setFont(head.getFont().deriveFont(Font.BOLD));

//            ArrayList<CSU> csu = csuDetailsController.search(searchText.getText() == null ? "" : searchText.getText().trim());
//            if (csu != null) {
//                for (CSU object : csu) {
//                    Object[] rowData = {object.getCode(), object.getName()};
//                    model.addRow(rowData);
//                }
//                tblGrid.setModel(model);
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid1() {
        txtNo.setText("Expence");
        try {
            String colu[] = new String[]{"Expence Code", "Expence Name"};
            DefaultTableModel model = new DefaultTableModel(colu, 0) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            tblGrid.setModel(model);
            tblGrid.getTableHeader().setPreferredSize(new Dimension(tblGrid.getTableHeader().getPreferredSize().width, 35));
            JTableHeader head = tblGrid.getTableHeader();
            head.setFont(head.getFont().deriveFont(Font.BOLD));

//            ArrayList<ExpenceDetails> exp = expenceDetailsController.search(searchText.getText() == null ? "" : searchText.getText().trim());
//            if (exp != null) {
//                for (ExpenceDetails object : exp) {
//                    Object[] rowData = {object.getCode(), object.getDesc()};
//                    model.addRow(rowData);
//                }
//                tblGrid.setModel(model);
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid2() {
        txtNo.setText("Customer");
        try {
            String colu[] = new String[]{"Customer Code", "Customer Name"};
            DefaultTableModel model = new DefaultTableModel(colu, 0) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            tblGrid.setModel(model);
            tblGrid.getTableHeader().setPreferredSize(new Dimension(tblGrid.getTableHeader().getPreferredSize().width, 35));
            JTableHeader head = tblGrid.getTableHeader();
            head.setFont(head.getFont().deriveFont(Font.BOLD));

//            ArrayList<Customer> customer = customerDetailsController.search(searchText.getText() == null ? "" : searchText.getText().trim());
//            if (customer != null) {
//                for (Customer object : customer) {
//                    Object[] rowData = {object.getCode(), object.getFull_name()};
//                    model.addRow(rowData);
//                }
//                tblGrid.setModel(model);
//            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public abstract void getSelectedValue(String para1, String para2, String para3, String para4, String para5, String para6);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrid = new javax.swing.JTable();
        txtNo = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrid);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 200));

        txtNo.setText("Transaction No");
        jPanel1.add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });
        jPanel1.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 200, -1));

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, -1));

        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridMouseClicked
        // TODO add your handling code here:
        if (tblGrid.getSelectedRowCount() == 1) {
            if (searchtype == 1) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), "", "", "", "");
            } else if (searchtype == 2) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), "", "", "", "");
            } else if (searchtype == 3) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), "", "", "", "");
            }

            dispose();
        }
    }//GEN-LAST:event_tblGridMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        if (searchtype == 1) {
            showGrid(); //show CSUs Data
        } else if (searchtype == 2) {
            showGrid1();//show Expences data
        } else if (searchtype == 3) {
            showGrid2();//show Expences data
        }
    }//GEN-LAST:event_searchTextKeyReleased

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (tblGrid.getSelectedRowCount() == 1) {
            if (searchtype == 1) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 2).toString(), "", "", "");
            } else if (searchtype == 2) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 2).toString(), "", "", "");
            } else if (searchtype == 3) {
                getSelectedValue(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString(), tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString(), "", "", "", "");
            }
            dispose();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable tblGrid;
    private javax.swing.JLabel txtNo;
    // End of variables declaration//GEN-END:variables

}
