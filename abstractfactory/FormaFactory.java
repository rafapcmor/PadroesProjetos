/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author rafap
 */
public class FormaFactory extends AbstractFactory {

    @Override
    public Forma getForma(TipoForma tipo) {
        Forma forma = null;
        switch (tipo) {
            case CIRCULO:
                forma = new Circulo();
                break;
            case RETANGULO:
                forma = new Retangulo();
        }
        return forma;
    }

}
