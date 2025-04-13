# Exemplos práticos

```java
public abstract class Veiculo {
    private String tipo;
    private String modelo;
    private String cor;

    //Construtor vazio
    //public Veiculo(){}

    // Construtor com parametros
    public Veiculo(String tipo, String modelo, String cor) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato
    public abstract void ligar();
}

```
As classe Carro e Moto estendem usando `extends` da classe Veiculo

```java
public class Carro extends Veiculo {

    public Carro(String tipo, String modelo, String cor) {
        super(tipo, modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("Carro " + getModelo() + "\nCor: " + getCor() + "\nligado com chave eletrônica.");
    }
}

```

```java
public class Moto extends Veiculo {

    public Moto(String tipo, String modelo, String cor) {
        super(tipo, modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("Moto " + getModelo() + "\nCor: " + getCor() + "\nligada com pedal.");
    }
}
```

A classe Autodromo chamaria todos os métodos, mas encapsulamos os metodos confere cambio e combustivel na classe Carro.

```java
public class Autodromo {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Carro", "Civic", "Preto");
        Veiculo moto = new Moto("Moto", "Yamaha", "Vermelha");

        carro.ligar(); // Carro Civic ligado com chave eletrônica.
        moto.ligar();  // Moto Yamaha ligada com pedal.

        // Podemos acessar atributos via getter
        //System.out.println(carro.getCor()); // Preto
        //System.out.println(moto.getTipo()); // Moto


    }
    
}

```

# Explicação aplicando POO

## 🔹 1. Abstração
Focar no essencial e esconder os detalhes.

- Criamos uma **classe abstrata** Veiculo, que representa qualquer tipo de veículo, com atributos comuns (`tipo`, `modelo`, `cor`) e um método abstrato `ligar()`.

- Não nos preocupamos como o veículo liga — apenas que ele tem um comportamento ligar.

```java
public abstract class Veiculo {
    public abstract void ligar(); // abstração do comportamento
}
```

## 🔹 2. Encapsulamento
Proteger os dados e permitir acesso controlado.

- Os atributos `tipo`, `modelo` e `cor` são private, ou seja, só podem ser acessados por métodos da própria classe.

- Usamos métodos `get` e `set` para acessar ou alterar esses dados de forma segura.

```java
private String modelo;

public String getModelo() {
    return modelo;
}
```

## 🔹 3. Herança
Reaproveitar código de uma classe base (pai).

- `Carro` e `Moto` herdam de `Veiculo` com `extends`.

E- las ganham os atributos (`tipo`, `modelo` e `cor`) e o **contrato** de implementar `ligar()`.

```java
public class Carro extends Veiculo { ... }
public class Moto extends Veiculo { ... }
```

## 🔹 4. Polimorfismo
Um mesmo método se comporta de formas diferentes dependendo do objeto.

Chamamos `ligar()` em um `Veiculo`, mas o comportamento muda conforme o objeto for um `Carro` ou uma `Moto`.

```java
Veiculo v1 = new Carro(...);
Veiculo v2 = new Moto(...);

v1.ligar(); // Saída: Carro ligado com chave eletrônica.
v2.ligar(); // Saída: Moto ligada com pedal.
```

| ✅ Pilar         | 🧩 Onde aparece no exemplo                                           |
|------------------|---------------------------------------------------------------------|
| **Abstração**     | Classe `Veiculo` com o método abstrato `ligar()`                   |
| **Encapsulamento**| Atributos `private` (`tipo`, `modelo`, `cor`) + métodos `get`/`set`|
| **Herança**       | Classes `Carro` e `Moto` usam `extends Veiculo`                    |
| **Polimorfismo**  | O método `ligar()` tem comportamento diferente em `Carro` e `Moto` |
