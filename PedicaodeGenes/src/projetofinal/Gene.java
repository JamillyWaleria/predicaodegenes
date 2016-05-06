package projetofinal;



public class Gene implements AnaliseCadeia{

//public class Gene extends DNA{
@Override
public void analisarCadeia(StringBuilder args)  {
	
    // read in data
    String start =String.valueOf(args.charAt(0));
    String stop  = String.valueOf(args.charAt(args.length()-1));
    String genome = args.toString();
    System.out.println("genome = '" + genome + "'");
    System.out.println("start  = '" + start  + "'");
    System.out.println("stop   = '" + stop   + "'");

    // encontrando os genes.
    int beg = -1;
    for (int i = 1; i < genome.length() - 2; i++) {
        String codon = genome.substring(i, i+3);

        // start codon
        if (codon.equals(start)) beg = i;

        // códon de terminação?

        if ((codon.equals(stop)) && (beg != -1) && (beg + 3 < i)) {

         //verificar alinhamento de gene putativo
            String gene = genome.substring(beg+3, i);
            if (gene.length() % 3 == 0) {
                System.out.println(gene);
                beg = -1;
            }
        }
    }
}
}