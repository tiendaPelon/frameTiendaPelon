/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.FrmReporte;

/**
 *
 * @author danie
 */
public class controlador implements ActionListener{
    private FrmReporte vistaReporte;
    private modelo _model;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void iniciar(){
        vistaReporte.setTitle("reporte de ventas");
    }
    public void Controlador(FrmReporte vistaReporte,modelo _model){
        
    }
    
}
