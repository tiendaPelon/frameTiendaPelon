/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.modelo;
import vista.frmProveedor;

public class controladorPvr implements ActionListener{

    private modelo _model;
    private frmProveedor _proveedor;
   

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String leyenda="";
     
     if(e.getSource()==_proveedor.btnAlta){
         leyenda=_model.altaPvr("proveedor","null,'"+_proveedor.txtNombreProveedor.getText()+"','"+_proveedor.txtTelefono.getText()+"','"+_proveedor.txtEmpresa.getText()+"'");
         JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
         limpiar();//se limpian las cajas de texto
     }
     
     if(e.getSource()==_proveedor.btnModificar){
            leyenda = _model.editarPvr("proveedor","nombre='"+_proveedor.txtNombreProveedor.getText()+"' , telefono = '"+_proveedor.txtTelefono.getText()+"' ,  empresa= '"+_proveedor.txtEmpresa.getText()+"'", "idProveedor = "+_proveedor.txtIdProveedor.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
     
     if(e.getSource()==_proveedor.btnEliminar){
            leyenda=_model.borrarPvr("proveedor","idProveedor="+_proveedor.txtIdProveedor.getText());
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
     
     if(e.getSource()==_proveedor.btnConsultar){
         
           
            List<String> datos = new ArrayList<>();
            String consulta = _model.consultaPvr("proveedor", "idProveedor,nombre,telefono,empresa", "idProveedor>=1");
            datos.addAll(Arrays.asList(consulta.split(",")));

            DefaultTableModel tabla2 = new DefaultTableModel();
            tabla2.addColumn("idProveedor");
            tabla2.addColumn("nombre");
            tabla2.addColumn("telefono");
            tabla2.addColumn("empresa");

            _proveedor.tblMostrar.setModel(tabla2);

            for (int i = 0; i < datos.size(); i += 4) {
                Object[] fila = new Object[4];
                for (int j = 0; j < 4; j++) {
                    fila[j] = datos.get(i + j);
                }
                tabla2.addRow(fila);
            }
     }
    }
    
    public void iniciar(){
        _proveedor.setTitle("MVC_Visual");
    }
    public  controladorPvr(frmProveedor proveedor,modelo model){
        this._model=model;
        this._proveedor=proveedor;
        
        this._proveedor.btnAlta.addActionListener(this);
        this._proveedor.btnModificar.addActionListener(this);
        this._proveedor.btnEliminar.addActionListener(this);
        this._proveedor.btnConsultar.addActionListener(this);
    }
      public void limpiar(){
        _proveedor.txtEmpresa.setText(null);
        _proveedor.txtIdProveedor.setText(null);
        _proveedor.txtNombreProveedor.setText(null);
        _proveedor.txtTelefono.setText(null);
    }
    
}
