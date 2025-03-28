# 🔍 Debugging em Java

O **debugging** (depuração) é o processo de identificar e corrigir erros no código durante a execução do programa. Em Java, podemos usar ferramentas como **Eclipse, IntelliJ IDEA e Visual Studio Code** para depuração interativa.  

---

## 🛠 Principais Ferramentas e Técnicas de Debugging

### 1️⃣ Uso de Breakpoints  
- Um **breakpoint** é um ponto onde a execução do código **para temporariamente** para análise.  
- Permite inspecionar valores de variáveis e fluxo do programa.  

**🔹 Exemplo no IntelliJ IDEA e Eclipse:**  
1. Clique na margem esquerda ao lado do código para adicionar um **breakpoint**.  
2. Inicie a depuração (**Run → Debug**).  
3. Use **Step Over (F8), Step Into (F7) e Step Out (Shift + F8)** para avançar no código.  

---

### 2️⃣ Exibir Valores das Variáveis  
Durante a depuração, é possível visualizar os valores das variáveis e ver como eles mudam.  
- No painel de variáveis do depurador, você pode **modificar valores em tempo real**.  

---

### 3️⃣ Stack Trace (Rastreamento da Pilha)  
- Quando ocorre uma exceção, o **stack trace** mostra a sequência de chamadas de método até o erro.  
- **Exemplo de stack trace de uma exceção:**  

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Teste.main(Teste.java:5)
```
- Ele mostra que o erro ocorreu na linha 5 do arquivo Teste.java.

### 4️⃣ Logging e Print Statements 
- O uso de `System.out.println()` pode ajudar a depurar códigos simples, mas não é recomendado para códigos complexos.
- Para uma depuração mais profissional, utilize **logging com Log4j ou java.util.logging**.

```java
import java.util.logging.Logger;

public class ExemploDebug {
    private static final Logger logger = Logger.getLogger(ExemploDebug.class.getName());

    public static void main(String[] args) {
        int x = 10;
        logger.info("Valor de x: " + x);
    }
}
```

### 5️⃣ Exceções e Breakpoints Condicionais 
- Você pode configurar **breakpoints condicionais**, onde o código para somente se uma condição específica for atendida.
- Isso evita execuções desnecessárias e ajuda a encontrar bugs mais rapidamente.