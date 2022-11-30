package empresa.dominio;

public class Meta {
    private int id_meta;
    private double valorVendido;
    private double valorMeta;
    private Colaborador colaborador;
    private Departamento departamento;
    public Meta(){

    }
    public Meta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public Meta(double valorMeta, Departamento departamento) {
        this(valorMeta);
        this.departamento = departamento;
    }

    public Meta(double valorMeta, Colaborador colaborador) {
        this(valorMeta);
        this.colaborador = colaborador;
    }

    public Meta(double valorMeta, Colaborador colaborador, Departamento departamento) {
        this(valorMeta,colaborador);
        this.departamento = departamento;
    }
    public Meta (int id_meta, double valorMeta, Colaborador colaborador, Departamento departamento){
        this(valorMeta, colaborador, departamento);
        this.id_meta = id_meta;
    }

    private int getRandomInt() {
        int min = 20000;
        int max = 30000;
        min = (int)Math.ceil(min);
        max = (int)Math.floor(max);
        return (int)Math.floor(Math.random() * (max - min) + min);
    }

    public int getId_meta() {
        if(id_meta == 0){
            id_meta = getRandomInt();
        }
        return id_meta;
    }

    public void setId_meta(int id_meta) {
        this.id_meta = id_meta;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public int getCodColaborador() {
        return colaborador.getCodigo();
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
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
}
