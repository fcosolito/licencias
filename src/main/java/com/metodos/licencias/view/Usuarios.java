/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.metodos.licencias.view;

import com.metodos.licencias.DTO.UsuarioDTO;
import com.metodos.licencias.controller.UsuariosController;
import java.awt.Color;

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
    
    private int cornerRadius;
    private Color grisOscuro = new Color(80,80,80);
    
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
        Alta_usuario_rol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Alta_usuario_usuario = new RoundedTextField(15, grisOscuro);
        jLabel11 = new javax.swing.JLabel();
        Alta_usuario_contrasenia = new RoundedTextField(15,grisOscuro);
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Alta_usuario_tipodni = new javax.swing.JComboBox<>();
        Busqueda_usuario_guardarBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Alta_usuario_numerodni1 = new RoundedTextField(15,grisOscuro);
        jPanel2 = new RoundedPanel(30);
        jLabel17 = new javax.swing.JLabel();
        Busqueda_usuario_numerodni = new RoundedTextField(15,grisOscuro);
        jLabel2 = new javax.swing.JLabel();
        Busqueda_usuario_tipodni = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        Busqueda_usuario_buscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Busqueda_usuario_usuario = new RoundedTextField(15,grisOscuro);
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Busqueda_usuario_rol = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1200, 620));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Tipo DNI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Alta_usuario_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Alta_usuario_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 40));

        jLabel4.setText("Número DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Datos Personales");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Datos usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Alta_usuario_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Alta_usuario_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 40));

        jLabel11.setText("Usuario");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Alta_usuario_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_contraseniaActionPerformed(evt);
            }
        });
        jPanel1.add(Alta_usuario_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, 40));

        jLabel12.setText("Contraseña");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 60, -1));

        jLabel13.setText("Rol");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        Alta_usuario_tipodni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Alta_usuario_tipodni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 40));

        Busqueda_usuario_guardarBtn.setBackground(new java.awt.Color(0, 153, 204));
        Busqueda_usuario_guardarBtn.setText("Guardar");
        jPanel1.add(Busqueda_usuario_guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 120, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Alta de usuario");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Alta_usuario_numerodni1.setToolTipText("");
        Alta_usuario_numerodni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alta_usuario_numerodni1ActionPerformed(evt);
            }
        });
        jPanel1.add(Alta_usuario_numerodni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Numero DNI");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        Busqueda_usuario_numerodni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_numerodniActionPerformed(evt);
            }
        });
        jPanel2.add(Busqueda_usuario_numerodni, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Búsqueda de usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Busqueda_usuario_tipodni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(Busqueda_usuario_tipodni, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 110, 40));

        jLabel19.setText("Tipo DNI");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        Busqueda_usuario_buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupita_chica.png"))); // NOI18N
        Busqueda_usuario_buscarBtn.setBorderPainted(false);
        Busqueda_usuario_buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_buscarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(Busqueda_usuario_buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 40, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Tipo DNI", "Numero DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 147, 630, 430));

        Busqueda_usuario_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_usuario_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Busqueda_usuario_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 40));

        jLabel16.setText("Usuario");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, -1));

        jLabel20.setText("Rol");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, -1));

        Busqueda_usuario_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(Busqueda_usuario_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 40));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_usuario_buscarBtnActionPerformed

    private void Busqueda_usuario_numerodniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_usuario_numerodniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_usuario_numerodniActionPerformed
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alta_usuario_contrasenia;
    private javax.swing.JTextField Alta_usuario_numerodni1;
    private javax.swing.JComboBox<String> Alta_usuario_rol;
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
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void addSaveButtonListener(UsuariosController.SaveButtonListener saveButtonListener) {
        Busqueda_usuario_guardarBtn.addActionListener(saveButtonListener);
    }
    
    public UsuarioDTO getUsuarioDTO(){
        return new UsuarioDTO(
        Alta_usuario_tipodni.getSelectedItem().toString(),
        Alta_usuario_numerodni1.getText(),
        Alta_usuario_usuario.getText(),
        Alta_usuario_contrasenia.getText(),
        Busqueda_usuario_rol.getSelectedItem().toString()
        );
    }
    
    public void usuarioCreado(){
        //ventana emergente con confirmacion
        VentanaEmergente ventanaEmergente = new VentanaEmergente("Usuario creado exitosamente.");
        ventanaEmergente.setVisible(true);
        //limpiar inputs
        Alta_usuario_numerodni1.setText("");
        Alta_usuario_contrasenia.setText("");
        Alta_usuario_usuario.setText("");
    }
    
    public void nombreUsuarioExistente(String mensajeError){
        //ventana emergente error
        VentanaEmergente ventanaEmergente = new VentanaEmergente(mensajeError);
        ventanaEmergente.setVisible(true);
        //cambiar borde a rojo
        ((RoundedTextField)Alta_usuario_usuario).setBorderColor(Color.RED);
    }

    public void dniExistente(String mensajeError){
        //ventana emergente error
        VentanaEmergente ventanaEmergente = new VentanaEmergente(mensajeError);
        ventanaEmergente.setVisible(true);
        //cambiar borde a rojo         
        ((RoundedTextField)Alta_usuario_numerodni1).setBorderColor(Color.RED);
    }
        
    public void nombreDniExistentes(String mensajeError){
        //ventana emergente error
        VentanaEmergente ventanaEmergente = new VentanaEmergente(mensajeError);
        ventanaEmergente.setVisible(true);
        //cambiar ambos bordes a rojo 
        ((RoundedTextField)Alta_usuario_numerodni1).setBorderColor(Color.RED);
        ((RoundedTextField)Alta_usuario_usuario).setBorderColor(Color.RED);

    }
    
}
