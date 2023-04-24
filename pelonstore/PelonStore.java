/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelonstore;
import controlador.controladorPvr;
import modelo.modelo;
import vista.frmProveedor;
/**
 *
 * @author danie
 */
public class PelonStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       frmProveedor objV = new frmProveedor();
        modelo objM = new modelo();
        objV.setVisible(true);
        controladorPvr objC= new controladorPvr(objV,objM);
        
    }
    
}
