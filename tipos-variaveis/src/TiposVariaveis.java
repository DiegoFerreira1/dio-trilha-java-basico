public class TiposVariaveis {
    /*
    FAMILIA     |    TIPO PRIMITIVO   |    WRAPPER CLASS    |  TAMANHO
    LÓGICO      |       boolean       |        Boolean      |   1 bit
    LITERAIS    |        char         |       Character     |   1 byte
                |         --          |        String       |   1 byte / cada
    INTEIROS    |        byte         |         Byte        |   1 byte
                |       short         |         Short       |   2 bytes
                |        int          |        Integer      |   4 bytes
                |       long          |         Long        |   8 bytes
    REAIS       |       float         |         Float       |   4 bytes
                |       double        |         Double      |   8 bytes
    
    Tipos primitivos - Valores simples que guardam valores numéricos, caracteres e booleanos
    Classes wrapper - Objetos que empacotam os tipos primitivos
     */

     public static void main(String[] args) {

        //Tipos e variaveis
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo e o L é porque é tipo Long
        float pi = 3.14F; // se nao terminar com F da erro achando que é double
        double salario = 1275.33;

        //java é fortemente tipado - nao permite utilizar o tipo que comporte muitos caracteres em outro que suporte menos.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;
        short numeroCurto2 = (short) numeroNormal; //o casting pega um tipo mais abrangente e converte em um tipo mais especifico

        
        /*
        Variaveis e constantes
         Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo
         As Constantes são valores armazenados em memória que não podem ser modificados depois de declarados.
         Utilizamos a palavra reservada "final" para definir uma constante e o nome dela será em CAIXA ALTA.
         */
        final String BR = "Brasil";
        final float PI = 3.14F;

        /*
        Estudar tipos primitivos e Strings 

        Tipos primitivos - Valores simples que guardam valores numéricos, caracteres e booleanos;
        Strings - é uma classe que representa uma sequência de caracteres alfanuméricos, como letras, números e símbolos;
        o conteudo das String devem estar entre aspas duplas;
        as aspas simples são usadas para definir caracteres (char), enquanto as aspas duplas são usadas para definir strings. 
        É possivel realizar operações de concatenação, converter numeros em inteiros e diversas outras.
        */ 

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




        
     }

}
