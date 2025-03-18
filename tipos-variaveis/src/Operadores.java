public class Operadores {

    public static void main(String[] args) {





    }




    /*
         Operadores - simbolos especiais com significado próprio para a linguagem e estão
                      associados a determinadas operações
            Atribuição - Aritméticos - Unários - Relacionais - Lógicos - Ternário

            Atribuição - simbolo: = --> é utilizado para definir o valor inicial ou sobrescrever o valor de uma variavel.
            Em Java definimos um tipo, nome e opcionalmente atribuimos um valor à variavel atraves do operador de atribuição.
            Exemplos de atribuição:
               String nome = "Gleyson"; 
               int idade = 22;
               double peso = 68.5;
               char sexo = 'M'; //aspa simples por ser unico caractere
               boolean doadorOrgao = false;
               Date dataNascimento = new Date();     
            
            Aritméticos - é utilizado para realizar operações entre valores numéricos, podendo se tornar ou não
                           uma expressão mais complexa.

            | + adicção | - subtração | * multiplicação | / divisão | 
            
            double soma = 10.5 + 15.7;
            int subtracao = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3; // resto da divisão
            double resultado = (10 * 7) + (20 / 4);
          
         */

         /*
          Unários
         Esses operadores são aplicados juntamente com um outro operador aritmético. 
         Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

            (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

            (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

            (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

            (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

            (!) Operador unário lógico de negação – nega o valor de uma expressão booleana 

            //classe Operadores.java
            int numero = 5;
                    
            //Imprimindo o numero negativo
            System.out.println(- numero);

            //incrementando numero em mais 1 numero, imprime 6
            numero ++;
            System.out.println(numero);

            //incrementando numero em mais 1 numero, imprime 7
            System.out.println(numero ++);// ops algo de errado não está certo

            System.out.println(numero);// agora sim, numero virou 7

            //ordem de precedencia conta aqui
            System.out.println(++ numero);

            //Negação de expressão booleana
            boolean variavel = true;
            System.out.println("Inverteu " + !verdadeiro); // Muda apenas na memoria
            System.out.println("Inverteu " + verdadeiro); // Muda apenas na memoria

            variavel = !variavel; // inverte o valor da variavel para true ou false dependendo do valor inicial.

            int numeroUm = 5;
            int numeroDois = 5;
            int numeroTres = 2;
            int numeroQuatro = 10;

            //incremento 
            numeroUm = numeroUm + 2;
            numeroDois += 2;    

            System.out.println("Numero UM: " + numeroUm + "\nNumero DOIS: " + numeroDois);
            //Serve para incremento ++ e decremento --
            System.out.println(numeroQuatro ++);  //Operador no sufixo incrementa na proxima iteração
            System.out.println(numeroQuatro); //Incrementa aqui
            System.out.println(++ numeroQuatro); // Operador no prefixo ja incrementa o ++;
           

            //negativo / positivo
            numeroTres = - numeroTres;
            System.out.println(numeroTres);
            // numeroTres = + numeroTres; forma errada para converter em positivo
            numeroTres = numeroTres * -1; //forma correta
            System.out.println(numeroTres);

          */
          

    
}


