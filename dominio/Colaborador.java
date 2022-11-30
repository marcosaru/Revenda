package empresa.dominio;

public class Colaborador {
    String nome;
    String cpf;
    Departamento departamento;
    double salario;
    int codigo;

    public Colaborador() {
    }

    public Colaborador(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Colaborador(String nome, String cpf, Departamento departamento, double salario, int codigo) {
        this(nome, cpf, salario);
        this.departamento = departamento;
        this.codigo = codigo;
    }

    public Colaborador(String nome, String cpf, double salario, Departamento departamento) {
        this(nome, cpf, salario);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public int getCodDepartamento() {
        return departamento.getCod_departamento();
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getCodigo() {
        if (codigo == 0) {
            codigo = getRandomInt();
        }
        return codigo;
    }

    private int getRandomInt() {
        int min = 1000;
        int max = 9999;
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        return (int) Math.floor(Math.random() * (max - min) + min);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
