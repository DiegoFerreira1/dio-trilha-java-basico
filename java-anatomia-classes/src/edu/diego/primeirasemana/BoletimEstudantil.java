package edu.diego.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        
        float nota = 7;

        if(nota < 6){
            System.out.println("Nota: " + nota + "\nSituação: Reprovado.");
        } 
        else if(nota == 6){
            System.out.println("Nota: " + nota + "\nSituação: Prova minerva");
        }
        else{
            System.out.println("Nota: " + nota + "\nSituação: Aprovado.");
        }

    }
    
}
