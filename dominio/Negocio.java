package empresa.dominio;

public class Negocio {
    private String tipo;
    private String data;
    private int cod_veiculo;
    private String cpf_cliente;
    private int cod_colaborador;
    private double valor;
    private int numero_nota;

    public Negocio(){

    }
    {
        getNumero_nota();
    }
    public Negocio(String tipo, String data, int cod_veiculo, String cpf_cliente, int cod_colaborador, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.cod_veiculo = cod_veiculo;
        this.cpf_cliente = cpf_cliente;
        this.cod_colaborador = cod_colaborador;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public int getCod_colaborador() {
        return cod_colaborador;
    }

    public void setCod_colaborador(int cod_colaborador) {
        this.cod_colaborador = cod_colaborador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getRandomInt() {
        int min = 1111111;
        int max = 9999999;
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        return (int)Math.floor(Math.random() * (max - min) + min);
    }
    public int getNumero_nota() {
        if(numero_nota == 0){
            numero_nota = getRandomInt();
        }
        return numero_nota;
    }

    public void setNumero_nota(int numero_nota) {
        this.numero_nota = numero_nota;
    }
}
