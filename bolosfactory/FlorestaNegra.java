/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolosfactory;

/**
 *
 * @author rafap
 */
public class FlorestaNegra extends Bolo {
    
    public FlorestaNegra() {
        setNome("Floresta Negra");
        setTipo("sem ovos");
        setPreco(99.90f);
    }

    @Override
    public void receita() {
        System.out.println("colocar receita");  
    }
    
}
