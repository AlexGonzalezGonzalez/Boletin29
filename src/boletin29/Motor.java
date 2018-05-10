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
public class Motor extends Barcos{
    int potencia;

    public Motor(int potencia,int dias, int eslora, String matricula) {
        super(dias, eslora, matricula);
        this.potencia=potencia;
    }

    @Override
    public void calcularPrecio(Barcos b) {
        System.out.println("Precio: "+(dias*(eslora*10+potencia*3)));
    }
}
