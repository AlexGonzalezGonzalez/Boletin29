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
public abstract class Barcos {
    
    int dias;
    int eslora;
    String matricula;

    public Barcos(int dias, int eslora, String matricula) {
        this.dias = dias;
        this.eslora = eslora;
        this.matricula = matricula;
    }
    
    public abstract void calcularPrecio(Barcos b);
        
    
}
