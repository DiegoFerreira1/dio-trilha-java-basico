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
