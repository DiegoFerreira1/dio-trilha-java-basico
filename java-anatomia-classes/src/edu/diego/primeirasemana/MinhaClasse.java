package edu.diego.primeirasemana;
public class MinhaClasse {
    public static void main(String [] args){

        String nome = "Jose Diego";
        String sobrenome = "Ferreira da Silva";
        int anoAtual = 2025;
        int anoNasc = 1991;

        System.out.println("Nome: " + nomeCompleto(nome, sobrenome));
        System.out.println("Idade: " + calcularIdade(anoNasc, anoAtual) + " anos de idade");

    }

    public static int calcularIdade (int anoNasc, int anoAtual){
        return anoAtual - anoNasc;                
    }

    public static String nomeCompleto(String nome, String sobremome){
        return nome.concat(" ").concat(sobremome);
    }

}
