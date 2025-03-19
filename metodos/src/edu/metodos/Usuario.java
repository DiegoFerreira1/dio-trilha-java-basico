package edu.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();

        //Verificando o status da TV:
        System.out.println("\n TV Ligada?: " + tv.ligada);
        System.out.println("\n Volume atual: " + tv.volume);
        System.out.println("\n Canal atual: " + tv.canal);
        System.out.println("------------------------------------------------------");

        tv.ligar();
        System.out.println("\n TV Ligada?: " + tv.ligada);
        tv.aumentarVolume(); //aumenta + 1 -> 26
        tv.aumentarVolume(); // aumenta + 1 -> 27        
        tv.diminuirVolume(); // diminui -1 -> 26
        
        tv.avancarCanal(); // Vai para o canal 2
        tv.avancarCanal(); // Vai para o canal 3
        tv.voltarCanal(); // Volta para o canal 2
        tv.mudarCanal(13); // Vai para o canal 13
        tv.voltarCanal(); // Vai para o canal 12

        tv.desligar();
        System.out.println("\n TV Ligada?: " + tv.ligada);
    }   
    
}
