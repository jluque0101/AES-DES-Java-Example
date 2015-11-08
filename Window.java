package com;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import sun.awt.resources.awt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    Encryptor e;

    String mode;
    
    public Window() {
        initComponents();
        mode = getSelectedButtonText(buttonGroup1)+"/"
                +getSelectedButtonText(buttonGroup2)+"/"
                +getSelectedButtonText(buttonGroup3);
        //CipherHandler c = new CipherHandler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        aesRadio = new javax.swing.JRadioButton();
        desRadio = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        ecbRadio = new javax.swing.JRadioButton();
        cbcRadio = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        nopaRadio = new javax.swing.JRadioButton();
        pkcRadio = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plainTextArea = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ciperTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cphButton = new javax.swing.JButton();
        dcpButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        keyField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cifrado"));
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        buttonGroup1.add(aesRadio);
        aesRadio.setSelected(true);
        aesRadio.setText("AES");
        aesRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aesRadioStateChanged(evt);
            }
        });
        jPanel2.add(aesRadio);

        buttonGroup1.add(desRadio);
        desRadio.setText("DES");
        desRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desRadioItemStateChanged(evt);
            }
        });
        jPanel2.add(desRadio);

        jPanel1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        buttonGroup2.add(ecbRadio);
        ecbRadio.setSelected(true);
        ecbRadio.setText("ECB");
        ecbRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ecbRadioItemStateChanged(evt);
            }
        });
        jPanel3.add(ecbRadio);

        buttonGroup2.add(cbcRadio);
        cbcRadio.setText("CBC");
        cbcRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbcRadioItemStateChanged(evt);
            }
        });
        jPanel3.add(cbcRadio);

        jPanel1.add(jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Padding"));
        jPanel5.setLayout(new java.awt.GridLayout(2, 0));

        buttonGroup3.add(nopaRadio);
        nopaRadio.setSelected(true);
        nopaRadio.setText("NoPadding");
        nopaRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nopaRadioItemStateChanged(evt);
            }
        });
        jPanel5.add(nopaRadio);

        buttonGroup3.add(pkcRadio);
        pkcRadio.setText("PKCS5Padding");
        pkcRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pkcRadioItemStateChanged(evt);
            }
        });
        jPanel5.add(pkcRadio);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto plano"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        plainTextArea.setColumns(20);
        plainTextArea.setRows(5);
        jScrollPane1.setViewportView(plainTextArea);

        jPanel7.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Texto cifrado"));
        jPanel8.setLayout(new java.awt.BorderLayout());

        ciperTextArea.setColumns(20);
        ciperTextArea.setRows(5);
        jScrollPane2.setViewportView(ciperTextArea);

        jPanel8.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel8, java.awt.BorderLayout.EAST);

        cphButton.setText("Cifrar");
        cphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphButtonActionPerformed(evt);
            }
        });
        jPanel4.add(cphButton);

        dcpButton.setText("Descifrar");
        dcpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcpButtonActionPerformed(evt);
            }
        });
        jPanel4.add(dcpButton);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel4.add(resetButton);

        jPanel6.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Llave"));
        jPanel9.setLayout(new java.awt.BorderLayout());

        keyField.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel10.add(keyField);

        jPanel9.add(jPanel10, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Tamaño variable según el algoritmo elegido");
        jPanel11.add(jLabel1);

        jPanel9.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateSettings(){
                String newmode = getSelectedButtonText(buttonGroup1)+"/"
                +getSelectedButtonText(buttonGroup2)+"/"
                +getSelectedButtonText(buttonGroup3);
        
        System.out.println(newmode);
        
        mode = newmode;
    }
    
    private void desRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desRadioItemStateChanged
        updateSettings();
    }//GEN-LAST:event_desRadioItemStateChanged

    private void ecbRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ecbRadioItemStateChanged
        updateSettings();
    }//GEN-LAST:event_ecbRadioItemStateChanged

    private void cbcRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbcRadioItemStateChanged
        updateSettings();
    }//GEN-LAST:event_cbcRadioItemStateChanged

    private void nopaRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nopaRadioItemStateChanged
        updateSettings();
    }//GEN-LAST:event_nopaRadioItemStateChanged

    private void pkcRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pkcRadioItemStateChanged
        updateSettings();
    }//GEN-LAST:event_pkcRadioItemStateChanged

    private void aesRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aesRadioStateChanged
        updateSettings();
    }//GEN-LAST:event_aesRadioStateChanged

    private void cphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphButtonActionPerformed
        Encryptor.simpleMode = getSelectedButtonText(buttonGroup1);
        Encryptor.detailedMode = mode;

        String key = keyField.getText();
        
        String initVector;
        
        if(getSelectedButtonText(buttonGroup1) == "AES")
            initVector = "1234567812345678";
        else
            initVector = "12345678";
        
        ciperTextArea.setText(Encryptor.encrypt(key, initVector, plainTextArea.getText()));
    }//GEN-LAST:event_cphButtonActionPerformed

    private void dcpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcpButtonActionPerformed
        Encryptor.simpleMode = getSelectedButtonText(buttonGroup1);
        Encryptor.detailedMode = mode;
        String key = keyField.getText();
        
        String initVector;
        
        if(getSelectedButtonText(buttonGroup1) == "AES")
            initVector = "1234567812345678";
        else
            initVector = "12345678";
        
        plainTextArea.setText(Encryptor.decrypt(key, initVector, ciperTextArea.getText()));
    }//GEN-LAST:event_dcpButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void RadioItemStateChanged(java.awt.event.ItemEvent evt) {                                          
        updateSettings();
    } 
    


    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        
        //http://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Window().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aesRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton cbcRadio;
    private javax.swing.JTextArea ciperTextArea;
    private javax.swing.JButton cphButton;
    private javax.swing.JButton dcpButton;
    private javax.swing.JRadioButton desRadio;
    private javax.swing.JRadioButton ecbRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyField;
    private javax.swing.JRadioButton nopaRadio;
    private javax.swing.JRadioButton pkcRadio;
    private javax.swing.JTextArea plainTextArea;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}