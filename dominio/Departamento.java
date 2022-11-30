package empresa.dominio;

public class Departamento {
    String nome;
    int cod_departamento;
    int agencia;
    int multiplicador;

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Departamento() {
     }
    public Departamento(String nome,int multiplicador,int agencia) {
        this.agencia = agencia;
        this.nome = nome;
        this.multiplicador = multiplicador;
    }

    public Departamento(String nome,  int multiplicador,int agencia, int cod_departamento) {
        this(nome,multiplicador,agencia);
        this.cod_departamento = cod_departamento;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private int getRandomInt() {
        int min = 1;
        int max = 10;
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        return (int)Math.floor(Math.random() * (max - min) + min);
    }

    public int getCod_departamento() {
        if(cod_departamento == 0){
            cod_departamento = getRandomInt();
        }
        return cod_departamento;
    }

    public void setCod_departamento(int cod_departamento) {
        this.cod_departamento = cod_departamento;
    }
}