/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author rafap
 */
public class SingletonInicilizacaoLenta {

    private static SingletonInicilizacaoLenta instancia;

    private SingletonInicilizacaoLenta() {
    }

    public static SingletonInicilizacaoLenta getInstancia() {
        if (instancia == null) {
            instancia = new SingletonInicilizacaoLenta();
        }
        return instancia;
    }
}
