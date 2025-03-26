package estruturaRepeticao;

public class EstruturaFor {

    public static void main(String [] args){

        /*  Contador simples utilizando o for

        for(int carneirinho = 1; carneirinho <= 20; carneirinho ++ ){
            System.out.println("Carneirinhos: " + carneirinho);
        }
        System.out.println("Joaozinho dormiu!");
        */

        // Contador vinculado a um conjunto de Arrays
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    

        
    
        
    } // mais

    
} //Classe EstruturaFor

