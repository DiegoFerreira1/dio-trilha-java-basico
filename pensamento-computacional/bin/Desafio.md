# Desafio 

Faça um programa que **calcule e imprima** o **salário** a ser transferido para um funcionário. 

Para realizar o cálculo, receba o **valor bruto** do salário e o **adicional** dos benefícios. 

O Salário a ser transferido é calculado da seguinte maneira:

- (valor bruto - percentual de imposto mediante ao salário) + adicional dos benefícios

Para calcular o **percentual de imposto** segue as aliquotas:

1. De R$ 0.00 a R$ 1100.00 --> **5.00%**
2. De R$ 1100.01 a R$ 2500.00 --> **10.00%**
3. Maior que R$ 2500.00 --> **15.00%**

## Entrada
A entrada consistem em vários arquivos de teste, que conterá o **valor bruto do salário** e **adicional de benefícios**.

## Saída
Para cada arquivo de entrada, terá um de saída. E como mencionado no desafio, será gerado uma linha com o número que será a **diferença** entre o **valor bruto** e o **percentual de imposto** mediante a faixa salarial **somando o adicional** dos benefícios.

**Exemplo**
| Entrada | Saída | 
|---------|-------|
| 2500 | 2050.00 |
| 250 | |

# Resolução
## Java
Para ler e escrever dados em java, a fomra mais usual é utilizar o Scanner como leitor de entradas e o System.out.println para imprimir os dados na saída.

```java
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
```