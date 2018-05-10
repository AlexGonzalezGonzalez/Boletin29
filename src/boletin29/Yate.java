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
public class Yate extends Barcos {

    int potencia;
    int camarotes;

    public Yate(int potencia, int camarotes, int eslora, int dias, String matricula) {
        super(dias, eslora, matricula);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    @Override
    public void calcularPrecio(Barcos b) {
        System.out.println("Precio: "+(dias*(eslora*10+potencia*3+camarotes*4)));
    } 
}
