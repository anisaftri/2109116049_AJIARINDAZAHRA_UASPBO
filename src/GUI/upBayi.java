
package GUI;

import controllers.Bayi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class upBayi extends javax.swing.JFrame {
    Bayi B1;
    int id;

    public upBayi(int id) throws ClassNotFoundException, SQLException {
        B1 = new Bayi();
        this.id = id;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formNama = new javax.swing.JTextField();
        formOrtu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formUsia = new javax.swing.JTextField();
        upData = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formAlergi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        formNama.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaActionPerformed(evt);
            }
        });
        getContentPane().add(formNama);
        formNama.setBounds(620, 180, 220, 22);

        formOrtu.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formOrtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formOrtuActionPerformed(evt);
            }
        });
        getContentPane().add(formOrtu);
        formOrtu.setBounds(620, 240, 220, 22);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Update Bayi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 100, 170, 30);

        formUsia.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formUsiaActionPerformed(evt);
            }
        });
        getContentPane().add(formUsia);
        formUsia.setBounds(620, 310, 220, 22);

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
        upData.setBounds(200, 440, 92, 27);

        cancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 102, 51));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(750, 440, 92, 27);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Masukkan Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 170, 160, 30);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Masukkan Parent");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 240, 170, 20);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 51));
        jLabel4.setText("Masukkan Usia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 300, 170, 30);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 51));
        jLabel5.setText("Masukkan Alergi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 380, 170, 20);

        formAlergi.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        formAlergi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlergiActionPerformed(evt);
            }
        });
        getContentPane().add(formAlergi);
        formAlergi.setBounds(620, 370, 220, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/UPDATE.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNamaActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         try {
            DataBayi m1 = new DataBayi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            new DataBayi().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(upBayi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(upBayi.class.getName()).log(Level.SEVERE, null, ex);
        }                               
    }//GEN-LAST:event_cancelActionPerformed

    private void formOrtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formOrtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formOrtuActionPerformed

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
            String hb = formNama.getText();
            String jb = formOrtu.getText();
            String kb = formUsia.getText();
            String al = formAlergi.getText();

            B1.updatebayi(id, hb, jb,kb, al);
            
            JOptionPane.showMessageDialog(null, "UBAH DATA BERHASIL");

            new ListMenu().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UBAH DATA GAGAL");
            try {
                new upBayi(id).setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(upBayi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(upBayi.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_upDataMouseClicked

    private void formAlergiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlergiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formAlergiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAlergi;
    private javax.swing.JTextField formNama;
    private javax.swing.JTextField formOrtu;
    private javax.swing.JTextField formUsia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton upData;
    // End of variables declaration//GEN-END:variables
}
