# 🤖Palavras Reservadas
## Objetivo
Apresentar as 52 palavras reservadas organizadas por classificação de usabilidade, considerando as regras da linguagem.
### Assuntos
- Tipos primitivos;
- Classificações;
- Escopo de uso;
- Palavras "opostas".






## Palavras Reservadas em Java
Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por sua finalidades.


### 1. Controle de Pacotes
| Palavra Reservada | Descrição |
|------------------|-----------|
| `package`       | Especifica a que pacote as classes de um arquivo pertence. |
| `import`        | Importa classes e pacotes. |

### 2. Modificadores de Acesso
| Palavra Reservada | Descrição | Tipo de Acesso |
|------------------|------------|-----------|
| `public`        | Define um membro de classe como público. |  **Acesso de qualquer lugar** |
| `private`       | Define um membro de classe como privado. |  **Acesso apenas dentro da classe** |
| `protected`     | Define um membro de classe como protegido. | **Acesso por classes do mesmo pacote e subclasses** |

### 3. Tipos Primitivos
| Palavra Reservada | Descrição |
|------------------|-----------|
| `boolean`       | Tipo de dado booleano (`true` ou `false`). |
| `byte`          | Tipo de dado inteiro de 8 bits. |
| `char`          | Tipo de dado de caractere de 16 bits. |
| `double`        | Tipo de dado de ponto flutuante de 64 bits. |
| `float`         | Tipo de dado de ponto flutuante de 32 bits. |
| `int`           | Tipo de dado inteiro de 32 bits. |
| `long`          | Tipo de dado inteiro de 64 bits. |
| `short`         | Tipo de dado inteiro de 16 bits. |
| `void`          | indica que o método não tem retorno de **valor**. |

### 4. Modificadores de Classes, Variáveis ou Métodos
| Palavra Reservada | Descrição | Observações |
|------------------|-----------|-----------|
| `abstract`      | Define classe ou métodos abstratos | classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata |
| `class`         | Declara uma classe. |
| `extends`       | Indica herança entre classes. | indica a superclasse que a subclasse está estendendo |
| `final`         | Define constantes, classes finais ou métodos que não podem ser sobrescritos. | Impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada |
| `implements`    | Indica que uma classe implementa uma interface. |
| `interface`     | Declara uma interface. |
| *`native`*        | Indica que um método é implementado em código nativo. | indica que um método está escrito em uma linguagem dependente de plataforma, como o C |
| `static`        | Define um membro de classe como estático. | Faz um método ou variável pertencer à classe ao invés das instâncias |
| `strictfp`      | Garante precisão em operações de ponto flutuante. | usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões |
| *`synchronized`*  | Define blocos ou métodos sincronizados para controle de concorrência. | indica que um método só pode ser acessado por uma thread de cada vez |
| `transient`     | Indica que um campo não será serializado. |
| *`volatile`*      | Indica que uma variável pode ser alterada por múltiplas threads. |

### 5. Controle de Fluxo Dentro de um Bloco de Código
| Palavra Reservada | Descrição | Observações |
|------------------|-----------|-----------|
| `break`         | Interrompe a execução de um loop ou switch. | sai do bloco de codigo em que ele está |
| `case`          | Define um caso dentro de um switch. | executa um bloco de código dependendo do teste do switch |
| `continue`      | Faz com que o loop pule para a próxima iteração. | pula a execução do código que viria após essa linha e vai para a próxima passagem do loop |
| `default`       | Define um caso padrão em um switch. | executa esse bloco de codigo caso nenhum dos teste de switch-case seja verdadeiro |
| `do`            | Executa um bloco de código antes de verificar a condição do loop. | executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente |
| `else`          | Define um bloco alternativo para um `if`. | executa um bloco de código alternativo caso o teste if seja falso |
| `for`           | Estrutura de repetição. | usado para realizar um loop condicional de um bloco de código |
| `if`            | Estrutura condicional. | usado para realizar um teste lógico de verdadeiro o falso |
| `return`        | Retorna um valor de um método. |  retorna de um método sem executar qualquer código que venha depois desta linha (também pode retornar uma variável) |
| `switch`        | Estrutura condicional múltipla. | indica a variável a ser comparada nas expressões case |
| `while`         | Estrutura de repetição. | executa um bloco de código repetidamente enquanto a condição for verdadeira |

### 6. Tratamento de Erros
| Palavra Reservada | Descrição | Observações |
|------------------|-----------|-----------|
| `assert`        | Usado para fazer verificações durante a execução. | testa uma expressão condicional para verificar uma suposição do programador |
| `catch`         | Captura exceções em um bloco try-catch. | declara o bloco de código usado para tratar uma exceção |
| `finally`       | Bloco de código que sempre será executado após `try` e `catch`. | bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção |
| `throw`         | Lança uma exceção. | usado para passar uma exceção para o método que o chamou |
| `throws`        | Declara exceções que um método pode lançar. |  indica que um método pode passar uma exceção para o método que o chamou |
| `try`           | Declara um bloco de código que pode gerar exceções. | bloco de código que tentará ser executado, mas que pode causar uma exceção |

### 7. Variáveis de Referência
| Palavra Reservada | Descrição |
|------------------|-----------|
| `new`           |  instancia um novo objeto, chamando seu construtor |
| `super`         | Referencia a superclasse. |
| `this`          | Referencia o próprio objeto da classe. |
| `instanceof`    | Verifica se um objeto é uma instância de uma classe, superclasse ou interface. |

### 8. Palavras Reservadas Não Utilizadas
| Palavra Reservada | Descrição |
|------------------|-----------|
| `const`         | Não utilize para declarar constantes; use public static final |
| `goto`          | não implementada na linguagem Java por ser considerada prejudicial |

### 9. Literais Reservados
| Palavra Reservada | Descrição |
|------------------|-----------|
| `true`          | Representa o valor booleano verdadeiro. |
| `false`         | Representa o valor booleano falso. |
| `null`          | Representa um valor nulo. |

`De acordo com a Java Language Specification, null, true e false são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.`


## 1. Escopo de Uso

| Escopo   | Uso | Palavras | Observação |
|----------|------|----------|------------|
| **Arquivo** | Definição de pacotes e importação | `package`, `import`, `static` | Define a localização e importação de classes. |
| **Classe** | Modificadores de acesso e herança | `public` ou `protected` ou `private` + `final` ou `abstract` + `extends` ou `implements` | `private` apenas em classes internas. |
| **Método** | Modificadores de acesso e retorno | `public` ou `protected` ou `private` + `static` ou `final` ou `abstract` + `void` e `return` | `void` se não houver retorno, `return` se houver. |
| **Atributo** | Modificadores de acesso e tipo de dado | `public` ou `protected` ou `private` + `static` ou `final` + tipo primitivo | Define variáveis dentro da classe. |

---

## 2. Palavras "Opostas" no Java

Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente opostas (antônimas) na linguagem Java, conforme a tabela abaixo:

| Palavra 1  | Palavra 2  | Explicação |
|------------|------------|-------------|
| `package`  | `import`   | `package` determina o diretório real da classe, enquanto `import` informa de onde a classe será importada. Isso evita conflitos entre classes de mesmo nome. |
| `extends`  | `implements` | `extends` indica que uma classe herda outra classe, enquanto `implements` indica que uma classe implementa uma interface. Não podem ser usados de forma intercambiável. |
| `final`    | `abstract`  | `final` impede alterações de valor ou comportamento, enquanto `abstract` exige que subclasses implementem métodos abstratos. **Nota:** Se uma classe contém um único método abstrato, ela precisa ser abstrata. |
| `throws`   | `throw`     | `throws` declara que um método pode lançar uma exceção, enquanto `throw` é usado dentro do método para realmente lançar a exceção. |

---




