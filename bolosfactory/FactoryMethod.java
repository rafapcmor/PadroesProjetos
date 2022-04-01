/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bolosfactory;

import java.util.Scanner;

/**
 *
 * @author rafap
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolo bolo = null;
        System.out.println("Qual bolo você gostaria de comer?\n"
                + "FlorestaNegra/Abacaxi/Prestigio/Choconinho");
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();
        scanner.close();
        
        BoloFactory bf = new BoloFactory();
        bolo = bf.fazerBolo(escolha);
        bolo.sobreoBolo();
        
    }
    
}
