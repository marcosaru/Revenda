package empresa.use;

import javax.swing.table.AbstractTableModel;

public class ClassTableModel extends AbstractTableModel {
    private String opcao;

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    private String[] colunas = {};
    private String[] colunasCarro = {"Valor", "Ano", "Marca", "Código", "Cor", "Tipo", "Quilometragem", "Descrição"};
    private String[] colunasCliente = {"CPF", "Nome", "Telefone"};
    private String[] colunaAgencia = {"Código", "Nome", "Telefone", "Endereço"};
    private String[] colunasColaborador = {"CPF", "Nome", "Código", "Departamento", "Salario"};
    private String[] colunaDepartamento = {"Código", "Nome", "Telefone", "Multiplicador"};
    private String[] colunaNegocio = {"Numero nota", "Tipo","Data","Valor","Cod_veiculo","CPF do cliente","Código do colaborador"};
    private String[] colunaMetas = {"Código da Meta","Valor Vendido", "Valor da Meta", "Código do Colaborador"};
    private String[] colunaPublicidade = {"Código", "Custo","Descrição", "Código do Colaborador"};
    private String[] colunaPecaMaterial = {"Código", "Nome", "Valor", "Quantidade"};
    private String[] colunaRevisao = {"Código", "Data", "Laudo", "Código do Veículo"};
    private String[] colunaRevPeca = {"Quantidade","Valor Total","Código da Peça","Código da Revisão"};
    private String[] colunaConsulta1 = {"Código do Veiculo","Marca","Valor total"};
    private String[] getColunaConsulta2 = {"Nome do Vendedor", "Codigo do Vendedor","Marca","Quantidade","Valor Total"};
    private String[] getColunaConsulta3 = {"Nome do Vendedor","Marca","Codigo Revisao","Valor Total"};
    private String[] colunaCarro = {"Código","Marca","Modelo","Quilometragem","Valor","Cor","Tipo","Aro","Ano","Descrição"};
    private String [] colunaMoto = {"Código","Marca","Modelo","Quilometragem","Valor","Cor","Cilindrada","Ano","Descrição"};
    private Object[][] dados = {
            {"2018", "0", "Fiat", "10000", "1", "Carro", "Carro", "Preto", "Uno","Uno"},
            {"2020", "10000", "Ford", "65000", "2023", "Sedan", "Carro", "Branco", "Fiesta","Uno"},
    };

    public ClassTableModel(String opcao) {
        if (opcao.equals("veiculo")) {
            this.colunas = colunasCarro;
        } else if (opcao.equals("cliente")) {
            this.colunas = colunasCliente;
        } else if (opcao.equals("agencia")) {
            this.colunas = colunaAgencia;
        } else if (opcao.equals("colaborador")) {
            this.colunas = colunasColaborador;
        }else if (opcao.equals("departamento")) {
            this.colunas = colunaDepartamento;
        }else if (opcao.equals("negocio")) {
            this.colunas = colunaNegocio;
        }else if(opcao.equals("meta")){
            this.colunas = colunaMetas;
        }else if(opcao.equals("publicidade")){
            this.colunas = colunaPublicidade;
        }else if(opcao.equals("peca_material")){
            this.colunas = colunaPecaMaterial;
        } else if (opcao.equals("revisao")) {
            this.colunas = colunaRevisao;
        } else if (opcao.equals("revisao_peca")) {
            this.colunas = colunaRevPeca;
        }else if(opcao.equals("consulta1")){
            this.colunas = colunaConsulta1;
        } else if (opcao.equals("consulta2")) {
            this.colunas = getColunaConsulta2;
        } else if (opcao.equals("consulta3")) {
            this.colunas = getColunaConsulta3;
        } else if (opcao.equals("carro")) {
            this.colunas = colunaCarro;
        } else if (opcao.equals("moto")) {
            this.colunas = colunaMoto;
        }
        this.opcao = opcao;
    }

    public Object[][] getDados() {
        return dados;
    }

    public void setDados(Object[][] dad) {
        this.dados = dad;
    }

    @Override
    public int getRowCount() {
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int col) {
        return colunas[col];
    }

    @Override
    public Object getValueAt(int linha, int col) {
        return dados[linha][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int linha, int col) {
        return false;
    }

    public void setValueAt(Object value, int row, int col) {
        dados[row][col] = value;
        fireTableCellUpdated(row, col);
    }

}
