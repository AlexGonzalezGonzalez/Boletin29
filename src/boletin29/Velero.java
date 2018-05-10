/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author estudios
 */
public class Velero extends Barcos{
    int mastiles;

    public Velero(int mastiles,int dias, int eslora, String matricula) {
        super(dias, eslora, matricula);
        this.mastiles=mastiles;
        
    }

    @Override
    public void calcularPrecio(Barcos b) {
        System.out.println("Precio: "+(dias*(eslora*10+mastiles*2)));
        
    }

    

    

  
    
}
