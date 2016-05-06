/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import javax.swing.JOptionPane;
/**
 *
 * @author Jamilly 
 */

public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	
        Nucleotideo n1 = new Dna(); // Cria uma nova cadeia de Dna
        Nucleotideo n2 = new Rna(); // Cria uma nova cadeia de Rna
        AnaliseCadeia teste= new Gene();
        
        JOptionPane.showMessageDialog(null, "Gerando sequências aleatórias");
        n1.gerar(50); // Gera uma cadeia aleatória com 50 caracteres
        n2.gerar(50); // Gera uma cadeia aleatória com 50 caracteres
        
        teste.analisarCadeia(n1.getCadeia());
        
        
        JOptionPane.showMessageDialog(null, "Sequência de N1:\n" + n1.getCadeia());
        // Utiliza o Instance Of para verificar se é Dna ou Rna
        JOptionPane.showMessageDialog(null, "Analizando N1:");
        if (n1 instanceof Dna){
            ((Dna) n1).duplicar();
        } else if (n1 instanceof Rna){
            ((Rna) n1).ribose();
        }
         // A cadeia dupla do Dna
        JOptionPane.showMessageDialog(null, "Cadeia dupla é:\n" + n1.getCadeia2());

        JOptionPane.showMessageDialog(null, "O Rna Transcrito é:\n" + n1.getRnaTranscrito());
       
        
        
        JOptionPane.showMessageDialog(null, "Sequência de N2:\n" + n2.getCadeia());
        
        JOptionPane.showMessageDialog(null, "A sequência de Proteína gerada é:\n" + n2.getRnaTranscrito());
         // Utiliza o Instance Of para verificar se é Rna ou Dna*/
        JOptionPane.showMessageDialog(null, "Analizando N2:");
        if (n2 instanceof Dna){
            ((Dna) n2).duplicar();
        } else if (n2 instanceof Rna){
            ((Rna) n2).ribose();
        }
        //System.out.println("A cadeia original de Dna era:\n" + n2.getCadeia2());
        JOptionPane.showMessageDialog(null, "A cadeia original de Dna era:\n" + n2.getCadeia2());
    }
    
}