/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletoncaldeirachocolate;

/**
 *
 * @author rafap
 */
public class CaldeiraChocolateSingleton {

    private boolean vazia;
    private boolean fervida;
    private static CaldeiraChocolateSingleton instancia;

    private CaldeiraChocolateSingleton() {
        vazia = true;
        fervida = false;
    }

    public static synchronized CaldeiraChocolateSingleton getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolateSingleton();
        }
        return instancia;
    }

    public boolean estaVazia() {
        return vazia;
    }

    public boolean estaFervida() {
        return fervida;
    }

    public void preencher() {
        if (estaVazia()) {
            vazia = false;
            fervida = false;
            // preencher a caldeira com leite e chocolate
        }
    }

    public void drenar() {
        if (!estaVazia() && estaFervida()) {
            // drenar o leite e chocolate fervidos
            vazia = true;
        }
    }

    public void ferver() {
        if (!estaVazia() && !estaFervida()) {
            // colocar em ebulição
            fervida = true;
        }
    }
}
