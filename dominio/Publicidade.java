package empresa.dominio;

public class Publicidade {
    String descricao;
    double custo;
    int codigo;
    int id_colaborador;
    public Publicidade (String descricao,double custo){
        this.descricao = descricao;
        this.custo = custo;
    }
    public Publicidade(String descricao, double custo, int id_colaborador) {
        this(descricao,custo);
        this.id_colaborador = id_colaborador;
    }

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public String getDescricao() {
        return descricao;
    }
    private int getRandomInt() {
        int min = 10000;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}