/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ganga
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    private JFrame frame;
    private int xCount1=0;
    private int oCount2=0;
    private String startGame="X";
    private int b1=10;
    private int b2=10;
    private int b3=10;
    private int b4=10;
    private int b5=10;
    private int b6=10;
    private int b7=10;
    private int b8=10;
    private int b9=10;
    private int i=0;
    
    public TicTacToe() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";       
        }
    }
    
    private void winningGame()
    {
        //for Player X
        if(b1==1 && b2==1 && b3==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b4==1 && b5==1 && b6==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b7==1 && b8==1 && b9==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b1==1 && b4==1 && b7==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b2==1 && b5==1 && b8==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b3==1 && b6==1 && b9==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b1==1 && b5==1 && b9==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b3==1 && b5==1 && b7==1)
        {
            JOptionPane.showMessageDialog(frame, "Player X Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        //for Player O
        else if(b1==0 && b2==0 && b3==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b4==0 && b5==0 && b6==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b7==0 && b8==0 && b9==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b1==0 && b4==0 && b7==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b2==0 && b5==0 && b8==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b3==0 && b6==0 && b9==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b1==0 && b5==0 && b9==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(b3==0 && b5==0 && b7==0)
        {
            JOptionPane.showMessageDialog(frame, "Player O Wins!!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
        //in-case no one wins
        else if(i==9)
        {
            JOptionPane.showMessageDialog(frame, "It was a draw!","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        btn_2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_2.setForeground(Color.RED);
            b2=1;
            i++;
        }
        else
        {
            btn_2.setForeground(Color.BLUE);
            b2=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        btn_1.setText(null);
        btn_2.setText(null);
        btn_3.setText(null);
        btn_4.setText(null);
        btn_5.setText(null);
        btn_6.setText(null);
        btn_7.setText(null);
        btn_8.setText(null);
        btn_9.setText(null);
        b1=10;
        b2=10;
        b3=10;
        b4=10;
        b5=10;
        b6=10;
        b7=10;
        b8=10;
        b9=10;
        i=0;
        
        
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        btn_1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_1.setForeground(Color.RED);
            b1=1;
            i++;
        }
        else
        {
            btn_1.setForeground(Color.BLUE);
            b1=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        btn_3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_3.setForeground(Color.RED);
            b3=1;
            i++;
        }
        else
        {
            btn_3.setForeground(Color.BLUE);
            b3=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        btn_4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_4.setForeground(Color.RED);
            b4=1;
            i++;
        }
        else
        {
            btn_4.setForeground(Color.BLUE);
            b4=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        btn_5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_5.setForeground(Color.RED);
            b5=1;
            i++;
        }
        else
        {
            btn_5.setForeground(Color.BLUE);
            b5=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        btn_6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_6.setForeground(Color.RED);
            b6=1;
            i++;
        }
        else
        {
            btn_6.setForeground(Color.BLUE);
            b6=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        btn_7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_7.setForeground(Color.RED);
            b7=1;
            i++;
        }
        else
        {
            btn_7.setForeground(Color.BLUE);
            b7=0;
            i++;
            
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        btn_8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_8.setForeground(Color.RED);
            b8=1;
            i++;
        }
        else
        {
            btn_8.setForeground(Color.BLUE);
            b8=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        btn_9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            btn_9.setForeground(Color.RED);
            b9=1;
            i++;
        }
        else
        {
            btn_9.setForeground(Color.BLUE);
            b9=0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn_9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_reset;
    // End of variables declaration//GEN-END:variables
}
