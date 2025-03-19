package edu.metodos;

public class SmartTV{
    /*
    Vamos criar um exemplo de uma classe para representar uma **SmartTV** onde:

    Ela tenha as características: ligada (boolean), canal (int) e volume (int)

        - Nossa TV poderá ligar e desligar e assim mudar o estado ligada

        - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1

        - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente    
     
     */
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //String resultado = (a==b) ? "Verdadeira" : "Falsa";

    //Métodos ligar e desligar
    public void ligar(){ 
        ligada = true; 
    }
    public void desligar(){ 
        ligada = false; 
    }

    //Método para aumentar e diminuir volume:
    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume: " + volume); 
    }
    public void diminuirVolume(){ 
        volume --; 
        System.out.println("Diminuindo volume: " + volume); 
    }

    //Métodos para passar de canal
    public void avancarCanal(){ 
        canal ++;
        System.out.println("Canal: " + canal); 
    }
    public void voltarCanal(){ 
        canal --; 
        System.out.println("Canal: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }





}
