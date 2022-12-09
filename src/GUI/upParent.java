
package GUI;

import controllers.Parent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class upParent extends javax.swing.JFrame {
    Parent B1;
    String nama;

    public upParent(String nama) throws ClassNotFoundException, SQLException {
        B1 = new Parent();
        this.nama = nama;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formAlamats = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formGender = new javax.swing.JTextField();
        upData = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        formAlamats.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formAlamats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlamatsActionPerformed(evt);
            }
        });
        getContentPane().add(formAlamats);
        formAlamats.setBounds(630, 170, 220, 22);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Update Orang Tua");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 100, 280, 30);

        formGender.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formGenderActionPerformed(evt);
            }
        });
        getContentPane().add(formGender);
        formGender.setBounds(620, 240, 230, 22);

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
        upData.setBounds(190, 440, 92, 27);

        cancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 102, 51));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(760, 440, 92, 27);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Masukkan Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 170, 190, 30);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Masukkan Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 240, 190, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/UPDATE.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         try {
            DataParents m1 = new DataParents();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            new DataParents().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(upParent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(upParent.class.getName()).log(Level.SEVERE, null, ex);
        }                             
    }//GEN-LAST:event_cancelActionPerformed

    private void formAlamatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlamatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formAlamatsActionPerformed

    private void formGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formGenderActionPerformed

    private void upDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataActionPerformed

    private void upDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_upDataMouseEntered

    private void upDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upDataMouseClicked
        try {    
            String hb = formAlamats.getText();
            String jb = formGender.getText();

            try {
                B1.updateParent(nama, hb, jb);
            } catch (SQLException ex) {
                Logger.getLogger(upParent.class.getName()).log(Level.SEVERE, null, ex);
            }


            JOptionPane.showMessageDialog(null, "UBAH DATA BERHASIL");


            new ListMenu().setVisible(true);
           
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "UBAH DATA GAGAL");
            try {
                new upParent(nama).setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(upParent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(upParent.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_upDataMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAlamats;
    private javax.swing.JTextField formGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton upData;
    // End of variables declaration//GEN-END:variables
}
