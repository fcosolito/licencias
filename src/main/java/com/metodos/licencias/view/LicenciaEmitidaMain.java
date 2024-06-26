/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.metodos.licencias.view;

import com.metodos.licencias.DTO.LicenciaDTO;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.rendering.PDFRenderer;

/**
 *
 * @author valec
 */
public class LicenciaEmitidaMain extends javax.swing.JPanel {

    /**
     * Creates new form LicenciaEmitidaMain
     */
    
    CardLayout cl;
    int cornerRadius = 15;
    Color grisOscuro = new Color(80,80,80);
    private double zoomFactor = 1;
    PDDocument document = null;
    JFrame frame;
    
    public LicenciaEmitidaMain(LicenciaDTO licencia, JFrame main) {
        this.frame = main;
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                try {
                    document.close();
                } catch (IOException ex) {
                    VentanaEmergente cerrarArchivo = new VentanaEmergente("Error al cerrar el documento PDF");
                }

                frame.dispose();
            }
        });
        
        
        
        initComponents();
        armarCardLayout(licencia);
        pdfConfig();
        pdf.revalidate();
        pdf.repaint();
        revalidate();
        repaint();
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

        cardPanel = new RoundedPanel(15);
        licenciaPanel = new RoundedPanel(15);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoLicencia = new RoundedLabel(cornerRadius,grisOscuro);
        nroLicencia = new RoundedLabel(cornerRadius,grisOscuro);
        inicioLicencia = new RoundedLabel(cornerRadius,grisOscuro);
        finLicencia = new RoundedLabel(cornerRadius,grisOscuro);
        observaciones = new RoundedLabel(cornerRadius,grisOscuro);
        jPanel2 = new javax.swing.JPanel();
        cerrarBtn = new RoundedButton(15);
        pdfButton = new RoundedButton(15);
        pdf = new RoundedPanel(15);

        setBackground(new java.awt.Color(194, 194, 194));
        setLayout(new java.awt.GridBagLayout());

        cardPanel.setBackground(new java.awt.Color(252, 252, 252));
        cardPanel.setLayout(new java.awt.CardLayout());

        licenciaPanel.setBackground(new java.awt.Color(252, 252, 252));
        licenciaPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Licencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        licenciaPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setText("nroLicencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 30);
        licenciaPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setText("inicio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        licenciaPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setText("fin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 30);
        licenciaPanel.add(jLabel4, gridBagConstraints);

        jLabel5.setText("tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        licenciaPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Observaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        licenciaPanel.add(jLabel6, gridBagConstraints);

        tipoLicencia.setBackground(new java.awt.Color(252, 252, 252));
        tipoLicencia.setForeground(new java.awt.Color(80, 80, 80));
        tipoLicencia.setText("jLabel7");
        tipoLicencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 10);
        licenciaPanel.add(tipoLicencia, gridBagConstraints);

        nroLicencia.setBackground(new java.awt.Color(252, 252, 252));
        nroLicencia.setForeground(new java.awt.Color(80, 80, 80));
        nroLicencia.setText("jLabel8");
        nroLicencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 30);
        licenciaPanel.add(nroLicencia, gridBagConstraints);

        inicioLicencia.setBackground(new java.awt.Color(252, 252, 252));
        inicioLicencia.setForeground(new java.awt.Color(80, 80, 80));
        inicioLicencia.setText("jLabel9");
        inicioLicencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 10);
        licenciaPanel.add(inicioLicencia, gridBagConstraints);

        finLicencia.setBackground(new java.awt.Color(252, 252, 252));
        finLicencia.setForeground(new java.awt.Color(80, 80, 80));
        finLicencia.setText("jLabel10");
        finLicencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 30);
        licenciaPanel.add(finLicencia, gridBagConstraints);

        observaciones.setBackground(new java.awt.Color(252, 252, 252));
        observaciones.setForeground(new java.awt.Color(80, 80, 80));
        observaciones.setText("jLabel11");
        observaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 10, 30);
        licenciaPanel.add(observaciones, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 30);
        licenciaPanel.add(jPanel2, gridBagConstraints);

        cerrarBtn.setBackground(new java.awt.Color(27, 140, 188));
        cerrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarBtn.setText("Cerrar");
        cerrarBtn.setFocusable(false);
        cerrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarBtnJButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 10, 10);
        licenciaPanel.add(cerrarBtn, gridBagConstraints);

        pdfButton.setBackground(new java.awt.Color(27, 140, 188));
        pdfButton.setForeground(new java.awt.Color(255, 255, 255));
        pdfButton.setText("Imprimir PDF");
        pdfButton.setFocusable(false);
        pdfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfButtonJButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 30);
        licenciaPanel.add(pdfButton, gridBagConstraints);

        cardPanel.add(licenciaPanel, "Panel");

        pdf.setBackground(new java.awt.Color(252, 252, 252));
        pdf.setLayout(new java.awt.GridBagLayout());
        cardPanel.add(pdf, "PDF");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(cardPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarBtnJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarBtnJButton1ActionPerformed
        try {
            document.close();
        } catch (IOException ex) {
            VentanaEmergente cerrarArchivo = new VentanaEmergente("Error al cerrar el documento PDF");
        }
        frame.dispose();
    }//GEN-LAST:event_cerrarBtnJButton1ActionPerformed

    private void pdfButtonJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfButtonJButton2ActionPerformed
        switchScreen("PDF");
        /*
        pdf.revalidate();
        pdf.repaint();
        revalidate();
        repaint();
        */
    }//GEN-LAST:event_pdfButtonJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton cerrarBtn;
    private javax.swing.JLabel finLicencia;
    private javax.swing.JLabel inicioLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel licenciaPanel;
    private javax.swing.JLabel nroLicencia;
    private javax.swing.JLabel observaciones;
    private javax.swing.JPanel pdf;
    private javax.swing.JButton pdfButton;
    private javax.swing.JLabel tipoLicencia;
    // End of variables declaration//GEN-END:variables

    private void armarCardLayout(LicenciaDTO licencia){

        cl = (CardLayout) (cardPanel.getLayout());
        
        tipoLicencia.setText(" " + licencia.getTipoLicencia().getAtributo1());
        nroLicencia.setText(licencia.getNumeroLicencia().toString());
        inicioLicencia.setText(licencia.getInicioVigencia().toString());
        finLicencia.setText(licencia.getFinVigencia().toString());
        observaciones.setText(" " + licencia.getObservaciones());
        
    }
    
    public void switchScreen (String pantalla) {    
      cl.show(cardPanel, pantalla);
      revalidate();
    } 
    
    private PDDocument displayPDF(String pdfFilePath, double zoomFactor, JPanel panelPDF) {
       
        document = new PDDocument();
        
        try {
            document = PDDocument.load(new File(pdfFilePath));
            PDFRenderer renderer = new PDFRenderer(document);
            
            try{
            llenarPDF(document);
            }
            catch(Exception e){
                VentanaEmergente errorCargarDoc = new VentanaEmergente("No se puede completar el cargado del PDF");
            }
            
            int pageCount = document.getNumberOfPages();
            for (int pageIndex = 0; pageIndex < pageCount; pageIndex++) {
                BufferedImage image = renderer.renderImageWithDPI(pageIndex, (float) (100 * zoomFactor));

                ImageIcon imageIcon = new ImageIcon(image);
                JLabel label = new JLabel(imageIcon);
                panelPDF.add(label);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
  
        
        return document;
    }

    private void llenarPDF(PDDocument document) throws IOException {
       PDAcroForm pDAcroForm = document.getDocumentCatalog().getAcroForm();
            PDField field = pDAcroForm.getField("field_tipo");
            field.setValue("tipo");
            field = pDAcroForm.getField("field_nro");
            field.setValue("numero");
            field = pDAcroForm.getField("field_inicio");
            field.setValue("inicio");
            field = pDAcroForm.getField("field_fin");
            field.setValue("fin");
            field = pDAcroForm.getField("field_observaciones");
            field.setValue("observaciones");
    }
    
    private void pdfConfig() {
        
        pdf.setLayout(new GridBagLayout());
        JPanel pdfPanel  = new JPanel();
        
        JPanel relleno = new JPanel();
        relleno.setBackground(new Color(252,252,252));
        RoundedButton zoomInButton = new RoundedButton(cornerRadius);
        zoomInButton.setText("+");
        zoomInButton.setBackground(new Color(194,194,194));
        zoomInButton.setForeground(new Color(51,51,51));
        zoomInButton.setFocusable(false);
        RoundedButton zoomOutButton = new RoundedButton(cornerRadius);
        zoomOutButton.setText("-");
        zoomOutButton.setBackground(new Color(194,194,194));
        zoomOutButton.setForeground(new Color(51,51,51));
        zoomOutButton.setFocusable(false);
        RoundedButton volver = new RoundedButton(cornerRadius);
        volver.setBackground(new Color(27, 140, 188));
        volver.setForeground(new Color(252,252,252));
        volver.setFocusable(false);
        volver.setText("Volver");
        RoundedButton descargar = new RoundedButton(cornerRadius);
        descargar.setBackground(new Color(27, 140, 188));
        descargar.setForeground(new Color(252,252,252));
        descargar.setFocusable(false);
        descargar.setText("Imprimir");
        
        PDDocument document = displayPDF("Licencia.pdf", zoomFactor, pdfPanel);
        
        zoomInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(zoomFactor < 2.5){
                    zoomFactor *= 1.2;
                    updateZoom(pdfPanel, (float) (zoomFactor));
                }
            }
        });

        zoomOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(zoomFactor > 0.4){
                    zoomFactor /= 1.2;
                    updateZoom(pdfPanel, (float) (zoomFactor));
                }
            }
        });
        
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchScreen("Panel");
            }
        });
        
        descargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    descargarPDF(document);
                } catch (IOException ex) {
                    Logger.getLogger(LicenciaEmitidaMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        pdfPanel.setLayout(new BoxLayout(pdfPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(pdfPanel);
           
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.weightx = 0.98;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10,20,20,10);
        pdf.add(scrollPane,gbc);
        
        gbc.gridheight = 1;
        gbc.weightx = 0.02;
        gbc.weighty = 0.01;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10,0,0,30);
        pdf.add(zoomInButton, gbc);
        
        gbc.gridy = 1;
        gbc.insets = new Insets(10,0,0,30);
        pdf.add(zoomOutButton, gbc);
        
        gbc.gridy = 2;
        gbc.insets = new Insets(0,0,0,30);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weighty = 1;
        pdf.add(relleno,gbc);
        
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        //gbc.anchor = GridBagConstraints.WEST;
        gbc.weighty = 0.01;
        gbc.insets = new Insets(0,0,10,30);
        pdf.add(volver,gbc);
        
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.VERTICAL;
        //gbc.anchor = GridBagConstraints.EAST;
        gbc.weighty = 0.01;
        gbc.insets = new Insets(0,0,20,30);
        pdf.add(descargar,gbc);

    }
    
    private void updateZoom(JPanel pdfPanel,  double zoomFactor) {
        pdfPanel.removeAll();
        displayPDF("Licencia.pdf", zoomFactor, pdfPanel);
        revalidate();
        repaint();
    }
    
    void descargarPDF(PDDocument document) throws IOException{
        
        // Use JFileChooser to choose the location and filename for saving the PDF
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save PDF");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File selectedFile = fileChooser.getSelectedFile();

                // Ensure the file has a .pdf extension
                String pdfFilePath = selectedFile.getAbsolutePath();
                if (!pdfFilePath.toLowerCase().endsWith(".pdf")) {
                    pdfFilePath += ".pdf";
                }

                // Set the form fields as read-only
                setFormFieldsReadOnly(document);
                
                // Save the document to the specified file
                document.save(pdfFilePath);
                document.close();
            }
    }
    
    private void setFormFieldsReadOnly(PDDocument document) {
        PDDocumentCatalog catalog = document.getDocumentCatalog();
        PDAcroForm acroForm = catalog.getAcroForm();

        if (acroForm != null) {
            // Iterate through all pages
            for (PDPage page : document.getPages()) {
                // Iterate through all fields on the page
                acroForm.getFields().forEach(field -> {
                    // Set the read-only flag for each field
                    field.setReadOnly(true);
                });
            }
        }
    }
    
    

}
