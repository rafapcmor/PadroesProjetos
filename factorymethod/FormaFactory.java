/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author rafap
 */
public class FormaFactory {

    public enum Tipo {
        CIRCULO, RETANGULO, POLIGONO;
    }

    public Forma getForma(Tipo tipo) {
        Forma forma = null;
        switch (tipo) {
            case CIRCULO:
                forma = new Circulo();
                break;
            case RETANGULO:
                forma = new Retangulo();
                break;
            case POLIGONO:
                forma = new Poligono();
        }
        return forma;
    }
}

