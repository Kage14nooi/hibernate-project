/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.project.hibernate.gui;

import com.project.hibernate.dao.MedecinDAO;
import com.project.hibernate.entity.Medecin;
import javax.swing.JOptionPane;

/**
 *
 * @author Tsila
 */
public class JDialogMedecin extends javax.swing.JDialog {

    /**
     * Creates new form JDialogMedecin
     */
    //New
    private Medecin medecin = new Medecin();
    static String title = "";
    MedecinDAO medecinDAO = new MedecinDAO();
    
    public JDialogMedecin(java.awt.Frame parent, boolean modal,String title) {
        super(parent, modal);
        this.title = title;
        initComponents();
        setLocationRelativeTo(parent);
    }
    //Update
    public JDialogMedecin(java.awt.Frame parent, boolean modal,String title,Medecin medecin  ) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.medecin = medecin;
        this.title = title;
        BtnAjoutFormMedecin.setText("Modifier");
        txtFieldNameMedecin.setText(medecin.getNom());
        txtFieldFirstNameMedecin.setText(medecin.getPrenom());
        txtFieldGradeMedecin.setText(medecin.getGrade());
        
    }
    //Delete
    public JDialogMedecin(java.awt.Frame parent, boolean modal,Medecin medecin ,String title ) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.medecin = medecin;
        this.title = title;
        BtnAjoutFormMedecin.setText("Supprimer");
        txtFieldNameMedecin.setText(medecin.getNom());
        txtFieldFirstNameMedecin.setText(medecin.getPrenom());
        txtFieldGradeMedecin.setText(medecin.getGrade());
        
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
        txtFieldNameMedecin = new javax.swing.JTextField();
        txtFieldFirstNameMedecin = new javax.swing.JTextField();
        txtFieldGradeMedecin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnAjoutFormMedecin = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nom");

        txtFieldNameMedecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameMedecinActionPerformed(evt);
            }
        });

        jLabel2.setText("Grade");

        jLabel3.setText("Prénom");

        BtnAjoutFormMedecin.setText("Ajouter");
        BtnAjoutFormMedecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjoutFormMedecinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFieldNameMedecin)
                                .addComponent(txtFieldFirstNameMedecin)
                                .addComponent(txtFieldGradeMedecin, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(BtnAjoutFormMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNameMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldFirstNameMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldGradeMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnAjoutFormMedecin)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAjoutFormMedecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjoutFormMedecinActionPerformed
        // TODO add your handling code here:
         try {
              String nom = txtFieldNameMedecin.getText();
              String prenom = txtFieldFirstNameMedecin.getText();
              String grade = txtFieldGradeMedecin.getText();
            
              
            if (nom == null || prenom == null || grade == null) {
                JOptionPane.showMessageDialog(this, "Veuillez bien remplire tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            medecin.setNom(nom);
            medecin.setPrenom(prenom);
            medecin.setGrade(grade);
             

            switch (title) {
                case "New":
                    medecinDAO.ajouterMedecin(this.medecin);
                    JOptionPane.showMessageDialog(this, "Médecin ajoutée avec succès !");
                    break;
                case "Update":
                    medecinDAO.modifierMedecin(this.medecin);
                    JOptionPane.showMessageDialog(this, "Médecin modifiée avec succès !");
                    break;
                case "Delete":
                    int confirm = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette Médecin ?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                          medecinDAO.supprimerMedecin(this.medecin.getCodemed());
                        JOptionPane.showMessageDialog(this, "Médecin supprimée avec succès !");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Action inconnue.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }             
    }//GEN-LAST:event_BtnAjoutFormMedecinActionPerformed

    private void txtFieldNameMedecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameMedecinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameMedecinActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogMedecin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogMedecin dialog = new JDialogMedecin(new javax.swing.JFrame(), true,null,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAjoutFormMedecin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtFieldFirstNameMedecin;
    private javax.swing.JTextField txtFieldGradeMedecin;
    private javax.swing.JTextField txtFieldNameMedecin;
    // End of variables declaration//GEN-END:variables
}
