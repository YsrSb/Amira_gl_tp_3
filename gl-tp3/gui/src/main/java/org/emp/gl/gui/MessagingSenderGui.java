/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.gui;

import javax.naming.Context;
import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.messages.Anonyme;
import org.emp.gl.messages.BaseMessageAdapter;
import org.emp.gl.messages.Hash;
import org.emp.gl.messages.IMessage;
import org.emp.gl.messages.Maj;
import org.emp.gl.messages.SansEspaces;
import org.emp.gl.messages.SansPonctuation;
import org.emp.gl.messages.SansVoyelles;
import org.emp.gl.sender.service.MessagingService;

/**
 *
 * @author billal
 */
public class MessagingSenderGui extends javax.swing.JFrame {

    private final String senderId;

    /**
     * Creates new form MessagingRecievingTest
     */
    public MessagingSenderGui(String senderId) {
        setSize(400, 400);
        this.senderId = senderId ;
        
        initComponents();
                
        userField.setText(senderId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        destinationField = new javax.swing.JTextField();
        objectField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        Maj = new javax.swing.JCheckBox();
        SVoyelle = new javax.swing.JCheckBox();
        SEspace = new javax.swing.JCheckBox();
        Md5 = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Emetteur :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jLabel1, gridBagConstraints);

        userField.setEditable(false);
        userField.setText("ID-241");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(userField, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Destinataire :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Objet :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Message :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jLabel4, gridBagConstraints);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton1, gridBagConstraints);

        destinationField.setText("ID-1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(destinationField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(objectField, gridBagConstraints);

        messageField.setColumns(40);
        messageField.setRows(5);
        jScrollPane1.setViewportView(messageField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        Maj.setText("Maj");
        Maj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MajActionPerformed(evt);
            }
        });
        getContentPane().add(Maj, new java.awt.GridBagConstraints());

        SVoyelle.setText("S-Voyelle");
        getContentPane().add(SVoyelle, new java.awt.GridBagConstraints());

        SEspace.setText("S-Espace");
        getContentPane().add(SEspace, new java.awt.GridBagConstraints());

        Md5.setText("Md5");
        getContentPane().add(Md5, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        IMessage message =new BaseMessageAdapter();
        
        
        if(Maj.isSelected())
        {
            message = new Maj(message);
        }
        if(SVoyelle.isSelected())
        {
            message = new SansVoyelles(message);
        }
        if(SEspace.isSelected())
        {
            message = new SansEspaces(message);
        }
        if(Md5.isSelected())
        {
            message = new Hash(message);
        }
        message.setTitle(objectField.getText());
        message.setMessage(messageField.getText());
        message.setSender(userField.getText());
               
        MessagingService ms = Lookup.getInstance().getService(MessagingService.class);
        
        ms.sendMessage(destinationField.getText(), message.toString());
        
       
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MajActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Maj;
    private javax.swing.JCheckBox Md5;
    private javax.swing.JCheckBox SEspace;
    private javax.swing.JCheckBox SVoyelle;
    private javax.swing.JTextField destinationField;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageField;
    private javax.swing.JTextField objectField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
