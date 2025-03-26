package estruturaRepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            // Condição para nao tornar valores negativos
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */     


    } // main

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
       }
    
} // classe
