package empresa.dominio;

public class Carro extends Veiculo{
    private String tamanhoroda;
    private String tipoCambio;

    public Carro(int ano, int quilometragem, String marca, double valor, String tip, String cor, String modelo, String descricao, String tamanhoroda, String tipoCambio) {
        super(ano, quilometragem, marca, valor, tip, cor, modelo, descricao);
        this.tamanhoroda = tamanhoroda;
        this.tipoCambio = tipoCambio;
    }

    public String getTamanhoroda() {
        return tamanhoroda;
    }

    public void setTamanhoroda(String tamanhoroda) {
        this.tamanhoroda = tamanhoroda;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
