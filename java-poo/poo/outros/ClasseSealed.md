# Classes final, sealed e no-sealed

## 🔹 final

- **O que é**: Uma classe marcada como `final` não pode ser estendida.

- **Usado quando**: Você quer impedir que qualquer outra classe herde e modifique seu comportamento.

**Exemplo:**

```java
public final class Utilidades {
    // Nenhuma classe pode estender esta
}
```
## 🔹 sealed

- **O que é**: Uma classe `sealed` limita quais classes podem estendê-la, informando explicitamente quem pode herdar.

- **Requer:** A palavra-chave `permits` com a lista das subclasses permitidas.

- **Usado quando**: Você quer controlar totalmente a hierarquia de herança.

**Exemplo:**

```java

public sealed class Forma permits Circulo, Quadrado {
    // Somente Circulo e Quadrado podem herdar de Forma
}
```

## 🔹 non-sealed

- **O que é**: Uma subclasse de uma `sealed class` pode ser marcada como `non-sealed` para permitir herança livremente a partir dela.

- **Usado quando**: Você quer liberar a herança novamente, mesmo vindo de uma classe selada.

**Exemplo:**

```java
public non-sealed class Circulo extends Forma {
    // Agora outras classes podem estender Circulo
}
```

| Modificador  | Pode ser estendida?       | Controle de herança   |
|--------------|---------------------------|------------------------|
| `final`      | ❌ Não                    | Total                 |
| `sealed`     | ✅ Sim, com limites       | Parcial (`permits`)   |
| `non-sealed` | ✅ Sim, sem limites       | Nenhum                |
