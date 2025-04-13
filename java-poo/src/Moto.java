public class Moto extends Veiculo {

    public Moto(String tipo, String modelo, String cor) {
        super(tipo, modelo, cor);
    }

    @Override
    public void ligar() {
        System.out.println("Moto " + getModelo() + "\nCor: " + getCor() + "\nligada com pedal.");
    }
}
