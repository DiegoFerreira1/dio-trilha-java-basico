package estruturaRepeticao;

public class EstruturaFor {

    public static void main(String [] args){

        /*  
        //Contador simples utilizando o for

        for(int carneirinho = 1; carneirinho <= 20; carneirinho ++ ){
            System.out.println("Carneirinhos: " + carneirinho);
        }
        System.out.println("Joaozinho dormiu!");
        
        //-------------------------------------------------------------------------

        // Contador vinculado a um conjunto de Arrays
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Em arrays o indice inicia sempre em 0, por isso int x = 0
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
            

        //-------------------------------------------------------------------------

        // Utilização do For Each - está fortemente relacionado a arrays.
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for(String aluno: alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
        */

        //-------------------------------------------------------------------------

        // Utilização do breack e continue

        for(int numero = 1; numero <=5; numero ++){
            if(numero==4)
                //break;
                continue;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?

    

        
    
        
    } // mais

    
} //Classe EstruturaFor

