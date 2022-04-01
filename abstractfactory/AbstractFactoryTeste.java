/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author rafap
 */
public class AbstractFactoryTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory ff1 = ProdutorFactory.getFactory(false);
        Forma f1 = ff1.getForma(TipoForma.RETANGULO);
        f1.desenhar();
        
        Forma f2 = ff1.getForma(TipoForma.CIRCULO);
        f2.desenhar();
        
        AbstractFactory ff2 = ProdutorFactory.getFactory(true);
        Forma f3 = ff2.getForma(TipoForma.RETANGULO);
        f3.desenhar();
        
        Forma f4 = ff2.getForma(TipoForma.CIRCULO);
        f4.desenhar();
        
        
    }
    
}
