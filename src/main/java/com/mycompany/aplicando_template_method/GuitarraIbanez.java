package com.mycompany.aplicando_template_method;

import templates.InstrumentoPadrao;

/**
 * @author Daniel_Korban
 */
public class GuitarraIbanez extends InstrumentoPadrao{
    @Override
    protected void braco() {
        System.out.println("Ibanez: Braço parafusado");
    }

    @Override
    protected void escalasTrastes() {
        System.out.println("trastes convencionais");
    }

    @Override
    protected void ponte() {
        System.out.println("ponte floyd rose");
    }

    @Override
    protected void qtdCordas() {
        System.out.println("7 cordas");
    }

    @Override
    protected void captadores() {
        System.out.println("1 captador single e 2 Humbucker");
    }
    
}
