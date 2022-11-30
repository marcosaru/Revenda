package empresa.dominio;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(int ano, int quilometragem, String marca, double valor, String tip, String cor, String modelo, String descricao, String cilindrada) {
        super(ano, quilometragem, marca, valor, tip, cor, modelo, descricao);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
