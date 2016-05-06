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
public class Dna extends Nucleotideo implements Duplicar {


	

    @Override
    public StringBuilder gerar(int tam) {
    	String aminoacido;
        String aminoacido2;
        String rnaTrans;
       public Dna (){
 
        for (int i = 0; i < tam; i++) {
            int n = Nucleotideo.RND.nextInt(4); // Gera um n�mero aleat�rio: 0, 1, 2 ou 3
            aminoacido = ""; // A string que ir� receber todos os amino�cidos criados
            aminoacido2 = ""; // A string para a fita dupla do DNA
            rnaTrans = ""; // A string de transcri��o de DNA para RNA
}
            
            switch (n) {
                case 0:
                    aminoacido = "a"; // Se for 0, a cadeia recebe o amino�cido Adenina
                    aminoacido2 = "t";
                    rnaTrans = "u";
                    break;
                case 1:
                    aminoacido = "c"; // Se for 1, a cadeia recebe o amino�cido Citosina
                    aminoacido2 = "g";
                    rnaTrans = "g";
                    break;
                case 2:
                    aminoacido = "g"; // Se for 2, a cadeia recebe o amino�cido Guanina
                    aminoacido2 = "c";
                    rnaTrans = "c";
                    break;
                case 3:
                    aminoacido = "t"; // Se for 3, a cadeia recebe o amino�cido Timina
                    aminoacido2 = "a";
                    rnaTrans = "a";
                    break;
                default:
                    throw new AssertionError();
            }
            
            getCadeia().append(aminoacido);
            getCadeia2().append(aminoacido2);
            getRnaTranscrito().append(rnaTrans);
        }
        
        getCadeia().toString().toUpperCase(); // Faz a cadeia ir para caixa alta
        getCadeia2().toString().toUpperCase();
        getRnaTranscrito().toString().toUpperCase();
        
        return getCadeia(); // Manda a cadeia aleat�ria gerada de volta para a classe Nucleot�deo

        
    }
    

    
    public void duplicar(){
        System.out.println("Duplicando cadeia de DNA..."); // Se for DNA ele ir� duplicar a cadeia
    }
    
    
}
