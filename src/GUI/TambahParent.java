
package GUI;

import controllers.Parent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TambahParent extends javax.swing.JFrame {
    Parent b1;

    public TambahParent() throws ClassNotFoundException, SQLException {
        b1 = new Parent();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formNama = new javax.swing.JTextField();
        formAlamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addDatas = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        formGen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        formNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaActionPerformed(evt);
            }
        });
        getContentPane().add(formNama);
        formNama.setBounds(420, 152, 430, 30);

        formAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(formAlamat);
        formAlamat.setBounds(420, 220, 430, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/data parents.png"))); // NOI18N
        jLabel1.setText("Tambah Orang Tua");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 80, 250, 50);

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
        addDatas.setBounds(190, 350, 120, 27);

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
        cancel.setBounds(740, 350, 110, 27);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/nama.png"))); // NOI18N
        jLabel2.setText("Nama");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 150, 120, 40);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/alamat.png"))); // NOI18N
        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 220, 160, 30);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gender.png"))); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 290, 120, 20);

        formGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formGenActionPerformed(evt);
            }
        });
        getContentPane().add(formGen);
        formGen.setBounds(420, 282, 430, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/TAMBAH.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 590);

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

    private void addDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasActionPerformed

    private void addDatasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasMouseEntered
//untuk cancel
    private void addDatasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseClicked
        try{    
            String hb = formNama.getText();
            String jb = formAlamat.getText();
            String al = formGen.getText();
//objek inisialisasi dilakukan secara langsung karena methodvoid
            try {
                
                b1.insertParent(hb, jb, al);
            } catch (SQLException ex) {
                
                Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");

            try {
                new DataParents().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "TAMBAH DATA GAGAL");
            try {
                new TambahParent().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_addDatasMouseClicked
//untuk cancel
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
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
            Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahParent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void formGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formGenActionPerformed

    }//GEN-LAST:event_formGenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDatas;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAlamat;
    private javax.swing.JTextField formGen;
    private javax.swing.JTextField formNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
