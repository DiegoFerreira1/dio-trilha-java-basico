# Interface em Java

## Introdução
**Observação**: Não confundir com interface gráfica.

A **Interface** é um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente. 

> Pode-se dizer, a grosso modo, que uma interface é um contrato que quando assumido por uma classe deve ser implementado.

## Utilizando interface em Java
Dentro das interfaces existem somente assinaturas de métodos e propriedades, cabendo à classe que a utilizará realizar a implementação das assinaturas, dando comportamentos práticos aos métodos.

Abaixo é possível ver um exemplo de uma interface chamada FiguraGeometrica com três assinaturas de métodos que virão a ser implementados pelas classes referentes às figuras geométricas.

```java
public interface FiguraGeometrica
{
 public String getNomeFigura();
 public int getArea();
 public int getPerimetro();
}
```
Para realizar a chamada/referência a uma interface por uma determinada classe, é necessário adicionar a palavra-chave `implements` ao final da assinatura da classe que irá implementar a interface escolhida.

```java
public class nome_classe  implements nome_interface
```
**Onde:**
- `nome_classe` – Nome da classe a ser implementada.
- `nome_Interface` – Nome da interface a se implementada pela classe.

Abaixo é possível ver duas classes que implementam a interface `FiguraGeometrica`, uma chamada `Quadrado` e outra `Triangulo`.

## Classe Quadrado
```java
/**
 *
 * @author Robson Fernando Gomes
 */
public class Quadrado implements FiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;

        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;

        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }
}
```

## Classe Triangulo

```java
/**
 *
 * @author Robson Fernando Gomes
 */
public class Triangulo implements FiguraGeometrica {

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }

    @Override
    public int getArea() {
        int area = 0;
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = ladoA + ladoB + ladoC;

        return perimetro;
    }
}
```

Como é possível ver acima, ambas as classes seguiram o contrato da interface `FiguraGeometrica`, porém cada uma delas a **implementou** de maneira diferente.

Ao contrário da herança que limita uma classe a herdar somente uma classe pai por vez, é possível que uma classe implemente varias interfaces ao mesmo tempo.

Imagine, por exemplo, uma interface chamada `Veiculo` e outra chamada `Motor`.

## Interface Veiculo

```java
/**
 *
 * @author Robson Fernando Gomes
 */
public interface Veiculo {

    public String getNome();
    public String getId();
}
```
## Interface Motor
```java
/**
 *
 * @author Robson Fernando Gomes
 */
public interface Motor {

    public String getModelo();
    public String getFabricante();
}
```

A seguir é possível visualizar a implementação das interfaces em uma classe chamada `Carro`.
```java
/**
 *
 * @author Robson Fernando Gomes
 */
public class Carro implements Veiculo,Motor{

    @Override
    public String getId() {

   }

    @Override
    public String getNome() {

    }

    @Override
    public String getFabricante() {

    }

    @Override
    public String getModelo() {

    }
  
}
```

## Conclusão
Por fim, interface nada mais que uma espécie de contrato de regras que uma classes deve seguir em um determinado contexto. Como em Java não existe herança múltipla, a interface passa a ser uma alternativa.

> Créditos: [devmedia](https://www.devmedia.com.br/entendendo-interfaces-em-java/25502)