/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.hibernate.gui;

import java.awt.CardLayout;

/**
 *
 * @author Tsila
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private  PatientPanel patientPanel;
    private  MedecinPanel medecinPanel;
    private  VisiterPanel visiterPanel;
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        patientPanel = new PatientPanel();
        medecinPanel = new MedecinPanel();
        visiterPanel = new VisiterPanel();
        
        panelContent.setLayout(new CardLayout());
        panelContent.add(patientPanel,"Patient");
        panelContent.add(medecinPanel,"Medecin");
        panelContent.add(visiterPanel,"Visiter");
        CardLayout layout = (CardLayout) panelContent.getLayout();
        layout.show(panelContent,"Patient");
        
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
        PatientBtn = new javax.swing.JToggleButton();
        VisiterBtn = new javax.swing.JToggleButton();
        MedecinBtn = new javax.swing.JToggleButton();
        panelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientBtn.setLabel("Patient");
        PatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientBtnActionPerformed(evt);
            }
        });

        VisiterBtn.setText("Visiter");
        VisiterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisiterBtnActionPerformed(evt);
            }
        });

        MedecinBtn.setText("Médecin");
        MedecinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedecinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PatientBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VisiterBtn)
                .addGap(18, 18, 18)
                .addComponent(MedecinBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientBtn)
                    .addComponent(VisiterBtn)
                    .addComponent(MedecinBtn))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panelContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContent.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientBtnActionPerformed
        CardLayout layout = (CardLayout) panelContent.getLayout();
        layout.show(panelContent,"Patient");// TODO add your handling code here:
    }//GEN-LAST:event_PatientBtnActionPerformed

    private void VisiterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisiterBtnActionPerformed
        CardLayout layout = (CardLayout) panelContent.getLayout();
        layout.show(panelContent,"Visiter");        
// TODO add your handling code here:
    }//GEN-LAST:event_VisiterBtnActionPerformed

    private void MedecinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedecinBtnActionPerformed
        CardLayout layout = (CardLayout) panelContent.getLayout();
        layout.show(panelContent,"Medecin");
        // TODO add your handling code here:
    }//GEN-LAST:event_MedecinBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton MedecinBtn;
    private javax.swing.JToggleButton PatientBtn;
    private javax.swing.JToggleButton VisiterBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}
