/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolosfactory;

/**
 *
 * @author rafap
 */
public class BoloFactory implements Factory {

    @Override
    public Bolo fazerBolo(String boloNome) {

        Bolo bolo = null;
        if (boloNome.equalsIgnoreCase("Abacaxi")) {
            bolo = new Abacaxi();
        }
        if (boloNome.equalsIgnoreCase("FlorestaNegra")) {
            bolo = new FlorestaNegra();
        }
        if (boloNome.equalsIgnoreCase("Prestigio")) {
            bolo = new Prestigio();
        }
        if (boloNome.equalsIgnoreCase("Choconinho")) {
            bolo = new Choconinho();
        }
        return bolo;
    }

}
