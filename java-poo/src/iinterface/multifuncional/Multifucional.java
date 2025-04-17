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
