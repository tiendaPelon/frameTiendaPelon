/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelonstore;
import controlador.controlador;
import modelo.modelo;
import vista.frmVenta;
/**
 *
 * @author danie
 */
public class PelonStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       frmVenta objV = new frmVenta();
        modelo objM = new modelo();
        objV.setVisible(true);
        controlador objC= new controlador(objV,objM);
        
    }
    
}
