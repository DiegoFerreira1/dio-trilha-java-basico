public class Carro extends Veiculo {

    public Carro(String tipo, String modelo, String cor) {
        super(tipo, modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("Carro " + getModelo() + "\nCor: " + getCor() + "\nligado com chave eletrônica.");
    }
}
