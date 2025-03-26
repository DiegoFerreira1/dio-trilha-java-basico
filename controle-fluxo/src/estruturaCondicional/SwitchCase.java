package estruturaCondicional;

public class SwitchCase {
    public static void main(String[] args) {
        //Sistema de plano telefonico (Cenário aplicável)
        
        String plano = "M"; //M / T

		//Utilizando if e else encadeado
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}

        // Utilizando o Switch Case (sem os breaks para utilizar os items abaixo da condição)
        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}



        /* 
        // Sistema de medidas (Cenário pouco aplicável)

        // Utilizando no modo condicional if e else encadeado
        String sigla = "P";

        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MEDIO");
        else if(sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");

        // Utilizando o Switch Case
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
            }
            */
                
            
        
        



        }

    }
    
}
