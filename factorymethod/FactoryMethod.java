/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author rafap
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormaFactory formaFactory = new FormaFactory();

        Forma forma1 = formaFactory.getForma(FormaFactory.Tipo.CIRCULO);
        forma1.desenhar();

        Forma forma2 = formaFactory.getForma(FormaFactory.Tipo.POLIGONO);
        forma2.desenhar();

        Forma forma3 = formaFactory.getForma(FormaFactory.Tipo.RETANGULO);
        forma3.desenhar();

    }

}
