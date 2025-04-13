# Pilares da POO

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como Os quatro pilares da orientação a objetos:

## 1. Abstração
Definição: É o ato de esconder os detalhes complexos e mostrar apenas o essencial do objeto.

```java

public abstract class Animal {
    public abstract void emitirSom(); // método abstrato, só a "ideia"
}
```

> Aqui, **Animal** é uma abstração. Não sabemos exatamente como ele faz um som, mas sabemos que ele faz.

## 2. Encapsulamento
Definição: É a ideia de proteger os dados do objeto, permitindo acesso e modificação apenas de formas controladas (getters e setters).

```java
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```
> O atributo `nome` está **protegido** (private), e só pode ser acessado/modificado pelos métodos `getNome()` e `setNome()`.

## 3. Herança
Definição: Permite que uma classe herde atributos e métodos de outra. Facilita o reaproveitamento de código.

```java
public class Animal {
    public void dormir() {
        System.out.println("Dormindo...");
    }
}

public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au Au!");
    }
}
```
A classe **Cachorro** herda o método `dormir()` da classe Animal.

## 4. Polimorfismo
Definição: Permite que o mesmo método se comporte de formas diferentes, dependendo do objeto.

```java

public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
```
Mesmo que `emitirSom()` exista em Animal, ele pode ser **redefinido** (sobrescrito) em Gato.








