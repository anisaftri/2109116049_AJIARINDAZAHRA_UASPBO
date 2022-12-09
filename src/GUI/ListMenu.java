package GUI;

import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ListMenu extends javax.swing.JFrame {

    public ListMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DataBayi = new javax.swing.JButton();
        DataParents = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DataSuster = new javax.swing.JButton();
        DataAlergi = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 70, 100, 32);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Kelola Data Bayi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 180, 170, 30);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Kelola Data Orang Tua");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 250, 220, 22);

        DataBayi.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        DataBayi.setForeground(new java.awt.Color(0, 102, 51));
        DataBayi.setText("Mulai");
        DataBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBayiMouseClicked(evt);
            }
        });
        DataBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBayiActionPerformed(evt);
            }
        });
        getContentPane().add(DataBayi);
        DataBayi.setBounds(760, 180, 100, 40);

        DataParents.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        DataParents.setForeground(new java.awt.Color(0, 102, 51));
        DataParents.setText("Mulai");
        DataParents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataParentsMouseClicked(evt);
            }
        });
        DataParents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataParentsActionPerformed(evt);
            }
        });
        getContentPane().add(DataParents);
        DataParents.setBounds(760, 240, 100, 40);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Kelola Data Suster");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 320, 200, 22);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Informasi Alergi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 390, 170, 20);

        DataSuster.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        DataSuster.setForeground(new java.awt.Color(0, 102, 51));
        DataSuster.setText("Mulai");
        DataSuster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataSusterMouseClicked(evt);
            }
        });
        DataSuster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataSusterActionPerformed(evt);
            }
        });
        getContentPane().add(DataSuster);
        DataSuster.setBounds(760, 310, 100, 40);

        DataAlergi.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        DataAlergi.setForeground(new java.awt.Color(0, 102, 51));
        DataAlergi.setText("Mulai");
        DataAlergi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataAlergiMouseClicked(evt);
            }
        });
        DataAlergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataAlergiActionPerformed(evt);
            }
        });
        getContentPane().add(DataAlergi);
        DataAlergi.setBounds(760, 380, 100, 40);

        jToggleButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 102, 51));
        jToggleButton1.setText("LOGOUT");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(420, 460, 220, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/MENU.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataBayiActionPerformed

    private void DataParentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataParentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataParentsActionPerformed

    private void DataSusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataSusterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataSusterActionPerformed

    private void DataAlergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataAlergiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataAlergiActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void DataBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBayiMouseClicked
        try {
            new DataBayi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        
    }//GEN-LAST:event_DataBayiMouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        JOptionPane.showMessageDialog(null, "ANDA AKAN LOGOUT");
        try {
            new Login().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void DataParentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataParentsMouseClicked
        try {
            new DataParents().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DataParentsMouseClicked

    private void DataSusterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataSusterMouseClicked
        try {
            new DataSuster().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DataSusterMouseClicked

    private void DataAlergiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataAlergiMouseClicked
       try {
            new DataAlergi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ListMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_DataAlergiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataAlergi;
    private javax.swing.JButton DataBayi;
    private javax.swing.JButton DataParents;
    private javax.swing.JButton DataSuster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
