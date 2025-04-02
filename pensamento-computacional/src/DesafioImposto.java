import java.util.Scanner;

public class DesafioImposto{
    public static void main(String [] args){

        //Para ler os dados de entrada
        Scanner leitorScan = new Scanner(System.in);
        System.out.println("Informe o valor do salário: ");
        float valorSalario = leitorScan.nextFloat();
        System.out.println("Informe o valor dos benefícios: ");
        float valorBeneficios = leitorScan.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            //Atribuindo a aliquota de 5%
            valorImposto = 0.05F * valorSalario;
        }else if(valorSalario > 1100 && valorSalario <= 2500){
            // Atribuindo a aliquota de 10%
            valorImposto = 0.10F * valorSalario;
        }else{
            // Atribuindo a aliquota de 15%
            valorImposto = 0.15F * valorSalario;
        }

        //Calculando e imprimindo as saídas com 2 casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));       

    }

}