/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.project.hibernate.gui;

import com.project.hibernate.dao.PatientDAO;
import com.project.hibernate.entity.Patient;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Tsila
 */
public class JDialogFormPatient extends javax.swing.JDialog {

    /**
     * Creates new form JDialogFormPatient
     */
     private Patient patient = new Patient();
    static String title = "";
    PatientDAO patientDAO = new PatientDAO();
   
    
    //New
    public JDialogFormPatient(java.awt.Frame parent, boolean modal,String title) {
        super(parent, modal);
        this.patient = patient;
        this.title = title;
        initComponents();
        setLocationRelativeTo(parent);
        // Remplir le JComboBox avec les valeurs Homme et Femme
        jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        // Sélectionner une valeur par défaut (ex: "Homme")
        jComboBoxSexe.setSelectedItem("Homme");

    }
    
    //Update
    public JDialogFormPatient(java.awt.Frame parent, boolean modal,String title,Patient patient) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.patient = patient;
        this.title = title;
        BtnAjoutFormPatient.setText("Modifier");
        txtFieldNamePatient.setText(patient.getNom());
        txtFieldFirstNamePatient.setText(patient.getPrenom());
        jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        // Sélectionner une valeur par défaut (ex: "Homme")
        jComboBoxSexe.setSelectedItem(patient.getSexe());

        //txtFieldSexePatient.setText(patient.getSexe());
        txtFieldAdressePatient.setText(patient.getAdresse());
    }
    
    //Delete
    public JDialogFormPatient(java.awt.Frame parent, boolean modal,Patient patient,String title) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.patient = patient;
        this.title = title;
        BtnAjoutFormPatient.setText("Supprimer");
        txtFieldNamePatient.setText(patient.getNom());
        txtFieldFirstNamePatient.setText(patient.getPrenom());
        jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        // Sélectionner une valeur par défaut (ex: "Homme")
        jComboBoxSexe.setSelectedItem(patient.getSexe());
        //txtFieldSexePatient.setText(patient.getSexe());
        txtFieldAdressePatient.setText(patient.getAdresse());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldNamePatient = new javax.swing.JTextField();
        BtnAjoutFormPatient = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtFieldFirstNamePatient = new javax.swing.JTextField();
        txtFieldAdressePatient = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSexe = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtFieldNamePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNamePatientActionPerformed(evt);
            }
        });

        BtnAjoutFormPatient.setText("Ajouter");
        BtnAjoutFormPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjoutFormPatientActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom");

        txtFieldFirstNamePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFirstNamePatientActionPerformed(evt);
            }
        });

        txtFieldAdressePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAdressePatientActionPerformed(evt);
            }
        });

        jLabel2.setText("Adresse");

        jLabel3.setText("Prénom");

        jLabel4.setText("Sexe");

        jComboBoxSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txtFieldFirstNamePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtFieldAdressePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtFieldNamePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxSexe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(BtnAjoutFormPatient)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtFieldNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtFieldFirstNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(txtFieldAdressePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnAjoutFormPatient)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNamePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNamePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNamePatientActionPerformed

    private void BtnAjoutFormPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjoutFormPatientActionPerformed
        

          try {
              String nom = txtFieldNamePatient.getText();
              String prenom = txtFieldFirstNamePatient.getText();
              String sexe = (String) jComboBoxSexe.getSelectedItem();
              String adresse = txtFieldAdressePatient.getText();
              
            if (nom.isEmpty()  || sexe.isEmpty() || adresse.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veuillez bien remplire tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

               patient.setNom(nom);
               patient.setPrenom(prenom);
               patient.setSexe(sexe); 
               patient.setAdresse(adresse);

            switch (title) {
                case "New":
                    patientDAO.ajouterPatient(this.patient);
                    JOptionPane.showMessageDialog(this, "Patient ajoutée avec succès !");
                    break;
                case "Update":
                    patientDAO.modifierPatient(this.patient);
                    JOptionPane.showMessageDialog(this, "Patient modifiée avec succès !");
                    break;
                case "Delete":
                    int confirm = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette Patient ?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                         patientDAO.supprimerPatient(this.patient.getCodepat());
                        JOptionPane.showMessageDialog(this, "Patient supprimée avec succès !");
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
    
    }//GEN-LAST:event_BtnAjoutFormPatientActionPerformed

    private void txtFieldFirstNamePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFirstNamePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFirstNamePatientActionPerformed

    private void txtFieldAdressePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAdressePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAdressePatientActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogFormPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogFormPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogFormPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogFormPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogFormPatient dialog = new JDialogFormPatient(new javax.swing.JFrame(),true,null,"");
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
    private javax.swing.JToggleButton BtnAjoutFormPatient;
    private javax.swing.JComboBox<String> jComboBoxSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtFieldAdressePatient;
    private javax.swing.JTextField txtFieldFirstNamePatient;
    private javax.swing.JTextField txtFieldNamePatient;
    // End of variables declaration//GEN-END:variables

   
}
