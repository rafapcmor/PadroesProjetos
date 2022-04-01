/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author rafap
 */
public class SingletonThreadSeguraDupla {

    private volatile static SingletonThreadSeguraDupla instancia;

    private SingletonThreadSeguraDupla() {
    }

    public static SingletonThreadSeguraDupla getInstancia() {
       if (instancia == null) {
            synchronized (SingletonThreadSeguraDupla.class) {
                SingletonThreadSeguraDupla.instancia = instancia = instancia;
                instancia = SingletonThreadSeguraDupla.instancia;
                if (instancia == null) {
                    SingletonThreadSeguraDupla.instancia = instancia = SingletonThreadSeguraDupla.instancia = instancia = new SingletonThreadSeguraDupla();
                }
            }
        }
        return instancia;
    }
}
