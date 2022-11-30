package empresa.dominio;

public class Revisao {
    private int codigo;
    private String laudo="Sem descrição";
    private String data;
    private int cod_veiculo;

    private double valor;
    public Revisao(String data, int cod_veiculo) {
        this.data = data;
        this.cod_veiculo = cod_veiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private int getRandomInt() {
        int min = 1000;
        int max = 9999;
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        return (int) Math.floor(Math.random() * (max - min) + min);
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

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCod_veiculo() {
        return cod_veiculo;
    }

    public void setCod_veiculo(int cod_veiculo) {
        this.cod_veiculo = cod_veiculo;
    }
}
