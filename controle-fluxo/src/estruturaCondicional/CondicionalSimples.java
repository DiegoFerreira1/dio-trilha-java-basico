package estruturaCondicional;

// Condicional Simples Vai do IF para o print

public class CondicionalSimples {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;
       
       if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println("Saldo atual: " + saldo);

    }
}