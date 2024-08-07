/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.metodos.licencias.view;

import com.metodos.licencias.DTO.UsuarioDTO;
import com.metodos.licencias.controller.UsuariosController;
import com.metodos.licencias.logic.Rol;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.springframework.stereotype.Component;

/**
 *
 * @author valec
 */
@Component
public class Usuarios extends javax.swing.JPanel {

    /**
     * Creates new form Usuarios
     */
    
    private int cornerRadius = 15;
    private Color grisOscuro = new Color(80,80,80);
    private UsuariosMain main;
    
    public Usuarios() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new RoundedPanel(30);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Alta_usuario_usuario = new RoundedTextField(15, grisOscuro);
        jLabel11 = new javax.swing.JLabel();
        Alta_usuario_contrasenia = new RoundedTextField(15,grisOscuro);
        jLabel12 = new javax.swing.JLabel();
        Alta_usuario_tipodni = new RoundedComboBox(cornerRadius, grisOscuro);
        Busqueda_usuario_guardarBtn = new RoundedButton(cornerRadius);
        jLabel18 = new javax.swing.JLabel();
        Alta_usuario_numerodni1 = new RoundedTextField(15,grisOscuro);
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(30);
        jLabel17 = new javax.swing.JLabel();
        Busqueda_usuario_numerodni = new RoundedTextField(15,grisOscuro);
        jLabel2 = new javax.swing.JLabel();
        Busqueda_usuario_tipodni = new RoundedComboBox(cornerRadius,grisOscuro);
        jLabel19 = new javax.swing.JLabel();
        Busqueda_usuario_buscarBtn = new RoundedButton(cornerRadius);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Busqueda_usuario_usuario = new RoundedTextField(15,grisOscuro);
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Busqueda_usuario_rol = new RoundedComboBox(cornerRadius,grisOscuro);

        setBackground(new java.awt.Color(194, 194, 194));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1200, 620));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Tipo DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 5, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Número DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 30);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Datos Personales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Datos usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        jPanel1.add(jLabel9, gridBagConstraints);

        Alta_usuario_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(Alta_usuario_usuario, gridBagConstraints);

        jLabel11.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 5, 0);
        jPanel1.add(jLabel11, gridBagConstraints);

        Alta_usuario_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_contraseniaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(Alta_usuario_contrasenia, gridBagConstraints);

        jLabel12.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 30);
        jPanel1.add(jLabel12, gridBagConstraints);

        Alta_usuario_tipodni.setBackground(new java.awt.Color(252, 252, 252));
        Alta_usuario_tipodni.setForeground(new java.awt.Color(0, 0, 0));
        Alta_usuario_tipodni.setModel(new javax.swing.DefaultComboBoxModel<>());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(Alta_usuario_tipodni, gridBagConstraints);

        Busqueda_usuario_guardarBtn.setBackground(new java.awt.Color(27, 140, 188));
        Busqueda_usuario_guardarBtn.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda_usuario_guardarBtn.setText("Guardar");
        Busqueda_usuario_guardarBtn.setBorder(null);
        Busqueda_usuario_guardarBtn.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 30);
        jPanel1.add(Busqueda_usuario_guardarBtn, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Alta de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(jLabel18, gridBagConstraints);

        Alta_usuario_numerodni1.setToolTipText("");
        Alta_usuario_numerodni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_numerodni1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(Alta_usuario_numerodni1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel17.setText("Numero DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 5, 10);
        jPanel2.add(jLabel17, gridBagConstraints);

        Busqueda_usuario_numerodni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_numerodniActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(Busqueda_usuario_numerodni, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Búsqueda de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        Busqueda_usuario_tipodni.setBackground(new java.awt.Color(252, 252, 252));
        Busqueda_usuario_tipodni.setModel(new javax.swing.DefaultComboBoxModel<>());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(Busqueda_usuario_tipodni, gridBagConstraints);

        jLabel19.setText("Tipo DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 5, 10);
        jPanel2.add(jLabel19, gridBagConstraints);

        Busqueda_usuario_buscarBtn.setBackground(new java.awt.Color(27, 140, 188));
        Busqueda_usuario_buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupita_chica.png"))); // NOI18N
        Busqueda_usuario_buscarBtn.setBorder(null);
        Busqueda_usuario_buscarBtn.setBorderPainted(false);
        Busqueda_usuario_buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_buscarBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 30);
        jPanel2.add(Busqueda_usuario_buscarBtn, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Tipo DNI", "Numero DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 614;
        gridBagConstraints.ipady = 410;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 30, 30);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        Busqueda_usuario_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 10);
        jPanel2.add(Busqueda_usuario_usuario, gridBagConstraints);

        jLabel16.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 0);
        jPanel2.add(jLabel16, gridBagConstraints);

        jLabel20.setText("Rol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 5, 10);
        jPanel2.add(jLabel20, gridBagConstraints);

        Busqueda_usuario_rol.setBackground(new java.awt.Color(252, 252, 252));
        Busqueda_usuario_rol.setModel(new javax.swing.DefaultComboBoxModel<>());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel2.add(Busqueda_usuario_rol, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void Alta_usuario_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alta_usuario_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alta_usuario_usuarioActionPerformed

    private void Alta_usuario_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alta_usuario_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alta_usuario_contraseniaActionPerformed

    private void Alta_usuario_numerodni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alta_usuario_numerodni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alta_usuario_numerodni1ActionPerformed

    private void Busqueda_usuario_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_usuario_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_usuario_usuarioActionPerformed

    private void Busqueda_usuario_buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_usuario_buscarBtnActionPerformed
       // main.switchScreen("UsuarioSeleccionado");
    }//GEN-LAST:event_Busqueda_usuario_buscarBtnActionPerformed

    private void Busqueda_usuario_numerodniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_usuario_numerodniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_usuario_numerodniActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alta_usuario_contrasenia;
    private javax.swing.JTextField Alta_usuario_numerodni1;
    private javax.swing.JComboBox<String> Alta_usuario_tipodni;
    private javax.swing.JTextField Alta_usuario_usuario;
    private javax.swing.JButton Busqueda_usuario_buscarBtn;
    private javax.swing.JButton Busqueda_usuario_guardarBtn;
    private javax.swing.JTextField Busqueda_usuario_numerodni;
    private javax.swing.JComboBox<String> Busqueda_usuario_rol;
    private javax.swing.JComboBox<String> Busqueda_usuario_tipodni;
    private javax.swing.JTextField Busqueda_usuario_usuario;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void addSaveButtonListener(UsuariosController.SaveButtonListener saveButtonListener) {
        Busqueda_usuario_guardarBtn.addActionListener(saveButtonListener);
    }
    
    public void addSearchButtonListener(UsuariosController.SearchButtonListener searchButtonListener) {
        Busqueda_usuario_buscarBtn.addActionListener(searchButtonListener);
    }
    
    public void addTableMouseListener(MouseAdapter mouseAdapter){
        jTable1.addMouseListener(mouseAdapter);
    }
    
    
    public UsuarioDTO getUsuarioDTO(){
        return new UsuarioDTO(
        Alta_usuario_tipodni.getSelectedItem().toString(),
        Alta_usuario_numerodni1.getText(),
        Alta_usuario_usuario.getText(),
        Alta_usuario_contrasenia.getText(),
        Rol.ADMINISTRATIVO.toString()
        );
    }
    
    public void usuarioCreado(){
        //ventana emergente con confirmacion
        JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
        //limpiar inputs
        Alta_usuario_numerodni1.setText("");
        Alta_usuario_contrasenia.setText("");
        Alta_usuario_usuario.setText("");
        ((RoundedTextField)Alta_usuario_numerodni1).setBorderColor(grisOscuro);
        ((RoundedTextField)Alta_usuario_usuario).setBorderColor(grisOscuro);
        ((RoundedTextField)Alta_usuario_contrasenia).setBorderColor(grisOscuro);
    }
    
    public void nombreUsuarioExistente(String mensajeError){
        //ventana emergente error
        JOptionPane.showMessageDialog(null, mensajeError);
        //cambiar borde a rojo
        ((RoundedTextField)Alta_usuario_usuario).setBorderColor(Color.RED);
    }

    public void dniExistente(String mensajeError){
        //ventana emergente error
        JOptionPane.showMessageDialog(null, mensajeError);
        //cambiar borde a rojo         
        ((RoundedTextField)Alta_usuario_numerodni1).setBorderColor(Color.RED);
    }
        
    public void nombreDniExistentes(String mensajeError){
        //ventana emergente error
        JOptionPane.showMessageDialog(null, mensajeError);
        //cambiar ambos bordes a rojo 
        ((RoundedTextField)Alta_usuario_numerodni1).setBorderColor(Color.RED);
        ((RoundedTextField)Alta_usuario_usuario).setBorderColor(Color.RED);

    }

    public void ventanaError(String message) {
        //ventana emergente con confirmacion
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void setAltaTipoDNI(String tipo){
        Alta_usuario_tipodni.addItem(tipo);
    }
    
    public void setBusquedaTipoDNI(String tipo){
        Busqueda_usuario_tipodni.addItem(tipo);
    }
    
    public void setBusquedaRol(String rol){
        Busqueda_usuario_rol.addItem(rol);
    }
    
    public String getBusquedaNombreUsuario(){
        return Busqueda_usuario_usuario.getText();
    }
    
    public String getBusquedaRol(){
        return Busqueda_usuario_rol.getSelectedItem().toString();
    }
    
    public String getBusquedaTipoDocumento(){
        return Busqueda_usuario_tipodni.getSelectedItem().toString();
    }
    
    public String getBusquedaNroDocumento(){
        return Busqueda_usuario_numerodni.getText();
    }
    
    public void setMain (UsuariosMain main){
        this.main = main;
    }
    
    public void cargarTabla(UsuarioDTO usuario){
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        Object[] dataRow = {usuario.getUsuario(),usuario.getTipoDocumento(),usuario.getNroDocumento()};
        tableModel.addRow(dataRow);
    }
    
    public void clearTable(){
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
    }
    
    public void cargarUsuarioSeleccionado(UsuarioDTO usuarioSeleccionado){
        main.cargarUsuarioSeleccionado(usuarioSeleccionado);
    }
    
    public int getSelectedRow(){
        return jTable1.getSelectedRow();
    }
    
    public String getRowData(int row, int column){
        return (String) jTable1.getValueAt(row, column);
    }

    public void mostrarUsuarioSeleccionado() {
            this.main.switchScreen("UsuarioSeleccionado");
    }
}
