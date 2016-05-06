/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Jamilly
 */

import java.util.Random; 

public abstract class Nucleotideo {
	
    public static final Random RND = new Random(System.nanoTime());
    
    public Nucleotideo() {
		cadeia = new StringBuilder();
		cadeia2 = new StringBuilder();
		rnaTranscrito = new StringBuilder();
	}
    
    public Nucleotideo(StringBuilder cadeia, StringBuilder cadeia2, StringBuilder rnaTranscrito){
    	this.cadeia = cadeia;
    	this.cadeia2 = cadeia2;
    	this.rnaTranscrito = rnaTranscrito;
    }
    
    public Nucleotideo(Nucleotideo n){
    	this.cadeia=n.cadeia;
    	this.cadeia2=n.cadeia2;
    	this.rnaTranscrito=n.rnaTranscrito;
    	
    }
    private StringBuilder cadeia;
    private StringBuilder cadeia2;
    private StringBuilder rnaTranscrito;
  

    public abstract StringBuilder gerar(int tam);

    /**
     * @return the cadeia
     */
    public StringBuilder getCadeia() {
        return cadeia;
    }

    /**
     * @param cadeia the cadeia to set
     */
    public void setCadeia(StringBuilder cadeia) {
        this.cadeia = cadeia;
    }
    
        public StringBuilder getCadeia2() {
        return cadeia2;
    }

    /**
     * @param cadeia2
     */
    public void setCadeia2(StringBuilder cadeia2) {
        this.cadeia2 = cadeia2;
    }
    
    public StringBuilder getRnaTranscrito() {
        return rnaTranscrito;
    }

    /**
     *
     * @param rnaTranscrito
     */
    public void setRnaTranscrito(StringBuilder rnaTranscrito) {
        this.rnaTranscrito = rnaTranscrito;
    }
}
