public class Autodromo {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Carro", "Civic", "Preto");
        Veiculo moto = new Moto("Moto", "Yamaha", "Vermelha");

        carro.ligar(); // Carro Civic ligado com chave eletrônica.
        moto.ligar();  // Moto Yamaha ligada com pedal.

        // Podemos acessar atributos via getter
        //System.out.println(carro.getCor()); // Preto
        //System.out.println(moto.getTipo()); // Moto


    }
    
}
