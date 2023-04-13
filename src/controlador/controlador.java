/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.modelo;
import vista.FrmReporte;
import vista.frmVenta;
import modelo.Conexion;

/**
 *
 * @author danie
 */
public class controlador implements ActionListener{
    private FrmReporte vistaReporte;
    private modelo _model;
    private frmVenta _venta;
   

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String leyenda="";
     
     if(e.getSource()==_venta.btnAlta){
         leyenda=_model.Alta("ventas","null,'"+_venta.txtNombreProducto.getText()+"','"+_venta.txtPrecio.getText()+"','"+_venta.txtCantidad.getText()+"'");
         JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
         limpiar();//se limpian las cajas de texto
     }
     
     if(e.getSource()==_venta.btnModificar){
            leyenda = _model.editar("ventas", "nombreProducto='"+_venta.txtNombreProducto.getText()+"' , precio = '"+_venta.txtPrecio.getText()+"' ,  cantidad= '"+_venta.txtCantidad.getText()+"'", "idProducto = "+_venta.txtIdProducto.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public void iniciar(){
        _venta.setTitle("MVC_Visual");
    }
    public  controlador(frmVenta venta,modelo model){
        this._model=model;
        this._venta=venta;
        this._venta.btnAlta.addActionListener(this);
        this._venta.btnModificar.addActionListener(this);
    }
      public void limpiar(){
        _venta.txtIdProducto.setText(null);  
        _venta.txtNombreProducto.setText(null);
        _venta.txtCantidad.setText(null);
        _venta.txtPrecio.setText(null);
        
    }
}
