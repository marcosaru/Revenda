package empresa.dominio;

public class RevisaoPeca {
    private int id_revisao;
    private int id_pecamaterial;
    private int quantidade;
    private double valor;

    public RevisaoPeca(int id_revisao, int id_pecamaterial, int quantidade) {
        this.id_revisao = id_revisao;
        this.id_pecamaterial = id_pecamaterial;
        this.quantidade = quantidade;

    }

    public int getId_revisao() {
        return id_revisao;
    }

    public void setId_revisao(int id_revisao) {
        this.id_revisao = id_revisao;
    }

    public int getId_pecamaterial() {
        return id_pecamaterial;
    }

    public void setId_pecamaterial(int id_pecamaterial) {
        this.id_pecamaterial = id_pecamaterial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
