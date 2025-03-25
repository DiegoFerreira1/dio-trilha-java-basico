package condicional;

// Condicional composta --> If e Else

public class CondicionalComposta {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;
       
       if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
       }
        else{
            System.out.println("Saldo insuficiente!");
        }
        
    }
}