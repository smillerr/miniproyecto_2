/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Juan Sebastian
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnWhatFor = new javax.swing.JButton();
        btnJuego = new javax.swing.JButton();
        btnHowTo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 56)); // NOI18N
        jLabel1.setText("MEMORABLE");

        btnWhatFor.setText("¿Para qué sirve?");
        btnWhatFor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnWhatFor.setMaximumSize(new java.awt.Dimension(30, 18));
        btnWhatFor.setMinimumSize(new java.awt.Dimension(30, 18));
        btnWhatFor.setPreferredSize(new java.awt.Dimension(30, 18));
        btnWhatFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatForActionPerformed(evt);
            }
        });

        btnJuego.setText("Jugar");
        btnJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });

        btnHowTo.setText("¿Cómo jugar?");
        btnHowTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHowTo.setMaximumSize(new java.awt.Dimension(30, 18));
        btnHowTo.setMinimumSize(new java.awt.Dimension(30, 18));
        btnHowTo.setPreferredSize(new java.awt.Dimension(30, 18));
        btnHowTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnWhatFor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(btnHowTo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHowTo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWhatFor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        //Codigo cuando se ejecuta el boton Jugar
        Juego newJuego = new Juego();
        newJuego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnWhatForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatForActionPerformed
        //Codigo cuando se ejecuta el boton, ¿Para que sirve?
        WhatFor newWhatFor = new WhatFor();
        newWhatFor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnWhatForActionPerformed

    private void btnHowToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowToActionPerformed
        //Codigo cuando se ejecuta el boton, ¿Como jugar? 
    
        HowToPlay newHowToPlay = new HowToPlay();
        newHowToPlay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHowToActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHowTo;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton btnWhatFor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
