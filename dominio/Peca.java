package empresa.dominio;

public class Peca {
    private String nome;
    private int qtd;
    private double preco;
    private int codigo;

    public Peca(String nome, int qtd, double preco) {
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
        this.codigo = getCodigo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getRandomInt() {
        int min = 1000;
        int max = 99999;
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        return (int)Math.floor(Math.random() * (max - min) + min);
    }
    public int getCodigo() {
        if(codigo == 0){
            codigo = getRandomInt();
        }
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
