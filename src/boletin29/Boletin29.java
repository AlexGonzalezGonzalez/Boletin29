/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author estudios
 */
public class Boletin29 {

    static ArrayList<Barcos> listaBarcos = new ArrayList();
    static Barcos v1 = new Velero(2, 3, 4, "Velero 1");
    static Barcos y1 = new Yate(1000, 4, 30, 30, "Yate 1");
    static Barcos m1 = new Motor(1, 2, 3, "Motor 1");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaBarcos.add(v1);
        listaBarcos.add(y1);
        listaBarcos.add(m1);
        
        /*
        potencia*3
        camarotes *4
        mastiles *2
        modulo= dias *10+xpotencia*3+camarotes*4+mastiles *2
         */
        for (int i = 0; i < listaBarcos.size(); i++) {
            listaBarcos.get(i).calcularPrecio(listaBarcos.get(i));
        }
                

    }

}
