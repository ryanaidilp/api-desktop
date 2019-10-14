/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apiclientdesktop;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Asus
 */
public class ApiJFrame extends javax.swing.JFrame {

    DataHandler dh = new DataHandler();
    /**
     * Creates new form ApiJFrame
     */
    public ApiJFrame() {
        initComponents();
        loadData();
        tableSettings();
        MainPanel.setViewportView(ProvinsiPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProvinsiPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProvinsiTable = new javax.swing.JTable();
        ProvinsiButtonBack = new javax.swing.JButton();
        ProvinsiButtonEdit = new javax.swing.JButton();
        ProvinsiButtonDelete = new javax.swing.JButton();
        ProvinsiButtonAdd = new javax.swing.JButton();
        ProvinsiEditPanel = new javax.swing.JPanel();
        ProvinsiEditButtonBack = new javax.swing.JButton();
        ProvinsiEditButtonSave = new javax.swing.JButton();
        ProvinsiEditNameTf = new javax.swing.JTextField();
        ProvinsiEditIdLabel = new javax.swing.JLabel();
        ProvinsiEditId = new javax.swing.JLabel();
        ProvinsiEditNameLabel = new javax.swing.JLabel();
        ProvinsiEditPopulationsLabel = new javax.swing.JLabel();
        ProvinsiEditPopulationsTf = new javax.swing.JTextField();
        MainPanel = new javax.swing.JScrollPane();

        ProvinsiPanel.setBackground(new java.awt.Color(102, 102, 102));

        ProvinsiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Populations", "Id_Weather"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProvinsiTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProvinsiTable.setFocusable(false);
        ProvinsiTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProvinsiTable.setSelectionBackground(new java.awt.Color(32, 136, 203));
        ProvinsiTable.getTableHeader().setResizingAllowed(false);
        ProvinsiTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ProvinsiTable);
        if (ProvinsiTable.getColumnModel().getColumnCount() > 0) {
            ProvinsiTable.getColumnModel().getColumn(0).setResizable(false);
            ProvinsiTable.getColumnModel().getColumn(1).setResizable(false);
            ProvinsiTable.getColumnModel().getColumn(2).setResizable(false);
            ProvinsiTable.getColumnModel().getColumn(3).setResizable(false);
        }

        ProvinsiButtonBack.setBackground(new java.awt.Color(153, 153, 0));
        ProvinsiButtonBack.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiButtonBack.setText("Kembali");

        ProvinsiButtonEdit.setBackground(new java.awt.Color(255, 153, 51));
        ProvinsiButtonEdit.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiButtonEdit.setText("Edit");
        ProvinsiButtonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProvinsiButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinsiButtonEditActionPerformed(evt);
            }
        });

        ProvinsiButtonDelete.setBackground(new java.awt.Color(204, 0, 0));
        ProvinsiButtonDelete.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiButtonDelete.setText("Hapus");
        ProvinsiButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ProvinsiButtonAdd.setBackground(new java.awt.Color(0, 153, 0));
        ProvinsiButtonAdd.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiButtonAdd.setText("Tambah");

        javax.swing.GroupLayout ProvinsiPanelLayout = new javax.swing.GroupLayout(ProvinsiPanel);
        ProvinsiPanel.setLayout(ProvinsiPanelLayout);
        ProvinsiPanelLayout.setHorizontalGroup(
            ProvinsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvinsiPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ProvinsiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProvinsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProvinsiPanelLayout.createSequentialGroup()
                        .addComponent(ProvinsiButtonBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProvinsiPanelLayout.createSequentialGroup()
                        .addComponent(ProvinsiButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProvinsiButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProvinsiButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ProvinsiPanelLayout.setVerticalGroup(
            ProvinsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvinsiPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProvinsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProvinsiButtonEdit)
                    .addComponent(ProvinsiButtonDelete)
                    .addComponent(ProvinsiButtonAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(ProvinsiButtonBack)
                .addContainerGap())
        );

        ProvinsiEditPanel.setBackground(new java.awt.Color(102, 102, 102));

        ProvinsiEditButtonBack.setBackground(new java.awt.Color(153, 153, 0));
        ProvinsiEditButtonBack.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiEditButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiEditButtonBack.setText("Kembali");
        ProvinsiEditButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinsiEditButtonBackActionPerformed(evt);
            }
        });

        ProvinsiEditButtonSave.setBackground(new java.awt.Color(0, 153, 0));
        ProvinsiEditButtonSave.setFont(new java.awt.Font("Raleway", 1, 11)); // NOI18N
        ProvinsiEditButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiEditButtonSave.setText("Simpan");

        ProvinsiEditIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ProvinsiEditIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiEditIdLabel.setText("Id Provinsi :");

        ProvinsiEditId.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ProvinsiEditId.setForeground(new java.awt.Color(255, 255, 255));

        ProvinsiEditNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ProvinsiEditNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiEditNameLabel.setText("Nama Provinsi :");

        ProvinsiEditPopulationsLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ProvinsiEditPopulationsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProvinsiEditPopulationsLabel.setText("Populations        :");

        javax.swing.GroupLayout ProvinsiEditPanelLayout = new javax.swing.GroupLayout(ProvinsiEditPanel);
        ProvinsiEditPanel.setLayout(ProvinsiEditPanelLayout);
        ProvinsiEditPanelLayout.setHorizontalGroup(
            ProvinsiEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvinsiEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProvinsiEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProvinsiEditPanelLayout.createSequentialGroup()
                        .addComponent(ProvinsiEditPopulationsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ProvinsiEditPanelLayout.createSequentialGroup()
                        .addGroup(ProvinsiEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProvinsiEditNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProvinsiEditButtonBack)
                            .addComponent(ProvinsiEditButtonSave)
                            .addGroup(ProvinsiEditPanelLayout.createSequentialGroup()
                                .addComponent(ProvinsiEditIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProvinsiEditId))
                            .addComponent(ProvinsiEditNameLabel)
                            .addComponent(ProvinsiEditPopulationsLabel))
                        .addGap(307, 660, Short.MAX_VALUE))))
        );
        ProvinsiEditPanelLayout.setVerticalGroup(
            ProvinsiEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvinsiEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProvinsiEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProvinsiEditIdLabel)
                    .addComponent(ProvinsiEditId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProvinsiEditNameLabel)
                .addGap(1, 1, 1)
                .addComponent(ProvinsiEditNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ProvinsiEditPopulationsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProvinsiEditPopulationsTf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(ProvinsiEditButtonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(ProvinsiEditButtonBack)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Editor for API Data Indonesia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProvinsiButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinsiButtonEditActionPerformed
        int i = ProvinsiTable.getSelectedRow();
        if(i < 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin di edit!", "Gagal!", JOptionPane.WARNING_MESSAGE);
        } else {
            String idprov = ProvinsiTable.getValueAt(i, 0).toString();
            Provinsi prov = dh.getProvinsi(idprov);
            ProvinsiEditId.setText(prov.getId());
            ProvinsiEditNameTf.setText(prov.getName());
            ProvinsiEditPopulationsTf.setText(String.valueOf(prov.getPopulations()));
            MainPanel.setViewportView(ProvinsiEditPanel);
        }
    }//GEN-LAST:event_ProvinsiButtonEditActionPerformed

    private void ProvinsiEditButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinsiEditButtonBackActionPerformed
        MainPanel.setViewportView(ProvinsiPanel);
    }//GEN-LAST:event_ProvinsiEditButtonBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApiJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApiJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApiJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApiJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApiJFrame().setVisible(true);
            }
        });
    }

    private void loadData() {
        DefaultTableModel provdm = (DefaultTableModel) ProvinsiTable.getModel();
        List<Provinsi> provinsi = dh.getAllProvinsi();
        for (int i = 0; i < provinsi.size(); i++) {
            provdm.addRow(new Object[]{
                provinsi.get(i).getId(),
                provinsi.get(i).getName(),
                provinsi.get(i).getPopulations(),
                provinsi.get(i).getId_weather()
            });
        }
    }

    private void tableSettings() {
        TableCellRenderer tcr = new TextTableCenter();
        
        
        //Table Provinsi
        JTableHeader headerprov = ProvinsiTable.getTableHeader();
        ProvinsiTable.setShowGrid(true);
        ProvinsiTable.getColumnModel().getColumn(0).setCellRenderer(tcr);
        ProvinsiTable.getColumnModel().getColumn(1).setCellRenderer(tcr);
        ProvinsiTable.getColumnModel().getColumn(2).setCellRenderer(tcr);
        ProvinsiTable.getColumnModel().getColumn(3).setCellRenderer(tcr);
        ProvinsiTable.setFont(new Font("Roboto", Font.BOLD, 11));
        ProvinsiTable.setRowHeight(25);
        ((DefaultTableCellRenderer)headerprov.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer) headerprov.getDefaultRenderer()).setFont(new Font("Segoe UI", Font.BOLD, 12));
        headerprov.setBackground(Color.blue);
        headerprov.setOpaque(false);
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MainPanel;
    private javax.swing.JButton ProvinsiButtonAdd;
    private javax.swing.JButton ProvinsiButtonBack;
    private javax.swing.JButton ProvinsiButtonDelete;
    private javax.swing.JButton ProvinsiButtonEdit;
    private javax.swing.JButton ProvinsiEditButtonBack;
    private javax.swing.JButton ProvinsiEditButtonSave;
    private javax.swing.JLabel ProvinsiEditId;
    private javax.swing.JLabel ProvinsiEditIdLabel;
    private javax.swing.JLabel ProvinsiEditNameLabel;
    private javax.swing.JTextField ProvinsiEditNameTf;
    private javax.swing.JPanel ProvinsiEditPanel;
    private javax.swing.JLabel ProvinsiEditPopulationsLabel;
    private javax.swing.JTextField ProvinsiEditPopulationsTf;
    private javax.swing.JPanel ProvinsiPanel;
    private javax.swing.JTable ProvinsiTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
