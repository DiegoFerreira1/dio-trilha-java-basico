package condicional;

public class CondicionalTernario {
    
	public static void main(String[] args) {

        int nota = 7;

        // Resultado escolar utilizando Operador ternario		
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        // Exemplo utilizando if e else
        /* 
        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        */

        //Outro caso de operador ternário encadeado
        int nota2 = 4;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);

        //exemplo utilizando if e else encadeado
        /* 
        if (nota2 >= 7){
            System.out.println("Aprovado");
        }
        else if(nota2 >= 5 && nota2 <7){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
            */

	
}
}