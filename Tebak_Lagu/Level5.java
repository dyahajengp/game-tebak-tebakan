/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tebak_Lagu;

/**
 *
 * @author USER
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Level5 extends javax.swing.JFrame {
    private static String filename1;
    private static Player player1;
    static int a = 0;
    int skor = 0;
    int c=2;
    /**
     * Creates new form Level2
     */
    public Level5(int skor) {
        initComponents();
        this.skor = skor;
        jhint.setVisible(false);
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
        jbtnPlay1 = new javax.swing.JLabel();
        jbtnPlay2 = new javax.swing.JLabel();
        jbtnA1 = new javax.swing.JLabel();
        jbtnA2 = new javax.swing.JLabel();
        jbtnB1 = new javax.swing.JLabel();
        jbtnB2 = new javax.swing.JLabel();
        jbtnC1 = new javax.swing.JLabel();
        jbtnC2 = new javax.swing.JLabel();
        jbtnD1 = new javax.swing.JLabel();
        jbtnD2 = new javax.swing.JLabel();
        jbtnHint1 = new javax.swing.JLabel();
        jbtnHint2 = new javax.swing.JLabel();
        jhint = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEBAK LAGU - LEVEL 5");

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPlay1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPlay1.setForeground(new java.awt.Color(255, 51, 51));
        jbtnPlay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnPlay1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Lagu/img/playLagu.png"))); // NOI18N
        jbtnPlay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPlay1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnPlay1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnPlay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 136, 90, 86));

        jbtnPlay2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPlay2.setForeground(new java.awt.Color(102, 102, 102));
        jbtnPlay2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnPlay2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Lagu/img/playLagu2.png"))); // NOI18N
        jbtnPlay2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPlay2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnPlay2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnPlay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 136, 90, 86));

        jbtnA1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnA1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnA1.setText("Empat Mata");
        jbtnA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnA1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnA1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 238, 625, 45));

        jbtnA2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnA2.setForeground(new java.awt.Color(255, 204, 102));
        jbtnA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnA2.setText("Empat Mata");
        jbtnA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnA2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnA2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 238, 625, 45));

        jbtnB1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnB1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnB1.setText("Dua Mata Saya");
        jbtnB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnB1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 308, 625, 45));

        jbtnB2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnB2.setForeground(new java.awt.Color(255, 204, 102));
        jbtnB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnB2.setText("Dua Mata Saya");
        jbtnB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnB2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnB2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 308, 625, 45));

        jbtnC1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnC1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnC1.setText("Mata Najwa");
        jbtnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnC1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 378, 625, 45));

        jbtnC2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnC2.setForeground(new java.awt.Color(255, 204, 102));
        jbtnC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnC2.setText("Mata Najwa");
        jbtnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnC2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnC2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 378, 625, 45));

        jbtnD1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnD1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnD1.setText("Cuci Mata");
        jbtnD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnD1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 448, 625, 45));

        jbtnD2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jbtnD2.setForeground(new java.awt.Color(255, 204, 102));
        jbtnD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnD2.setText("Cuci Mata");
        jbtnD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnD2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnD2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 448, 625, 45));

        jbtnHint1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtnHint1.setForeground(new java.awt.Color(255, 204, 102));
        jbtnHint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnHint1.setText("HINT");
        jbtnHint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnHint1MouseEntered(evt);
            }
        });
        jPanel1.add(jbtnHint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 519, 270, 28));

        jbtnHint2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jbtnHint2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHint2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnHint2.setText("HINT");
        jbtnHint2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnHint2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnHint2MouseExited(evt);
            }
        });
        jPanel1.add(jbtnHint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 519, 270, 28));

        jhint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Lagu/img/dua-mata-saya.png"))); // NOI18N
        jPanel1.add(jhint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 498, 340, 81));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tebak_Lagu/img/LvlTebakLagu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPlay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPlay1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPlay1MouseClicked

    private void jbtnPlay1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPlay1MouseEntered
        // TODO add your handling code here:
        jbtnPlay1.setVisible(false);
        jbtnPlay2.setVisible(true);
    }//GEN-LAST:event_jbtnPlay1MouseEntered

    private void jbtnPlay2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPlay2MouseClicked
        // TODO add your handling code here:
        if (a==0){
            try {
                FileInputStream fis = new FileInputStream("src/Tebak_Lagu/lagu/dua-mata-saya.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player1 = new Player(bis);
                a =1;
            }catch (FileNotFoundException | JavaLayerException e) {
                System.out.println("Problem playing file " + filename1);
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player1.play();
                    } catch (JavaLayerException e) {
                        System.out.println(e);
                    }
                }
            }.start();
        } else{
            player1.close();
            a=0;
            try {
                FileInputStream fis = new FileInputStream("src/Tebak_Lagu/lagu/dua-mata-saya.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player1 = new Player(bis);
                a =1;
            }catch (FileNotFoundException | JavaLayerException e) {
                System.out.println("Problem playing file " + filename1);
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player1.play();
                    } catch (JavaLayerException e) {
                        System.out.println(e);
                    }
                }
            }.start();
        }
    }//GEN-LAST:event_jbtnPlay2MouseClicked

    private void jbtnPlay2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPlay2MouseExited
        // TODO add your handling code here:
        jbtnPlay2.setVisible(false);
        jbtnPlay1.setVisible(true);
    }//GEN-LAST:event_jbtnPlay2MouseExited

    private void jbtnA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnA1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnA1MouseClicked

    private void jbtnA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnA1MouseEntered
        // TODO add your handling code here:
        jbtnA1.setVisible(false);
        jbtnA2.setVisible(true);
    }//GEN-LAST:event_jbtnA1MouseEntered

    private void jbtnA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnA2MouseClicked
        // TODO add your handling code here:
        if(c>1){
            --c;
            player1.close();
            JOptionPane.showMessageDialog(rootPane, "TRY AGAIN!");
        } else{
            player1.close();
            this.setVisible(false);
            new Failed_Stage(skor).setVisible(true);
        }

    }//GEN-LAST:event_jbtnA2MouseClicked

    private void jbtnA2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnA2MouseExited
        // TODO add your handling code here:
        jbtnA2.setVisible(false);
        jbtnA1.setVisible(true);
    }//GEN-LAST:event_jbtnA2MouseExited

    private void jbtnB1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnB1MouseEntered
        // TODO add your handling code here:
        jbtnB1.setVisible(false);
        jbtnB2.setVisible(true);
    }//GEN-LAST:event_jbtnB1MouseEntered

    private void jbtnB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnB2MouseClicked
        // TODO add your handling code here:
        player1.close();
        skor +=10;
        JOptionPane.showMessageDialog(rootPane, "CORRECT!\nSkor = "+skor);
        this.setVisible(false);
        new Level6(skor).setVisible(true);
        
    }//GEN-LAST:event_jbtnB2MouseClicked

    private void jbtnB2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnB2MouseExited
        // TODO add your handling code here:
        jbtnB2.setVisible(false);
        jbtnB1.setVisible(true);
    }//GEN-LAST:event_jbtnB2MouseExited

    private void jbtnC1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnC1MouseEntered
        // TODO add your handling code here:
        jbtnC1.setVisible(false);
        jbtnC2.setVisible(true);
    }//GEN-LAST:event_jbtnC1MouseEntered

    private void jbtnC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnC2MouseClicked
        // TODO add your handling code here:
        if(c>1){
            --c;
            player1.close();
            JOptionPane.showMessageDialog(rootPane, "TRY AGAIN!");
        } else{
            player1.close();
            this.setVisible(false);
            new Failed_Stage(skor).setVisible(true);
        }

    }//GEN-LAST:event_jbtnC2MouseClicked

    private void jbtnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnC2MouseExited
        // TODO add your handling code here:
        jbtnC2.setVisible(false);
        jbtnC1.setVisible(true);
    }//GEN-LAST:event_jbtnC2MouseExited

    private void jbtnD1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnD1MouseEntered
        // TODO add your handling code here:
        jbtnD1.setVisible(false);
        jbtnD2.setVisible(true);
    }//GEN-LAST:event_jbtnD1MouseEntered

    private void jbtnD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnD2MouseClicked
        // TODO add your handling code here:
        if(c>1){
            --c;
            player1.close();
            JOptionPane.showMessageDialog(rootPane, "TRY AGAIN!");
        } else{
            player1.close();
            this.setVisible(false);
            new Failed_Stage(skor).setVisible(true);
        }
    }//GEN-LAST:event_jbtnD2MouseClicked

    private void jbtnD2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnD2MouseExited
        // TODO add your handling code here:
        jbtnD2.setVisible(false);
        jbtnD1.setVisible(true);
    }//GEN-LAST:event_jbtnD2MouseExited

    private void jbtnHint1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHint1MouseEntered
        // TODO add your handling code here:
        jbtnHint1.setVisible(false);
        jbtnHint2.setVisible(true);
    }//GEN-LAST:event_jbtnHint1MouseEntered

    private void jbtnHint2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHint2MouseClicked
        // TODO add your handling code here:
        jhint.setVisible(true);
    }//GEN-LAST:event_jbtnHint2MouseClicked

    private void jbtnHint2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHint2MouseExited
        // TODO add your handling code here:
        jbtnHint2.setVisible(false);
        jbtnHint1.setVisible(true);
    }//GEN-LAST:event_jbtnHint2MouseExited

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
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level5(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbtnA1;
    private javax.swing.JLabel jbtnA2;
    private javax.swing.JLabel jbtnB1;
    private javax.swing.JLabel jbtnB2;
    private javax.swing.JLabel jbtnC1;
    private javax.swing.JLabel jbtnC2;
    private javax.swing.JLabel jbtnD1;
    private javax.swing.JLabel jbtnD2;
    private javax.swing.JLabel jbtnHint1;
    private javax.swing.JLabel jbtnHint2;
    private javax.swing.JLabel jbtnPlay1;
    private javax.swing.JLabel jbtnPlay2;
    private javax.swing.JLabel jhint;
    // End of variables declaration//GEN-END:variables
}
