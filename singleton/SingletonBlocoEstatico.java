/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author rafap
 */
public class SingletonBlocoEstatico {

    private static SingletonBlocoEstatico instancia;

    private SingletonBlocoEstatico() {
    }

    static {
        try {
            instancia = new SingletonBlocoEstatico();
        } catch (Exception e) {
            throw new RuntimeException("Erro na criação do objeto!");
        }
    }

    public static SingletonBlocoEstatico getInstancia() {
        return instancia;
    }
}
