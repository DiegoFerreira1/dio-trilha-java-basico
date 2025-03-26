package estruturaCondicional;

// Condicional Encadeada --> If, else if, else

public class CondicionalEncadeada {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;
       
       if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
       }
       else if (valorSolicitado == saldo){
            System.out.println("Não pode zerar a conta!");
       }
        else{
            System.out.println("Saldo insuficiente!");
        }
        
    }
}