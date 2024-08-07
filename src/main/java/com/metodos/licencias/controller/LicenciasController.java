package com.metodos.licencias.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.metodos.licencias.exceptions.*;
import com.metodos.licencias.DTO.LicenciaDTO;
import com.metodos.licencias.DTO.TitularDTO;
import com.metodos.licencias.DTO.UsuarioDTO;
import com.metodos.licencias.logic.FactorSanguineo;
import com.metodos.licencias.logic.TipoDocumento;
import com.metodos.licencias.logic.TipoLicencia;
import com.metodos.licencias.service.LicenciaService;
import com.metodos.licencias.service.TipoLicenciaService;
import com.metodos.licencias.view.InfoTitular;
import com.metodos.licencias.util.Item;
import com.metodos.licencias.view.LicenciaEmitidaFrame;
import com.metodos.licencias.view.Licencias;

import jakarta.annotation.PostConstruct;

@Controller
public class LicenciasController implements ActionListener, KeyListener, MouseListener{

    private InfoTitular infoTitular;
    private Licencias licencias;

    @Autowired
    private LicenciaService licenciaService;
    @Autowired
    private TipoLicenciaService tipoLicenciaService;

    private DefaultTableModel tabla;
    private LicenciaDTO licenciaDTO;
    private TitularDTO titularDTO;

    @Autowired
    public LicenciasController(InfoTitular infoTitular, Licencias licencias){
        this.infoTitular = infoTitular;
        this.licencias = licencias;
        
    }

    @PostConstruct
    private void init(){

        tabla = new DefaultTableModel();

        //listener del boton de emitir
        this.infoTitular.Licencias_emitir_btn.addActionListener(this);
        this.infoTitular.Licencias_emitirCopia_btn.addActionListener(this);
        this.infoTitular.Licencias_renovar_btn.addActionListener(this);
        this.licencias.addSearchButtonListener(new LicenciasController.SearchButtonListener());
        this.licencias.addImprimirButtonListener(new LicenciasController.ImprimirButtonListener());

        inicializar_cmbx();
        inicializar_cmbx_GS();
    }

    

    private void inicializar_cmbx() {
        //combo de tipo de licencias (clase)
        List<TipoLicencia> tipos = tipoLicenciaService.getAllTipoLicencia();
        for(TipoLicencia tipo: tipos){
           // codigo previo: 
            infoTitular.Licencias_emitir_clase.addItem(new Item(tipo.getLetraClase(), Long.toString(tipo.getId())));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.infoTitular.Licencias_emitir_btn){
            licenciaDTO = infoTitular.getLicenciaDTO();
            titularDTO = infoTitular.getTitularDTO();
             try{
                validarLicencia(licenciaDTO, titularDTO);
                validarTitular(licenciaDTO, titularDTO);
                licenciaDTO = licenciaService.guardarLicencia(licenciaDTO, titularDTO);
                inicializar_tabla();
                int respuesta = JOptionPane.showConfirmDialog(null, "Licencia creada con exito, ¿Desea ver los datos e imprimir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                Double costo = licenciaService.calcularCosto(licenciaDTO);
                if(respuesta == JOptionPane.YES_OPTION){
                    infoTitular.mostrarLicencia(licenciaDTO, titularDTO,costo);
                }else{
                    //COMPROBANTE
                    infoTitular.mostrarComprobante(titularDTO, costo);
                }
            }catch (Exception e1){
                JOptionPane.showMessageDialog(null, e1.getMessage());
            }
        }else if(e.getSource() == this.infoTitular.Licencias_emitirCopia_btn){
            try{
                titularDTO = infoTitular.getTitularDTO();
                int fila = this.infoTitular.Licencias_tabla.getSelectedRow();
                if(fila >=0 ){
                    //OBTENER EL ID DE LA LICENCIA.
                    Long numLicencia = (Long) infoTitular.Licencias_tabla.getValueAt(fila, 0);
                    //EMITIR COPIA.
                    validarEmisionCopia((boolean) infoTitular.Licencias_tabla.getValueAt(fila, 3));   //el 3 es para obtener el boolean de activa/inactiva
                    LicenciaDTO licenciaCopiada = licenciaService.emitirCopia(numLicencia);
                    inicializar_tabla();
                    //infoTitular.revalidate();
                    //infoTitular.repaint();
                    //PREGUNTAR SI SE QUIERE MOSTRAR INFO (lleva a imprimir)
                    int respuesta = JOptionPane.showConfirmDialog(null, "Emision de copia creada con exito, ¿Desea ver los datos e imprimir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                    if(respuesta == JOptionPane.YES_OPTION){
                        infoTitular.mostrarLicencia(licenciaCopiada, titularDTO,50.0);
                    }else{
                        //COMPROBANTE
                        infoTitular.mostrarComprobante(titularDTO,50.0);   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione una licencia para emitir una copia.");
                }
            } catch (Exception e1){
                JOptionPane.showMessageDialog(null, e1.getMessage());
            }
        }
        else if (e.getSource() == this.infoTitular.Licencias_renovar_btn){
            try{
                titularDTO = infoTitular.getTitularDTO();
                int fila = this.infoTitular.Licencias_tabla.getSelectedRow();
                if(fila>=0){
                    //OBTENER EL ID DE LA LICENCIA.
                    Long numLicencia = (Long) infoTitular.Licencias_tabla.getValueAt(fila, 0);
                    //RENOVAR LICENCIA
                    validarRenovacionLicencia(numLicencia);
                    LicenciaDTO licenciaRenovada = licenciaService.renovarLicencia(numLicencia);
                    inicializar_tabla();
                    int respuesta = JOptionPane.showConfirmDialog(null, "Renovacion de licencia creada con exito, ¿Desea ver los datos e imprimir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                    Double costo = licenciaService.calcularCosto(licenciaRenovada);
                    if(respuesta == JOptionPane.YES_OPTION){
                        infoTitular.mostrarLicencia(licenciaRenovada,titularDTO, costo);
                    }else{
                        //COMPROBANTE
                        infoTitular.mostrarComprobante(titularDTO, costo);   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione una licencia para renovarla.");
                }
            }catch (Exception e1){
                JOptionPane.showMessageDialog(null, e1.getMessage());
            }
        }

    }
    
    public class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            //validacion
            //validarUsuario(usuario);
            List<LicenciaDTO> listaLicencias;
            listaLicencias = licenciaService.busquedaFiltrosLicencia(licencias.getNombre(),licencias.getApellido(),licencias.getGrupoSanguineo(),licencias.getCondicionDonante(),licencias.getVigencia());
            licencias.clearTable();
            llenarTabla(listaLicencias);
        }
    }

    private void validarRenovacionLicencia(Long numLicencia) {
        if(!licenciaService.puedeRenovarse(numLicencia)){
            throw new RenovacionException("La licencia seleccionada para renovar tiene que estar no vigente o asociada a un titular con datos modificados");
        }
    }

    private void validarEmisionCopia(boolean esActiva) {
        if(!esActiva){
            throw new LicenciaInactivaException("La licencia seleccionada para emitir copia tiene que estar vigente.");
        }
    }

    private void validarTitular(LicenciaDTO licenciaDTO, TitularDTO titularDTO) {
        //Este metodo valida si se tiene una licencia activa de la clase seleccionada
        //para el titular. lanza excepcion si es afirmativo.
        if(licenciaService.tieneLicenciaActiva(licenciaDTO.getTipoLicencia(), titularDTO.getNumDNI())){
            throw new LicenciaExistenteException("El titular ya tiene una licencia vigente para la clase seleccionada");
        }
    }

    private void validarLicencia(LicenciaDTO licenciaDTO2, TitularDTO titularDTO2) throws Exception{
        //Valida edad de acuerdo a la clase
        //si licencia Para clases C, D, y E la edad mínima es 21 años, para el resto de licencias es 17. El máximo para de edad para clases C, D y E.
        if(licenciaService.edadTitularError(titularDTO2.getFechaNacimiento(),licenciaDTO2.getTipoLicencia().getAtributo1())){
            throw new FechaNacException("La edad del titular no es válida para el tipo de licencia solicitada");
        }
        //Para licencias C, D y E se necesita una licencia clase B al menos un año antes y no se pueden entregar a mayores de 65 años
        if(licenciaService.claseBError(titularDTO2.getNumDNI(),licenciaDTO2.getTipoLicencia().getAtributo1())){
            throw new ClaseBErrorException("El titular no cumple con los requisitos de vigencia de clase B asociada.");
        } 
    }
    
    private void inicializar_tabla() {
        
        TitularDTO titularSeleccionado = this.infoTitular.getTitularDTO();
        List<LicenciaDTO> licenciasAsociadas = licenciaService.buscarLicenciasAsociadas(titularSeleccionado);

        
        tabla = (DefaultTableModel) infoTitular.Licencias_tabla.getModel();
        tabla.setRowCount(0);
        Object[] row = new Object[6];
        for(LicenciaDTO lic: licenciasAsociadas){
            row[0] = lic.getNumeroLicencia();
            row[1] = lic.getInicioVigencia();
            row[2] = lic.getFinVigencia();
            row[3] = licenciaService.esActiva(lic);
            row[4] = lic.getTipoLicencia();
            row[5] = lic.getNumCopia();
            tabla.addRow(row);
        }
    }
    
    public void inicializar_cmbx_GS(){
        //combo de tipo de factores
        FactorSanguineo[] factores = FactorSanguineo.values();
        for(FactorSanguineo factor:factores){
            licencias.grupoSanguineo.addItem(factor.toString());
        }
    }
    
     private void llenarTabla(List<LicenciaDTO> listaLicencias){
        for(LicenciaDTO licencia : listaLicencias){
            licencias.cargarTabla(licencia);
        }
    }

    public class ImprimirButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                //titularDTO = infoTitular.getTitularDTO();
                int fila = licencias.tablaLicencias.getSelectedRow();
                if (fila >= 0) {
                    //OBTENER EL ID DE LA LICENCIA.
                    Long numLicencia = (Long) licencias.tablaLicencias.getValueAt(fila, 0);

                    //IMPRIMIMR LICENCIA
                    LicenciaDTO licencia = licenciaService.buscarLicencia(numLicencia);
                    TitularDTO titular = licenciaService.titularAsociado(numLicencia);

                    LicenciaEmitidaFrame licenciaFrame = new LicenciaEmitidaFrame(licenciaDTO, titularDTO);

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una licencia para imprimir.");
                }
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
            }
        }
    }

}
