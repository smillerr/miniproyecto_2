/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
//import rsscaleLabel; 

import javax.swing.JLabel;

/**
 *
 * @author Juan Sebastian
 */
public class MainWindow extends javax.swing.JFrame {
    /**
     * Creates new form View
     */
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondoLabel, "src/Figuras/Fondo/fondoGUI.png");
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
        jLabel1 = new javax.swing.JLabel();
        btnWhatFor = new javax.swing.JButton();
        btnJuego = new javax.swing.JButton();
        btnHowTo = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEMORABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 96));

        btnWhatFor.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        btnWhatFor.setForeground(new java.awt.Color(255, 255, 255));
        btnWhatFor.setText("¿Para qué sirve?");
        btnWhatFor.setBorder(null);
        btnWhatFor.setBorderPainted(false);
        btnWhatFor.setContentAreaFilled(false);
        btnWhatFor.setFocusPainted(false);
        btnWhatFor.setMaximumSize(new java.awt.Dimension(30, 18));
        btnWhatFor.setMinimumSize(new java.awt.Dimension(30, 18));
        btnWhatFor.setPreferredSize(new java.awt.Dimension(30, 18));
        btnWhatFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatForActionPerformed(evt);
            }
        });
        getContentPane().add(btnWhatFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 60));

        btnJuego.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        btnJuego.setForeground(new java.awt.Color(255, 255, 255));
        btnJuego.setText("Jugar");
        btnJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnJuego.setBorderPainted(false);
        btnJuego.setContentAreaFilled(false);
        btnJuego.setFocusPainted(false);
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 132, 60));

        btnHowTo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 36)); // NOI18N
        btnHowTo.setForeground(new java.awt.Color(255, 255, 255));
        btnHowTo.setText("¿Cómo jugar?");
        btnHowTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHowTo.setBorderPainted(false);
        btnHowTo.setContentAreaFilled(false);
        btnHowTo.setFocusPainted(false);
        btnHowTo.setMaximumSize(new java.awt.Dimension(30, 18));
        btnHowTo.setMinimumSize(new java.awt.Dimension(30, 18));
        btnHowTo.setPreferredSize(new java.awt.Dimension(30, 18));
        btnHowTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToActionPerformed(evt);
            }
        });
        getContentPane().add(btnHowTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 180, 60));
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 361));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        //Codigo cuando se ejecuta el boton Jugar
        BeforeGame newJuego = new BeforeGame();
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
    /*private void setImagenFondo(JLabel fondoLabel, stru) {                                         
        //Codigo cuando se ejecuta el boton, ¿Como jugar? 
    
        HowToPlay newHowToPlay = new HowToPlay();
        newHowToPlay.setVisible(true);
        this.dispose();
    }   */          
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHowTo;
    private javax.swing.JButton btnJuego;
    private javax.swing.JButton btnWhatFor;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
