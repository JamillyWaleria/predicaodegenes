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
public class Rna extends Nucleotideo implements Ribose {

    @Override
    public StringBuilder gerar(int tam) {


        for (int i = 0; i < tam; i++) {
            int n = Nucleotideo.RND.nextInt(4); // Gera aleatoriamente 0, 1, 2 ou 3
            int m = Nucleotideo.RND.nextInt(20);
            String aminoacido = ""; // A string que irá receber todos os aminoácidos criados
            String aminoacido2 = "";
            String dnaOriginal = "";

            switch (n) {
                case 0:
                    aminoacido = "a"; // Se for o número 0, irá gerar a Adenina
                    dnaOriginal = "t";
                    break;
                case 1:
                    aminoacido = "c"; // Se for o número 1, irá gerar a Citosina
                    dnaOriginal = "g";
                    break;
                case 2:
                    aminoacido = "g"; // Se for o número 2, irá gerar a Guanina
                    dnaOriginal = "c";
                    break;
                case 3:
                    aminoacido = "u"; // Se for o número 3, irá gerar a Uracila
                    dnaOriginal = "a";
                    break;
                default:
                    throw new AssertionError();
            }
            
            switch (m) {
                case 0:
                    aminoacido2 = "a"; // Para Alanina
                    break;
                case 1:
                    aminoacido2 = "r"; // Arginina
                    break;
                case 2:
                    aminoacido2 = "n"; // Asparagina
                    break;
                case 3:
                    aminoacido2 = "d"; // Ácido Aspártico
                    break;
                case 4:
                    aminoacido2 = "e"; // Ácido glutâmico
                    break;
                case 5:
                    aminoacido2 = "c"; // Cisteína
                    break;
                case 6:
                    aminoacido2 = "q"; // Glicina
                    break;
                case 7:
                    aminoacido2 = "f"; // Fenilalanina
                    break;
                case 8:
                    aminoacido2 = "g"; // Glutamina
                    break;
                case 9:
                    aminoacido2 = "h"; // Histidina
                    break;
                case 10:
                    aminoacido2 = "i"; // Isoleucina
                    break;
                case 11:
                    aminoacido2 = "l"; // Leucina
                    break;
                case 12:
                    aminoacido2 = "k"; // Lisina
                    break;
                case 13:
                    aminoacido2 = "m"; // Metionina
                    break;
                case 14:
                    aminoacido2 = "p"; // Prolina
                    break;
                case 15:
                    aminoacido2 = "s"; // Serina
                    break;
                case 16:
                    aminoacido2 = "y"; // Tirosina
                    break;
                case 17:
                    aminoacido2 = "t"; // Treonina
                    break;
                case 18:
                    aminoacido2 = "w"; // Triptofano
                    break;
                case 19:
                    aminoacido2 = "v"; // Valina
                    break;   
                default:
                    throw new AssertionError();
            }

            getCadeia().append(aminoacido);
            getCadeia2().append(dnaOriginal);
            getRnaTranscrito().append(aminoacido2);
        }

        getCadeia().toString().toUpperCase();// Faz a cadeia montada passar para caixa alta
        getCadeia2().toString().toUpperCase();
        getRnaTranscrito().toString().toUpperCase();
        
        return getCadeia(); // Manda a cadeia de volta para a classe Nucleotídeo

    }
   
    public void ribose(){
        System.out.println("Executando ribose...");// Se for RNA ele irá executar ribose
    }
    
    
}

