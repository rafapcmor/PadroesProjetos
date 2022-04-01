/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolosfactory;

/**
 *
 * @author rafap
 */
public class Abacaxi extends Bolo{

    public Abacaxi() {
        setNome("Abacaxi");
        setTipo("com ovos");
        setPreco(89.90f);
    }

    @Override
    public void receita() {
        System.out.println("colocar receita");  
    }
    
    
    
}
