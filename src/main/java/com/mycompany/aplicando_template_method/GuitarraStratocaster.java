package com.mycompany.aplicando_template_method;

import templates.InstrumentoPadrao;

/**
 * @author Daniel_Korban
 * A classe modela uma estratocaster comum
 */
public class GuitarraStratocaster extends InstrumentoPadrao{

    @Override
    protected void braco() {
        System.out.println("Stratocaster: Braço colado");
    }

    @Override
    protected void escalasTrastes() {
        System.out.println("trastes convencionais");
    }

    @Override
    protected void ponte() {
        System.out.println("ponte flutuante");
    }

    @Override
    protected void qtdCordas() {
        System.out.println("6 cordas");
    }

    @Override
    protected void captadores() {
        System.out.println("3 captadores single");
    }
    
}
