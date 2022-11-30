package empresa.dominio;

import java.util.Date;

public class Veiculo {
    private int ano;
    private int quilometragem;
    private String marca;
    private double valor;
    private int codigo;
    private String tipo;
    private String descricao;
    private String cor;
    private String modelo;
    public Veiculo(){

    }
    public Veiculo(int ano,int quilometragem, String marca, double valor, String tip, String cor, String modelo, String descricao) {
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.marca = marca;
        this.valor = valor;
        this.tipo = tip;
        this.cor = cor;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
