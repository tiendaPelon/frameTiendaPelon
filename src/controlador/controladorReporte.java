/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.modelo;
import vista.FrmReporte;
import modelo.Conexion;

/**
 *
 * @author danie
 */
public class controladorReporte implements ActionListener{
    private FrmReporte vistaReporte;
    private modelo _model;
    private FrmReporte _reporte;
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String leyenda="";
    if(e.getSource()==_reporte.btnBuscar){
        
        String fecha=((JTextField)_reporte.dia.getDateEditor().getUiComponent()).getText();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String date = dateFormat.format(new Date());
        leyenda=_model.totalDia(date);
        _reporte.dinero.setText("$"+date);
        
        leyenda=_model.productos(fecha);
        String []renglonesProductos=leyenda.split(";");
       String [][]datos;
       datos= new String [renglonesProductos.length][];
        for (int i = 0; i < renglonesProductos.length; i++) {
            datos[i]=renglonesProductos[i].split(",");
        }
        
        
        
    }
     
//     if(e.getSource()==_venta.btnAlta){
//         leyenda=_model.Alta("ventas","null,'"+_venta.txtNombreProducto.getText()+"','"+_venta.txtPrecio.getText()+"','"+_venta.txtCantidad.getText()+"'");
//         JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
//         limpiar();//se limpian las cajas de texto
//     }
    }
    
    public void iniciar(){
        _reporte.setTitle("MVC_Visual");
    }
    public  controladorReporte(FrmReporte reporte,modelo model){
        this._model=model;
        this._reporte=reporte;
        this._reporte.btnBuscar.addActionListener(this);
    }
}
