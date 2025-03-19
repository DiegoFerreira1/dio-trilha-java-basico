package edu.operadores;

public class Operadores {

    public static void main(String[] args) {

         /*  int a, b;
         a = 5; 
         b = 6;

         //Utilizando Operador ternário
         String resultado = (a==b) ? "Verdadeira" : "Falsa";
         System.out.println("Resultado: " + resultado);
         //Utilizando IF/ELSE
         String resultado2;
         if (a == b){ resultado2 = "Verdadeiro"; }
         else{ resultado2 = "Falso"; }          
         System.out.println("Resultado: " + resultado2);
         */

         /* 
         Operadores Relacionais  
         int numero1 = 1;
         int numero2 = 2;

         String nomeUm = "Gleyson";
         String nomeDois = "Gleyson";
         String nomeTres = new String("Gleyson");
         System.out.println(nomeUm == nomeDois); //retorna verdadeiro
         System.out.println(nomeUm == nomeTres); //retorna false, nomeTres é um objeto

         //Metodo de comparação entre variavel e objeto         
         System.out.println(nomeUm.equals(nomeTres)); //com o .equals pode comparar com os objetos


         boolean simNao = (numero1 == numero2);
         System.out.println("Numero 1 é igual a Numero 2? \n" + simNao);

         simNao = (numero1 != numero2);
         System.out.println("Numero 1 é diferente de numero 2? \n" + simNao);

         simNao = (numero1 > numero2);
         System.out.println("Numero 1 é maior que numero 2? \n" + simNao);
         */ 

         /* Operador lógico */
         boolean condicao1 = true;
         boolean condicao2 = false;

         //Verifica com AND e OR
         if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
         }
         if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
         }
         System.out.println("Fim");


    }

    /*
         Operadores - simbolos especiais com significado próprio para a linguagem e estão
                      associados a determinadas operações
            Atribuição - Aritméticos - Unários - Ternário - Relacionais - Lógicos

            1. Atribuição - simbolo: = --> é utilizado para definir o valor inicial ou sobrescrever o valor de uma variavel.
            Em Java definimos um tipo, nome e opcionalmente atribuimos um valor à variavel atraves do operador de atribuição.
            Exemplos de atribuição:
               String nome = "Gleyson"; 
               int idade = 22;
               double peso = 68.5;
               char sexo = 'M'; //aspa simples por ser unico caractere
               boolean doadorOrgao = false;
               Date dataNascimento = new Date();     
            
            2. Aritméticos - é utilizado para realizar operações entre valores numéricos, podendo se tornar ou não
                           uma expressão mais complexa.

            | + adicção | - subtração | * multiplicação | / divisão | 
            
            double soma = 10.5 + 15.7;
            int subtracao = 113 - 25;
            int multiplicacao = 20 * 7;
            int divisao = 15 / 3;
            int modulo = 18 % 3; // resto da divisão
            double resultado = (10 * 7) + (20 / 4);

         3. Unários
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

         4. Ternário - é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
           É similar a uma condição IF normal, porém, toda sua estrutura estará estará em uma unica linha. 

           É representado pelos simbolos (?:) utilizado na sintaxe a seguir:

           <Expressao Condicional> ? <Caso seja true> : <Caso seja false>

            4.1. Utilizando operador ternário: 
            A primeira expressao sempre deve ser booleana: a==b, retorna true ou false
            A segunda expressao deve retornar o tipo de dado esperado: String ou outro tipo correspondente.

            int a, b;
            a = 5; 
            b = 6;
         
            String resultado = (a==b) ? "Verdadeira" : "Falsa";
            System.out.println("Resultado: " + resultado);
         
            4.2. Utilizando o IF / ELSE:
            String resultado;
            if (a == b){
               resultado = "Verdadeiro";
            }
            else{
               resultado = "Falso";
            }          
            System.out.println("Resultado: " + resultado);                       

         5. Operadores Relacionais: Avaliam a relação entre duas variaveis ou expressões. Mais precisamente, definem se o
         operando à esquerda é igual, diferente, menor, menor ou igual, maior, maior ou igual ao da direita.
         É retornado um valor booleano como resultado.

            * == Verifica se uma variável é IGUAL a outra;
            * != Verifica se uma variável é DIFERENTE da outra;
            * > Verifica se uma variável é MAIOR que a outra;
            * >= Verifica se uma variável é MAIOR OU IGUAL a outra;
            * < Verifica se uma variável é MENOR que a outra;
            * <= Verifica se uma variável é MENOR OU IGUAL a outra;

            //Operadores Relacionais  
         int numero1 = 1;
         int numero2 = 2;

         String nomeUm = "Gleyson";
         String nomeDois = "Gleyson";
         String nomeTres = new String("Gleyson");
         System.out.println(nomeUm == nomeDois); //retorna verdadeiro
         System.out.println(nomeUm == nomeTres); //retorna false, nomeTres é um objeto

         //Metodo de comparação entre variavel e objeto         
         System.out.println(nomeUm.equals(nomeTres)); //com o .equals pode comparar com os objetos


         boolean simNao = (numero1 == numero2);
         System.out.println("Numero 1 é igual a Numero 2? \n" + simNao);

         simNao = (numero1 != numero2);
         System.out.println("Numero 1 é diferente de numero 2? \n" + simNao);

         simNao = (numero1 > numero2);
         System.out.println("Numero 1 é maior que numero 2? \n" + simNao);

         */

         /*
           6. Operadores lógicos: Representam o recurso que nos permite criar expressões lógicas
           a partir da junção de duas ou mais expressões.

           As expressões podem contemplar valores booleanos ou expressões relacionais que representa 
           uma valoração ou uma atribuição booleana.

           * && Operador lógico AND "E";
           * || Operador lógico OR "OU";       
         
         boolean condicao1 = true;
         boolean condicao2 = false;

         //Verifica com AND e OR
         if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
         }
         if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
         }
         System.out.println("Fim");

          */
          

    
}


