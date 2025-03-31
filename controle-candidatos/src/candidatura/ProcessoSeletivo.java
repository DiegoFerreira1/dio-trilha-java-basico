package candidatura;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {        
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        //selecaoCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        


    } 
    
    //Case 1:
    static void analisarCandidato(double salarioPretendido){         
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){ 
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    //Case 2:
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORDANIA"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("\nCandidato: " + candidato + "\nSalário solicitado: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("\nStatus: SELECIONADO.");
                candidatosSelecionados ++;
            }else{
                System.out.println("\nStatus: NÃO SELECIONADO");
            }
            candidatoAtual ++;           
        }
    }

    // Metodo para imprimir selecionados
    static void imprimirSelecionados(){
         String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

         System.out.println("Lista de candidatos com indice: ");

         // For convencional
         for (int i = 0; i < candidatos.length; i++){
   
            System.out.println("Candidato Nº " + (i+1) + ": " + candidatos[i]);
         }

         // For abreviado com for each
         for (String candidato : candidatos) {
            System.out.println("Candidado: " + candidato);
         }

    }

    // Metodo auxiliar para retornar valores entre 1800 e 2200
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Metodo auxiliar que simula a chamada
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }

        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA(S)");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas );
        }
    }



} 
