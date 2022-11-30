package empresa.dominio;

public class Agencia {
    int id;
    int telefone;
    String endereco;
    String nome;

    public Agencia(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Agencia(int id, int telefone, String endereco, String nome) {
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
