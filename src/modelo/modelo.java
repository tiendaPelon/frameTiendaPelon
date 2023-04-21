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
    private float num;
//    public float totalDia(String fecha){
//        num = obj.totalDia(fecha);
//        return num;
//    }
    String leyenda;
    
    public String Alta (String tabla , String datos){
  
        leyenda=obj.alta(tabla,datos);
        return leyenda;
    }
    
    
    public String editar(String tabla, String datos, String condicion){
      leyenda=obj.editar(tabla, datos, condicion);
      return leyenda;
    }
    
    public String totalDia(String fecha){
        leyenda=obj.totalDia(fecha);
        return leyenda;
    }
    public String productos(String fecha){
        leyenda=obj.totalProducto(fecha);
        return leyenda;
    }
}
