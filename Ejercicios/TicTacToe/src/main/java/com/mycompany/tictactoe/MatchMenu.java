/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.LinkedHashMap;

/**
 *
 * @author xdpor
 */
public class MatchMenu extends javax.swing.JFrame {
    private final boolean isVSMachine;

    /**
     * Creates new form MatchMenu
     * @param isVSMachine
     */
    public MatchMenu(boolean isVSMachine) {
        initComponents();
        this.isVSMachine = isVSMachine;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Button2OutOf3Game = new javax.swing.JButton();
        ButtonDeathMatchGame = new javax.swing.JButton();
        ButtonUniqueGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(167, 300));
        setMinimumSize(new java.awt.Dimension(167, 300));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("TicTacToe");
        Title.setEnabled(false);

        Button2OutOf3Game.setBackground(new java.awt.Color(0, 0, 0));
        Button2OutOf3Game.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button2OutOf3Game.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        Button2OutOf3Game.setText("2 Out Of 3");
        Button2OutOf3Game.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button2OutOf3Game.setBorderPainted(false);
        Button2OutOf3Game.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2OutOf3Game.setFocusPainted(false);
        Button2OutOf3Game.setFocusable(false);
        Button2OutOf3Game.setOpaque(true);
        Button2OutOf3Game.setPreferredSize(new java.awt.Dimension(106, 50));
        Button2OutOf3Game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2OutOf3GameActionPerformed(evt);
            }
        });

        ButtonDeathMatchGame.setBackground(new java.awt.Color(0, 0, 0));
        ButtonDeathMatchGame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonDeathMatchGame.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        ButtonDeathMatchGame.setText("DeathMatch");
        ButtonDeathMatchGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonDeathMatchGame.setBorderPainted(false);
        ButtonDeathMatchGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDeathMatchGame.setFocusPainted(false);
        ButtonDeathMatchGame.setFocusable(false);
        ButtonDeathMatchGame.setOpaque(true);
        ButtonDeathMatchGame.setPreferredSize(new java.awt.Dimension(106, 50));
        ButtonDeathMatchGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeathMatchGameActionPerformed(evt);
            }
        });

        ButtonUniqueGame.setBackground(new java.awt.Color(0, 0, 0));
        ButtonUniqueGame.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonUniqueGame.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        ButtonUniqueGame.setText("Unique Game");
        ButtonUniqueGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonUniqueGame.setBorderPainted(false);
        ButtonUniqueGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonUniqueGame.setFocusPainted(false);
        ButtonUniqueGame.setFocusable(false);
        ButtonUniqueGame.setOpaque(true);
        ButtonUniqueGame.setPreferredSize(new java.awt.Dimension(106, 50));
        ButtonUniqueGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUniqueGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonUniqueGame, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2OutOf3Game, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDeathMatchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Title)
                .addGap(26, 26, 26)
                .addComponent(ButtonUniqueGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button2OutOf3Game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonDeathMatchGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button2OutOf3GameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2OutOf3GameActionPerformed
        this.dispose();
        new MatchView("2 out of 3", isVSMachine, new LinkedHashMap<>() {{
            put(1, new Player("Juan"));
            put(2, new Player(isVSMachine ? "Machine" : "Pedro"));
        }}).setVisible(true);
    }//GEN-LAST:event_Button2OutOf3GameActionPerformed

    private void ButtonDeathMatchGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeathMatchGameActionPerformed
        this.dispose();
        new MatchView("deathmatch", isVSMachine, new LinkedHashMap<>() {{
            put(1, new Player("Juan"));
            put(2, new Player(isVSMachine ? "Machine" : "Pedro"));
        }}).setVisible(true);
    }//GEN-LAST:event_ButtonDeathMatchGameActionPerformed

    private void ButtonUniqueGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUniqueGameActionPerformed
        this.dispose();
        new MatchView("unique", isVSMachine, new LinkedHashMap<>() {{
            put(1, new Player("Juan"));
            put(2, new Player(isVSMachine ? "Machine" : "Pedro"));
        }}).setVisible(true);
    }//GEN-LAST:event_ButtonUniqueGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button2OutOf3Game;
    private javax.swing.JButton ButtonDeathMatchGame;
    private javax.swing.JButton ButtonUniqueGame;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
