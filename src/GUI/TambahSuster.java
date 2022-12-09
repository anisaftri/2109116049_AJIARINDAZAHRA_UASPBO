package GUI;

import controllers.Suster;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TambahSuster extends javax.swing.JFrame {
    Suster b1;

    public TambahSuster() throws ClassNotFoundException, SQLException {
        b1 = new Suster();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formNama = new javax.swing.JTextField();
        formAlamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formUsia = new javax.swing.JTextField();
        addDatas = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formLK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        formNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaActionPerformed(evt);
            }
        });
        getContentPane().add(formNama);
        formNama.setBounds(460, 150, 390, 30);

        formAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(formAlamat);
        formAlamat.setBounds(460, 212, 390, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/data suster.png"))); // NOI18N
        jLabel1.setText("TAMBAH SUSTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 90, 240, 40);

        formUsia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formUsiaActionPerformed(evt);
            }
        });
        getContentPane().add(formUsia);
        formUsia.setBounds(460, 280, 390, 40);

        addDatas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        addDatas.setForeground(new java.awt.Color(204, 0, 0));
        addDatas.setText("Tambah");
        addDatas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDatasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDatasMouseEntered(evt);
            }
        });
        addDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDatasActionPerformed(evt);
            }
        });
        getContentPane().add(addDatas);
        addDatas.setBounds(190, 420, 92, 27);

        cancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(204, 0, 0));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(750, 420, 92, 27);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 150, 130, 40);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 210, 120, 40);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Usia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 280, 150, 40);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Durasi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 350, 120, 40);

        formLK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formLKActionPerformed(evt);
            }
        });
        getContentPane().add(formLK);
        formLK.setBounds(460, 352, 390, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/TAMBAH.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1030, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNamaActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void formAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formAlamatActionPerformed

    private void formUsiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formUsiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formUsiaActionPerformed

    private void addDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasActionPerformed

    private void addDatasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasMouseEntered

    private void addDatasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseClicked
        try {   
            String hb = formNama.getText();
            String jb = formAlamat.getText();
            String kb = formUsia.getText();
            String al = formLK.getText();

            try {
                b1.insertSuster(hb, jb, kb, al);
            } catch (SQLException ex) {
                Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");

            try {
                new DataSuster().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "TAMBAH DATA GAGAL");
            try {
                new TambahSuster().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_addDatasMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
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
            Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahSuster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void formLKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formLKActionPerformed

    }//GEN-LAST:event_formLKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDatas;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAlamat;
    private javax.swing.JTextField formLK;
    private javax.swing.JTextField formNama;
    private javax.swing.JTextField formUsia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
