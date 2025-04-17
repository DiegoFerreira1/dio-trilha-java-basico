# Exemplo prático de Interface em Java

## Classe principal 

```java
package iinterface.estabelecimento;

import iinterface.copiadora.Copiadora;
import iinterface.copiadora.Xerox;
import iinterface.digitalizadora.Digitalizadora;
import iinterface.digitalizadora.Laserjet;
import iinterface.impressora.Deskjet;
import iinterface.impressora.Impressora;
import iinterface.multifuncional.Multifucional;

public class Fabrica {
    public static void main(String[] args) {

        System.out.println("-------------------------------");

        Impressora impressora = new Deskjet();
        impressora.imprimir();

        System.out.println("-------------------------------");

        Digitalizadora digitalizadora = new Laserjet();
        digitalizadora.digitalizar();

        System.out.println("-------------------------------");

        Copiadora copiadora = new Xerox();
        copiadora.copiar();

        System.out.println("-------------------------------");
        System.out.println("Utilizando uma multifuncional");

        Multifucional multifucional = new Multifucional();

        multifucional.imprimir();
        multifucional.digitalizar();
        multifucional.copiar();

        // O Equipamento multifuncional pode ser qualquer equipamento especifico
        Impressora impressora2 = multifucional;
        Digitalizadora digitalizadora2 = multifucional;
        Copiadora copiadora2 = multifucional;
    }
    
}
``` 

## Interface Copiadora e classe Xerox

```java
package iinterface.copiadora;

public interface Copiadora {

    public void copiar();
    
}
```
```java
package iinterface.copiadora;

public class Xerox implements Copiadora {

    @Override
    public void copiar(){
        System.out.println("COPIANDO XEROX");
    }
    
}
```

## Interface Digitalizadora e classe Laserjet

```java
package iinterface.digitalizadora;

public interface Digitalizadora {

    public void digitalizar();
    
}

```
```java
package iinterface.digitalizadora;

public class Laserjet implements Digitalizadora {
    
    @Override
    public void digitalizar(){
        System.out.println("DIGITALIZANDO LASERJET");
    }
    
}
```

## Interface Impressora e classe Deskjet

```java
package iinterface.impressora;

public interface Impressora {

    public void imprimir();
    
}

```


```java
package iinterface.impressora;

public class Deskjet implements Impressora {
    
    @Override
    public void imprimir(){
        System.out.println("IMPRIMINDO DESKJET");
    }
    
}

```

## Classe Multifuncional que implementou Copiadora, Digitalizadora, Impressora

```java
package iinterface.multifuncional;

import iinterface.copiadora.Copiadora;
import iinterface.digitalizadora.Digitalizadora;
import iinterface.impressora.Impressora;

/*
 Como java nao permite multiplos extends, onde Multifucional iria estender de Copiadora, Digitalizadora e Impressora
 Utilizaremos interface e no lugar do extends usaremos o implements.
 */

public class Multifucional implements Copiadora, Digitalizadora, Impressora {

    // Abaixo os metodos usam @Override pq estão sobrescrevendo o método original da interface original
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL ");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");
    }
    
}
```



