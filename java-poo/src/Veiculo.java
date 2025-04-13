public abstract class Veiculo {
    private String tipo;
    private String modelo;
    private String cor;

    //Construtor vazio
    //public Veiculo(){}

    // Construtor com parametros
    public Veiculo(String tipo, String modelo, String cor) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método abstrato
    public abstract void ligar();
}
