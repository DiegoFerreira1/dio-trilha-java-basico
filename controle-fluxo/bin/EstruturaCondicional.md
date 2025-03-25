# Controle de fluxo

## Conceito
Controle de fluxo é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

### Obejetivo
Apresentar os conceitos e explorar os tipos de fluxos condicional, excepcional e de repetição em uma aplicação java.

## Assuntos
- **Estruturas de repetição**: for, while, do-while

>- **Estruturas condicionais**: if-else, switch-case

- **Estruturas de exceções**: try-catch-finally, throw


# 1. Estruturas condicionais
A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser **Simples** ou **Composta**.

## condicionais Simples
Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura **Simples**, exemplo:
![condicionalSimples](/src/img/condSimp.png)

**Exemplo de condicional SIMPLES**
```java
//Condicional Simples --> Apenas If e saída da condicional
public class CondicionalSimples {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 26.0;
       
       if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println("Saldo atual: " + saldo);

    }
}
```

## Condicionais compostas
Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condionado a uma regra de negócio, este cenário é demoninado **Estrutura Condicional Composta**. Vejamos o exemplo abaixo:
![condicionalComposta](/src/img/condComp.png)

**Exemplo de condicional COMPOSTA**
```java
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
```
> Vale ressaltar aqui que no Java em uma condição **`if/else`** as vezes necessitamos adicionar um bloco de **`{ }`** se a lógica conter mais de uma linha.

## Condicionais encadeadas
Em um controle de fluxo condicional, nem sempre nos limitamos ao **se** (`if`) e **senão** (`else`), poderemos ter uma terceira, quarta e ou inúmeras condições.
![condEncade](/src/img/condEncadeada.png)

**Exemplo**
```java
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
```

## Condição ternária
Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso:

```java
// Cenário 1
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
```

```java
// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
```

## Switch Case
A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando **break** no final de cada bloco de códigos. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

| Sigla | Tamanho |
|-------|---------|
| P | PEQUENO |
| M | MÉDIO|
| G | GRANDE |

```java
// SistemaMedida.java

// Modo condicional if/else
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}
```

```java
// SistemaMedida.java

// Modo condicional switch / case
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}
```
> Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação em informar a palavra break em cada alternativa.

Porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme ilustração abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

- O sistema terá 03 planos: BASIC, MIDIA , TURBO

- BASIC: 100 minutos de ligação

- MIDIA: 100 minutos de ligação + Whats e Intagram grátis

- TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube

```java
// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
```

```java
// Modo condicional switch/case
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
```

> Se optarem por usar **switch / case**, estudem um pouco mais sobre os conceitos de **continue**, **break** e **default**