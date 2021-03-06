/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tebak_Kata;

import DBKon.koneksi;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Failed_Stage extends javax.swing.JFrame {
koneksi kon;
int skor = 0;
static String username = Tebak_Kata.MainMenu.username;
    /**
     * Creates new form Failed_Stage
     */
    public Failed_Stage(int skor) {
        initComponents();
        kon = new koneksi();
        this.skor = skor;
        jSelamat.setText(getUser());
        jSkor.setText(""+skor);
        try{
            String ubah = "update tebak_kata set skor = '"+skor+"' where user = '"+getUser()+"'";
            Statement st = kon.con.createStatement();
            st.executeUpdate(ubah);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static String getUser(){
        String temp2 = Tebak_Kata.MainMenu.username;
        username = "";
        return temp2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnPlayAgain1 = new javax.swing.JLabel();
        jBtnPlayAgain2 = new javax.swing.JLabel();
        jBtnExit1 = new javax.swing.JLabel();
        jBtnExit2 = new javax.swing.JLabel();
        jSelamat = new javax.swing.JLabel();
        jSkor = new javax.swing.JLabel();
        jScore1 = new javax.swing.JLabel();
        jScore2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnPlayAgain1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jBtnPlayAgain1.setForeground(new java.awt.Color(255, 153, 51));
        jBtnPlayAgain1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnPlayAgain1.setText("Play Again");
        jBtnPlayAgain1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPlayAgain1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnPlayAgain1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnPlayAgain1MouseExited(evt);
            }
        });
        jPanel1.add(jBtnPlayAgain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 165, 48));

        jBtnPlayAgain2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jBtnPlayAgain2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnPlayAgain2.setText("Play Again");
        jBtnPlayAgain2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPlayAgain2MouseClicked(evt);
            }
        });
        jPanel1.add(jBtnPlayAgain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 165, 48));

        jBtnExit1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jBtnExit1.setForeground(new java.awt.Color(255, 153, 51));
        jBtnExit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnExit1.setText("Exit");
        jBtnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnExit1MouseExited(evt);
            }
        });
        jPanel1.add(jBtnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 166, 48));

        jBtnExit2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jBtnExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBtnExit2.setText("Exit");
        jPanel1.add(jBtnExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 166, 48));

        jSelamat.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 36)); // NOI18N
        jSelamat.setForeground(new java.awt.Color(7, 3, 3));
        jSelamat.setMaximumSize(new java.awt.Dimension(450, 50));
        jPanel1.add(jSelamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, 40));

        jSkor.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 36)); // NOI18N
        jPanel1.add(jSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 110, 40));

        jScore1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jScore1.setForeground(new java.awt.Color(255, 153, 51));
        jScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScore1.setText("All Scores");
        jScore1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScore1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScore1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jScore1MouseExited(evt);
            }
        });
        jPanel1.add(jScore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 166, 48));

        jScore2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScore2.setText("All Scores");
        jScore2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScore2MouseClicked(evt);
            }
        });
        jPanel1.add(jScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 166, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Kata/img/Game Over Tebak Gambar.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPlayAgain1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPlayAgain1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_jBtnPlayAgain1MouseClicked

    private void jBtnPlayAgain1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPlayAgain1MouseEntered
        // TODO add your handling code here:
        jBtnPlayAgain1.setVisible(false);
        jBtnPlayAgain2.setVisible(true);
    }//GEN-LAST:event_jBtnPlayAgain1MouseEntered

    private void jBtnPlayAgain1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPlayAgain1MouseExited
        // TODO add your handling code here:
        jBtnPlayAgain1.setVisible(true);
        jBtnPlayAgain2.setVisible(false);
    }//GEN-LAST:event_jBtnPlayAgain1MouseExited

    private void jBtnPlayAgain2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPlayAgain2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_jBtnPlayAgain2MouseClicked

    private void jBtnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExit1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu.MainMenu().setVisible(true);
    }//GEN-LAST:event_jBtnExit1MouseClicked

    private void jBtnExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExit1MouseEntered
        // TODO add your handling code here:
        jBtnExit1.setVisible(false);
        jBtnExit2.setVisible(true);
    }//GEN-LAST:event_jBtnExit1MouseEntered

    private void jBtnExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExit1MouseExited
        // TODO add your handling code here:
        jBtnExit1.setVisible(true);
        jBtnExit2.setVisible(false);
    }//GEN-LAST:event_jBtnExit1MouseExited

    private void jScore1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScore1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Peringkat(skor).setVisible(true);
    }//GEN-LAST:event_jScore1MouseClicked

    private void jScore1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScore1MouseEntered
        // TODO add your handling code here:
        jScore1.setVisible(false);
        jScore2.setVisible(true);
    }//GEN-LAST:event_jScore1MouseEntered

    private void jScore1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScore1MouseExited
        // TODO add your handling code here:
        jScore1.setVisible(true);
        jScore2.setVisible(false);
    }//GEN-LAST:event_jScore1MouseExited

    private void jScore2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScore2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Peringkat(skor).setVisible(true);
    }//GEN-LAST:event_jScore2MouseClicked

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
            java.util.logging.Logger.getLogger(Failed_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Failed_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Failed_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Failed_Stage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Failed_Stage(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBtnExit1;
    private javax.swing.JLabel jBtnExit2;
    private javax.swing.JLabel jBtnPlayAgain1;
    private javax.swing.JLabel jBtnPlayAgain2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jScore1;
    private javax.swing.JLabel jScore2;
    private javax.swing.JLabel jSelamat;
    private javax.swing.JLabel jSkor;
    // End of variables declaration//GEN-END:variables
}
