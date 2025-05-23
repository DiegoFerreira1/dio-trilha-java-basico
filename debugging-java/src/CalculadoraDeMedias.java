import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.2f: ", media);


    } // main


    private static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno );
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

} //class
