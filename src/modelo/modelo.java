/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import pkgws.WSBDpelon_Service;
import pkgws.WSBDpelon;

/**
 *
 * @author danie
 */
public class modelo {
    private WSBDpelon_Service obj1 = new WSBDpelon_Service();
    private WSBDpelon obj=obj1.getWSBDpelonPort();
    private String leyenda;
    private float num;
    public float totalDia(String fecha){
        num = obj.totalDia(fecha);
        return num;
    }
    
}
