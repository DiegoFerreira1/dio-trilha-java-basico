# Usando Records em Java

Um `Record`, nada mais é que um tipo de classe que armazena dados. É a mesma ideia de construção similar a um `JavaBean`, possui `construtor`, `atributos` e `métodos acessores`. Porém, ao invés de possibilitar qualquer **alteração a classe é imutável**. Também possui os métodos `equals`, `hashCode` e `toString()`.

**Vantagens a se considerar na utilização de records:**
- Diminuir escrita de código *boilerplate*;
- Tirar a necessidade de bibliotecas que fazem esse trabalho, como por exemplo, *Lombok*;
- Imutabilidade

## Exemplo
Imagine que tenha uma classe `User` com **nome** e **senha** como atributos. Seria necessário essa implementação:
```java
import java.util.Objects;

public class User {

    private String name;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) &&   password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
```

### Usando records, basta declarar:

```java
public record User(String name, String password){}
```

Dado a contexto de **imutabilidade**, existe apenas um construtor com todos os atributos. Também não existem métodos `setter`.

```java
User user = new User("admin", "45454*aa");
```

Outra diferença entre o primeiro design e este usando records é que os métodos acessores não usam a terminologia com “get” apenas o próprio nome do atributo, ou seja, ao invés de `getName()`, apenas `name()`;

```java
String name = user.name();
```

## Usando records para serializar/desserializar classes
Dentre várias possibilidades usando records, uma utilidade seria serializar e desserializar classes que representam payloads de comunicação, também chamados de DTOs.

Testando o Jackson na versão 2.13.0 já é possível utilizar o recurso sem nenhuma configuração específica.

```java
@Test
void shouldDeserializeCorrectly() throws Exception {
    String json =
            """
                {
                    "name": "willyancaetano",
                    "password": "jK%onD2B2Pvt"
                }
            """;

    User user = objectMapper.readValue(json, User.class);
    assertEquals("willyancaetano", user.name());
    assertEquals("jK%onD2B2Pvt", user.password());

}

@Test
void shouldSerializeCorrectly() throws Exception {

    User user = new User("admin", "$JJMwSYskkN^");

    String json = objectMapper.writeValueAsString(user);

    assertTrue(json.contains("admin"));
    assertTrue(json.contains("$JJMwSYskkN^"));
}
```
## E o que mais podemos fazer utilizando Records ?
Existem possibilidades de utilizar records em outros cenários, como por exemplo:

- Referências de registros de base de dados ou qualquer outro data-provider: Pense, registros que são buscados em um banco de dados podem ser records
- Mensagens enviadas e recebidas de comunicação assíncrona

[Referencia](https://medium.com/experiencecode/usando-records-em-java-9afecf7495b3)