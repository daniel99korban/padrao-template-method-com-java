package templates;
/**
 * @author Daniel_Korban
 * Classe que representa uma guitarra eletrica ou acustica 
 */
public abstract class InstrumentoPadrao {
    
    // Metodo esqueleto
    public final void montarInstrumento(){// <final> para evitar ser sobrescrito
        System.out.println("=========================");
        this.corpo();
        this.braco();
        this.escalasTrastes();
        this.ponte();
        this.qtdCordas();
        this.captadores();
    }
    
    void corpo(){
        System.out.println("Corpo de madeira");
    }
    // pode ser parafusado ou colado
    protected abstract void braco();
    // posso ter escalas com trastes extra junbo ou tradicionais
    protected abstract void escalasTrastes();
    // flutuante ou fixa
    protected abstract void ponte();
    // minimo 6 e maximo 7 neste exemplo
    protected abstract void qtdCordas();
    // violão classico não possui captador
    protected abstract void captadores();
    
}
