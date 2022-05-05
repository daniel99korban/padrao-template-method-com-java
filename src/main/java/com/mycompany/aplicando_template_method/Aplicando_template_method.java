package com.mycompany.aplicando_template_method;

import templates.InstrumentoPadrao;
/**
 * @author Daniel_Korban
 * 
 * Vamos montar nosso instrumento segundo passo a passo de nosso algoritmo
 * Nesse básico exemplo podemos ver que a mpntagem de um instrumento de cordas
 * segue etapas similares com algumas diferenças básicas.
 */
public class Aplicando_template_method {

    public static void main(String[] args) {
        
        // Guitarra ibanez
        InstrumentoPadrao instrumento1 = new GuitarraIbanez();
        instrumento1.montarInstrumento();
        
        // violão clássico
        InstrumentoPadrao instrumento2 = new ViolaoClassico();
        instrumento2.montarInstrumento();
        
        // Guitarra stratocaster comum
        InstrumentoPadrao instrumento3 = new GuitarraStratocaster();
        instrumento2.montarInstrumento();
        
        // SAIDAS
        /*======================
        Corpo de madeira
        Ibanez: Braço parafusado
        trastes convencionais
        ponte floyd rose
        7 cordas
        1 captador single e 2 Humbucker
        ========================
        Corpo de madeira
        Violão Clássico: Braço colado
        trastes convencionais
        ponte fixa
        6 cordas
        caixa de ressonância
        ========================
        Corpo de madeira
        Violão Clássico: Braço colado
        trastes convencionais
        ponte fixa
        6 cordas
        caixa de ressonância
        */
    }
}
