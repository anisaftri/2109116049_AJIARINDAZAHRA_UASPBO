package GUI;
import javax.swing.*;
import controllers.Alergi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DataAlergi extends javax.swing.JFrame {
    Alergi B1;


    public DataAlergi() throws ClassNotFoundException, SQLException {
        B1 = new Alergi();
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
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tbData.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        tbData.setForeground(new java.awt.Color(204, 0, 0));
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Alergi", "Cara Penanganan"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 170, 670, 280);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("DATA ALERGI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 70, 240, 50);

        back.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 0));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(430, 480, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/default data.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       new ListMenu().setVisible(true);

       
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            B1.showAlergi(),
            new String [] {
                "Nama", "Cara Penanganan"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables
}
