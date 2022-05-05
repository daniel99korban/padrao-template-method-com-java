package com.mycompany.aplicando_template_method;

import templates.InstrumentoPadrao;

/**
 * @author Daniel_Korban
 */
public class ViolaoClassico extends InstrumentoPadrao{
    @Override
    protected void braco() {
        System.out.println("Violão Clássico: Braço colado");
    }

    @Override
    protected void escalasTrastes() {
        System.out.println("trastes convencionais");
    }

    @Override
    protected void ponte() {
        System.out.println("ponte fixa");
    }

    @Override
    protected void qtdCordas() {
        System.out.println("6 cordas");
    }

    @Override
    protected void captadores() {
        System.out.println("caixa de ressonância");
    }
}
