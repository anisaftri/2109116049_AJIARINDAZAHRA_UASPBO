
package GUI;


import controllers.Suster;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class upSuster extends javax.swing.JFrame {
    Suster B1;
    String nama;


    public upSuster(String nama) throws ClassNotFoundException, SQLException {
        B1 = new Suster();
        this.nama = nama;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formAlamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formUsia = new javax.swing.JTextField();
        upData = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formRentang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        formAlamat.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(formAlamat);
        formAlamat.setBounds(700, 170, 160, 22);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Update Suster");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 100, 180, 30);

        formUsia.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formUsiaActionPerformed(evt);
            }
        });
        getContentPane().add(formUsia);
        formUsia.setBounds(700, 240, 160, 22);

        upData.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        upData.setForeground(new java.awt.Color(0, 102, 51));
        upData.setText("Ubah");
        upData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upDataMouseEntered(evt);
            }
        });
        upData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDataActionPerformed(evt);
            }
        });
        getContentPane().add(upData);
        upData.setBounds(190, 430, 92, 40);

        cancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 102, 51));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(770, 430, 92, 27);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Masukkan Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 170, 190, 22);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Masukkan Usia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 240, 170, 22);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Masukkan Durasi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 310, 170, 22);

        formRentang.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formRentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formRentangActionPerformed(evt);
            }
        });
        getContentPane().add(formRentang);
        formRentang.setBounds(700, 300, 160, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/UPDATE.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         try {
            DataSuster m1 = new DataSuster();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            new DataSuster().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(upSuster.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(upSuster.class.getName()).log(Level.SEVERE, null, ex);
        }                             
    }//GEN-LAST:event_cancelActionPerformed

    private void formAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formAlamatActionPerformed

    private void formUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formUsiaActionPerformed

    private void upDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataActionPerformed

    private void upDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataMouseEntered

    private void upDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseClicked
        try {
            String hb = formAlamat.getText();
            String jb = formUsia.getText();
            String kb = formRentang.getText();

            try {
                B1.updateSuster(nama, hb, jb, kb);
            } catch (SQLException ex) {
                Logger.getLogger(upSuster.class.getName()).log(Level.SEVERE, null, ex);
            }


            JOptionPane.showMessageDialog(null, "UBAH DATA BERHASIL");

            new ListMenu().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UBAH DATA GAGAL");
            try {
                new upSuster(nama).setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(upSuster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(upSuster.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_upDataMouseClicked

    private void formRentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formRentangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formRentangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAlamat;
    private javax.swing.JTextField formRentang;
    private javax.swing.JTextField formUsia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton upData;
    // End of variables declaration//GEN-END:variables
}
