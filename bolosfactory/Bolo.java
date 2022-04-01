/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolosfactory;

/**
 *
 * @author rafap
 */
public abstract class Bolo {

    private String nome;
    private String tipo; // com ou sem ovo
    private Float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public abstract void receita();

    public void sobreoBolo() {
        System.out.println("Bolo de " + nome);
        System.out.println("Meu preço é " + preco);
    }

}
