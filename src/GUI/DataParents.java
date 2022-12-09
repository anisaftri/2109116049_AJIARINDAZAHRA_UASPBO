package GUI;
import javax.swing.*;
import controllers.Parent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataParents extends javax.swing.JFrame {
    Parent B1;

    public DataParents() throws ClassNotFoundException, SQLException {
        B1 = new Parent();
        initComponents();
        this.showData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Gender"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 170, 660, 270);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("DATA PARENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 110, 180, 60);

        addData.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        addData.setForeground(new java.awt.Color(153, 0, 0));
        addData.setText("Add");
        addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataMouseClicked(evt);
            }
        });
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });
        getContentPane().add(addData);
        addData.setBounds(440, 460, 90, 50);

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 460, 110, 50);

        back.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 0));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(690, 460, 120, 50);

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Delete");
        jButton2.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jButton2AncestorResized(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 460, 90, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/default data.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDataActionPerformed

    private void addDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseClicked
        try {
            new TambahParent().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBayi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBayi.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_addDataMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try{ 
            String nama = JOptionPane.showInputDialog("Masukan Nama : ", null); 
            if (nama == null) { 
                try { 
                    new DataParents().setVisible(true); 
                } catch (ClassNotFoundException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                this.dispose(); 
            } else { 
                try { 
                    B1.deleteParent(nama); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                try { 
                    this.showData(); 
                } catch (SQLException e) {  
                    e.printStackTrace(); 
                } 
            } 
        } catch (Exception e) { 
            try { 
                new DataParents().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose(); 
        } 
    }//GEN-LAST:event_jButton2MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new ListMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{ 
            String nama = JOptionPane.showInputDialog("Masukan Nama : "); 
            this.dispose();
            if (nama == null) { 
                try { 
                    new DataParents().setVisible(true); 
                } catch (ClassNotFoundException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                this.dispose(); 
            } else { 
                try {
                    new upParent(nama).setVisible(true); 
                } catch (SQLException ex) { 
                    Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex); 
                } 
                try { 
                    this.showData(); 
                } catch (SQLException e) { 
                    // TODO Auto-generated catch block 
                    e.printStackTrace(); 
                } 
            } 
        } catch (Exception e) { 
            try { 
                new DataParents().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DataParents.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose(); 
        } 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jButton2AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorResized

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            B1.showParent(),
            new String [] {
                "Nama", "Alamat", "Gender"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables
}
