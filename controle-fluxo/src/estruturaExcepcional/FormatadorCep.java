package estruturaExcepcional;

public class FormatadorCep {

    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println("Cep formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println(" CepInvalidoException: O CEP não corresponde com as regras de negócio.");
        }


    } // main
    

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    } //Formatador


} // class
