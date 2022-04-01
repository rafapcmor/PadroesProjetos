/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author rafap
 */
public class ProdutorFactory {

    public static AbstractFactory getFactory(boolean arrendondado) {

        if (arrendondado) {
            return new FormaArredondadaFactory();
        } else {
            return new FormaFactory();
        }
    }
}
