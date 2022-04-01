/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author rafap
 */
public class SingletonInicializacaoRapida {
    private static final SingletonInicializacaoRapida instancia = new SingletonInicializacaoRapida();
     
    private SingletonInicializacaoRapida(){
    }
 
    public static SingletonInicializacaoRapida getInstancia(){
        return instancia;
    }
}
