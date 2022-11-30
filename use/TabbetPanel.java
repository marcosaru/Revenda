package empresa.use;

import empresa.dominio.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TabbetPanel extends JFrame {
    private JPanel MainFrame;
    private JPanel tabela;
    private JTabbedPane MainGuides;
    private JButton btnSubmitCliente;
    private JTextField inpNomeCliente;
    private DbFuncitions db;

    {
        DbFuncitions db = new DbFuncitions();
        DadosBanco date = new DadosBanco();
        db.getConnection(date.getHost(), date.getUser(), date.getPassword());
    }


    public JPanel getMainFrame() {
        return MainFrame;
    }

    public void setMainFrame(JPanel mainFrame) {
        MainFrame = mainFrame;
    }

    public JTabbedPane getMainGuides() {
        return MainGuides;
    }

    public void setMainGuides(JTabbedPane mainGuides) {
        MainGuides = mainGuides;
    }

    public JButton getBtnSubmitCliente() {
        return btnSubmitCliente;
    }

    public void setBtnSubmitCliente(JButton btnSubmitCliente) {
        this.btnSubmitCliente = btnSubmitCliente;
    }

    public JTextField getInpNomeCliente() {
        return inpNomeCliente;
    }

    public void setInpNomeCliente(JTextField inpNomeCliente) {
        this.inpNomeCliente = inpNomeCliente;
    }

    public JTextField getInpCpfCliente() {
        return inpCpfCliente;
    }

    public void setInpCpfCliente(JTextField inpCpfCliente) {
        this.inpCpfCliente = inpCpfCliente;
    }

    public JTextField getInpTelefoneCliente() {
        return inpTelefoneCliente;
    }

    public void setInpTelefoneCliente(JTextField inpTelefoneCliente) {
        this.inpTelefoneCliente = inpTelefoneCliente;
    }

    public JPanel getCadCliente() {
        return cadCliente;
    }

    public void setCadCliente(JPanel cadCliente) {
        this.cadCliente = cadCliente;
    }

    public JPanel getCadColaborador() {
        return cadColaborador;
    }

    public void setCadColaborador(JPanel cadColaborador) {
        this.cadColaborador = cadColaborador;
    }

    public JPanel getCadVeiculo() {
        return cadVeiculo;
    }

    public void setCadVeiculo(JPanel cadVeiculo) {
        this.cadVeiculo = cadVeiculo;
    }

    public JPanel getEstoque() {
        return Estoque;
    }


    public JButton getBtnClearColaborador() {
        return btnClearColaborador;
    }

    public void setBtnClearColaborador(JButton btnClearColaborador) {
        this.btnClearColaborador = btnClearColaborador;
    }

    public JButton getBtnClearNegociar() {
        return btnClearNegociar;
    }

    public void setBtnClearNegociar(JButton btnClearNegociar) {
        this.btnClearNegociar = btnClearNegociar;
    }

    public JButton getBtnSubmitRevisao() {
        return btnSubmitRevisao;
    }

    public void setBtnSubmitRevisao(JButton btnSubmitRevisao) {
        this.btnSubmitRevisao = btnSubmitRevisao;
    }

    public JTextField getInpCpfColaborador() {
        return inpCpfColaborador;
    }

    public void setInpCpfColaborador(JTextField inpCpfColaborador) {
        this.inpCpfColaborador = inpCpfColaborador;
    }

    public JTextField getInpCargoColaborador() {
        return inpSalarioColaborador;
    }

    public void setInpCargoColaborador(JTextField inpCargoColaborador) {
        this.inpSalarioColaborador = inpCargoColaborador;
    }

    public JRadioButton getRbMecanico() {
        return rbMecanico;
    }

    public void setRbMecanico(JRadioButton rbMecanico) {
        this.rbMecanico = rbMecanico;
    }

    public JRadioButton getRbMarket() {
        return rbMarket;
    }

    public void setRbMarket(JRadioButton rbMarket) {
        this.rbMarket = rbMarket;
    }

    public JTextField getInpQuilometragemVeiculo() {
        return inpQuilometragemVeiculo;
    }

    public void setInpQuilometragemVeiculo(JTextField inpQuilometragemVeiculo) {
        this.inpQuilometragemVeiculo = inpQuilometragemVeiculo;
    }

    public JTextField getInpValorVeiculo() {
        return inpValorVeiculo;
    }

    public void setInpValorVeiculo(JTextField inpValorVeiculo) {
        this.inpValorVeiculo = inpValorVeiculo;
    }

    public JTextField getInpCorVeiculo() {
        return inpCorVeiculo;
    }

    public void setInpCorVeiculo(JTextField inpCorVeiculo) {
        this.inpCorVeiculo = inpCorVeiculo;
    }

    public JTextField getInpModeloVeiculo() {
        return inpModeloVeiculo;
    }

    public void setInpModeloVeiculo(JTextField inpModeloVeiculo) {
        this.inpModeloVeiculo = inpModeloVeiculo;
    }

    public JTextField getInpCodigoColaboradorDepartamento() {
        return inpCodigoColaboradorDepartamento;
    }

    public void setInpCodigoColaboradorDepartamento(JTextField inpCodigoColaboradorDepartamento) {
        this.inpCodigoColaboradorDepartamento = inpCodigoColaboradorDepartamento;
    }

    public JTextField getInpCodigoVeiculoRevisao() {
        return inpCodigoVeiculoRevisao;
    }

    public void setInpCodigoVeiculoRevisao(JTextField inpCodigoVeiculoRevisao) {
        this.inpCodigoVeiculoRevisao = inpCodigoVeiculoRevisao;
    }

    public JTextField getInpValorRevisao() {
        return inpDataRevisao;
    }

    public void setInpValorRevisao(JTextField inpValorRevisao) {
        this.inpDataRevisao = inpValorRevisao;
    }

    public JTextField getInpDescrisaoRevisao() {
        return inpDescrisaoRevisao;
    }

    public void setInpDescrisaoRevisao(JTextField inpDescrisaoRevisao) {
        this.inpDescrisaoRevisao = inpDescrisaoRevisao;
    }

    public JTextField getInpDataNegociar() {
        return inpDataNegociar;
    }

    public void setInpDataNegociar(JTextField inpDataNegociar) {
        this.inpDataNegociar = inpDataNegociar;
    }

    public JTextField getInpValorNegociar() {
        return inpValorNegociar;
    }

    public void setInpValorNegociar(JTextField inpValorNegociar) {
        this.inpValorNegociar = inpValorNegociar;
    }

    public JRadioButton getRbCompra() {
        return rbCompra;
    }

    public void setRbCompra(JRadioButton rbCompra) {
        this.rbCompra = rbCompra;
    }

    public void setEstoque(JPanel estoque) {
        Estoque = estoque;
    }

    public JPanel getNegociar() {
        return Negociar;
    }

    public void setNegociar(JPanel negociar) {
        Negociar = negociar;
    }

    public JPanel getRevisao() {
        return Revisao;
    }

    public void setRevisao(JPanel revisao) {
        Revisao = revisao;
    }

    public JPanel getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(JPanel departamento) {
        Departamento = departamento;
    }

    public JTextField getInpNomeColaborador() {
        return inpNomeColaborador;
    }

    public void setInpNomeColaborador(JTextField inpNomeColaborador) {
        this.inpNomeColaborador = inpNomeColaborador;
    }

    public JRadioButton getRbVendas() {
        return rbVendas;
    }

    public void setRbVendas(JRadioButton rbVendas) {
        this.rbVendas = rbVendas;
    }

    public JButton getBtnSubmitColaborador() {
        return btnSubmitColaborador;
    }

    public void setBtnSubmitColaborador(JButton btnSubmitColaborador) {
        this.btnSubmitColaborador = btnSubmitColaborador;
    }

    public JTextField getInpMarcaVeiculo() {
        return inpMarcaVeiculo;
    }

    public void setInpMarcaVeiculo(JTextField inpMarcaVeiculo) {
        this.inpMarcaVeiculo = inpMarcaVeiculo;
    }

    public JRadioButton getRbSedan() {
        return rbSedan;
    }

    public void setRbSedan(JRadioButton rbSedan) {
        this.rbSedan = rbSedan;
    }

    public JRadioButton getRbSport() {
        return rbSport;
    }

    public void setRbSport(JRadioButton rbSport) {
        this.rbSport = rbSport;
    }

    public JRadioButton getRbHatch() {
        return rbHatch;
    }

    public void setRbHatch(JRadioButton rbHatch) {
        this.rbHatch = rbHatch;
    }

    public JButton getBtnSubmitVeiculo() {
        return btnSubmitVeiculo;
    }

    public void setBtnSubmitVeiculo(JButton btnSubmitVeiculo) {
        this.btnSubmitVeiculo = btnSubmitVeiculo;
    }

    public JRadioButton getRbCarro() {
        return rbCarro;
    }

    public void setRbCarro(JRadioButton rbCarro) {
        this.rbCarro = rbCarro;
    }

    public JRadioButton getRbMoto() {
        return rbMoto;
    }

    public void setRbMoto(JRadioButton rbMoto) {
        this.rbMoto = rbMoto;
    }

    public JRadioButton getRb150() {
        return rb150;
    }

    public void setRb150(JRadioButton rb150) {
        this.rb150 = rb150;
    }

    public JRadioButton getRb150plus() {
        return rb150plus;
    }

    public void setRb150plus(JRadioButton rb150plus) {
        this.rb150plus = rb150plus;
    }

    public JButton getBtnSubmitClear() {
        return btnSubmitClear;
    }

    public void setBtnSubmitClear(JButton btnSubmitClear) {
        this.btnSubmitClear = btnSubmitClear;
    }

    public JTextField getInpCodigoVendedorNegociar() {
        return inpCodigoVendedorNegociar;
    }

    public void setInpCodigoVendedorNegociar(JTextField inpCodigoVendedorNegociar) {
        this.inpCodigoVendedorNegociar = inpCodigoVendedorNegociar;
    }

    public JTextField getInpCpfClienteNegociar() {
        return inpCpfClienteNegociar;
    }

    public void setInpCpfClienteNegociar(JTextField inpCpfClienteNegociar) {
        this.inpCpfClienteNegociar = inpCpfClienteNegociar;
    }

    public JRadioButton getRbVenda() {
        return rbVenda;
    }

    public void setRbVenda(JRadioButton rbVenda) {
        this.rbVenda = rbVenda;
    }

    public JButton getBtnSubmitNegociar() {
        return btnSubmitNegociar;
    }

    public void setBtnSubmitNegociar(JButton btnSubmitNegociar) {
        this.btnSubmitNegociar = btnSubmitNegociar;
    }

    public JTextField getInpCodigoMecanicoRevisao() {
        return inpCodigoMecanicoRevisao;
    }

    public void setInpCodigoMecanicoRevisao(JTextField inpCodigoMecanicoRevisao) {
        this.inpCodigoMecanicoRevisao = inpCodigoMecanicoRevisao;
    }

    public JButton getBtnClearRevisao() {
        return btnClearRevisao;
    }

    public void setBtnClearRevisao(JButton btnClearRevisao) {
        this.btnClearRevisao = btnClearRevisao;
    }

    public JRadioButton getRbGerarLaudoRevisao() {
        return rbGerarLaudoRevisao;
    }

    public void setRbGerarLaudoRevisao(JRadioButton rbGerarLaudoRevisao) {
        this.rbGerarLaudoRevisao = rbGerarLaudoRevisao;
    }

    public JTextField getInpNomeDepartamento() {
        return inpNomeDepartamento;
    }

    public void setInpNomeDepartamento(JTextField inpNomeDepartamento) {
        this.inpNomeDepartamento = inpNomeDepartamento;
    }

    public JButton getBtnClearDepartamento() {
        return btnClearDepartamento;
    }

    public void setBtnClearDepartamento(JButton btnClearDepartamento) {
        this.btnClearDepartamento = btnClearDepartamento;
    }


    public JButton getBtnSubmitDepartamento() {
        return btnSubmitDepartamento;
    }

    public void setBtnSubmitDepartamento(JButton btnSubmitDepartamento) {
        this.btnSubmitDepartamento = btnSubmitDepartamento;
    }

    private JTextField inpCpfCliente;
    private JTextField inpTelefoneCliente;
    private JPanel cadCliente;
    private JPanel cadColaborador;
    private JPanel cadVeiculo;
    private JPanel Estoque;
    private JPanel Negociar;
    private JPanel Revisao;
    private JPanel Departamento;
    private JTextField inpNomeColaborador;
    private JRadioButton rbVendas;
    private JButton btnSubmitColaborador;
    private JTextField inpMarcaVeiculo;
    private JRadioButton rbSedan;
    private JRadioButton rbSport;
    private JRadioButton rbHatch;
    private JButton btnSubmitVeiculo;
    private JRadioButton rbCarro;
    private JRadioButton rbMoto;
    private JRadioButton rb150;
    private JRadioButton rb150plus;
    private JButton btnSubmitClear;
    private JTextField inpCodigoVendedorNegociar;
    private JTextField inpCpfClienteNegociar;
    private JRadioButton rbVenda;
    private JButton btnSubmitNegociar;
    private JTextField inpCodigoMecanicoRevisao;
    private JButton btnClearRevisao;
    private JRadioButton rbGerarLaudoRevisao;
    private JTextField inpNomeDepartamento;
    private JButton btnClearDepartamento;
    private JButton btnSubmitDepartamento;

    private JButton btnClearColaborador;
    private JButton btnClearNegociar;
    private JButton btnSubmitRevisao;
    private JTextField inpCpfColaborador;
    private JTextField inpSalarioColaborador;
    private JRadioButton rbMecanico;
    private JRadioButton rbMarket;
    private JTextField inpQuilometragemVeiculo;
    private JTextField inpValorVeiculo;
    private JTextField inpCorVeiculo;
    private JTextField inpModeloVeiculo;
    private JTextField inpCodigoColaboradorDepartamento;
    private JTextField inpCodigoVeiculoRevisao;
    private JTextField inpDataRevisao;
    private JTextField inpDescrisaoRevisao;
    private JTextField inpDataNegociar;
    private JTextField inpValorNegociar;
    private JRadioButton rbCompra;
    private JTextField inpAnoVeiculo;
    private JTextArea inpDescricaoVeiculo;
    public JPanel EstoqueContainer;
    private JButton clienteTabelaButton;
    private JButton departamentosTabelaButton;
    private JButton revisoesTabelaButton;
    private JButton veiculoTabelaButton;
    private JRadioButton rbAuto;
    private JRadioButton rbManual;
    private JTextField inpTamanhoRodaVeiculo;
    private JPanel Publicidade;
    private JButton enviarButton;
    private JTextField inpCustoPublicidade;
    private JTextArea inpDescricaoPublicidade;
    private JButton limparButton;
    private JTextField inpMultiplicadorDepartamento;
    private JCheckBox ckAg;
    private JButton colaboradorTabelaButton;
    private JButton negocioTabelaButton;
    private JTabbedPane Tabelas;
    private JPanel subClientes;
    private JButton editarClienteButton;
    private JButton deletarButton;
    private JRadioButton rbBuscarNomeCliente;
    private JTextField inpBuscarCliente;
    private JRadioButton rbBuscarCpfCliente;
    private JTextField inpDeletarCpfCliente;
    private JTextField inpEditarCpfCliente;
    private JPanel subColaboradores;
    private JButton alterarDepartamentoButton;
    private JTextField inpNovoSalario;
    private JTextField inpCodColaboradorAlterar;
    private JButton btnAlterarValorVeic;
    private JTextField inpNewValueVeic;
    private JButton btnClearVeiculo;
    private JTextField codColaboradorPublicidade;
    private JTextField inpNovoTelefoneCliente;
    private JButton limparButton1;
    private JTextField inpCodDepartamento;
    private JTextField inpCodColaborador;
    private JButton btnAlteraSalario;
    private JTextField inpCodVeic;
    private JButton visualizarPublicidadesButton;
    private JTextField inpCodDepMeta;
    private JButton btnEnviarMetaDepartamento;
    private JTextField inpValorMeta;
    private JTextField inpDataMeta;
    private JPanel Peca;
    private JTextField inpNomePeca;
    private JTextField inpValorPeca;
    private JButton btnSubmitPeca;
    private JTextField inpCodigoColaboradorMeta;
    private JButton visualizarMetasButton;
    private JPanel subPecas;
    private JPanel subMetas;
    private JPanel subPublicidade;
    private JPanel subDepartamento;
    private JPanel subRevisoes;
    private JPanel subNegocios;
    private JPanel subVeiculos;
    private JTextField inpQtdPeca;
    private JButton btnClearPeca;
    private JButton visualizarPeçasEmEstoqueButton;
    private JButton btnSubmitTabelaPeca;
    private JTextField inpValorTabelaPeca;
    private JTextField inpQuantidadePeca;
    private JButton btnClearTabelaPeca;
    private JTextField inpCodigoTabelaPeca;
    private JTextArea inpLaudo;
    private JCheckBox ckPeca;
    private JTextField inpCodPecaRevisao;
    private JTextField inpQtdPecaRevisao;
    private JTextField inpValorPecaRevisao;
    private JButton limparButton2;
    private JButton deletarButton1;
    private JTextField inpDeleteColaborador;
    private JButton btnVerTableRevPec;
    private JButton inpFiltrarCliente;
    private JRadioButton rbMarca;
    private JRadioButton rbAno;
    private JRadioButton rbValor;
    private JRadioButton rbQuilometragem;
    private JPanel start;
    private JButton esvaziarBancoButton;
    private JButton popularBancoButton;
    private JPanel panelComprar;
    private JPanel panelComprarSelecionado;
    private JCheckBox ckComprar;
    private JTextField inpMarcaCadNegociar;
    private JTextField inpModeloCadNegociar;
    private JTextField inpQuiloCadNegociar;
    private JTextField inpValorCadNegociar;
    private JTextField inpCorCadNegociar;
    private JTextField inpAnoCadNegociar;
    private JTextArea inpDescCadNegociar;
    private JRadioButton rbMotoNormal;
    private JRadioButton rbMotoEsportiva;
    private JRadioButton rbModeloSedan;
    private JRadioButton rbModeloHatch;
    private JRadioButton rbModeloEsporte;
    private JRadioButton rbCarroCadNegociar;
    private JRadioButton rbMotoCadNegociar;
    private JRadioButton rbAutomaticoNegociar;
    private JRadioButton rbManualNegociar;
    private JButton btnEnviarCadVeiculoNegociar;
    private JTextField inpTamCadNegociar;
    private JTextField inpCodigoVeiculoNegociar;
    private JButton btnClearCompraNegociar;
    private JTextField inpBuscarVeiculo;
    private JButton pesquisarButton;
    private JPanel PainelNumerico;
    private JRadioButton rbMaior;
    private JRadioButton rbMenor;
    private JRadioButton rbIgual;
    private JTextField inpLimiteSuperior;
    private JRadioButton limparFiltroMatematicoRadioButton;
    private JButton consulta1Button;
    private JButton btnconsulta2;
    private JRadioButton rbCarroNegociar;
    private JRadioButton rbMotoNegociar;
    private JPanel ConsEspeciais;
    private JPanel todasConsultas;
    private JTextField codVeicConsulta2;
    private JTextField codColConsulta2;
    private JButton btnConsulta3;
    private JTextField inpCodVende;
    private JButton visualizarCarrosButton;
    private JButton VisualizarMoto;
    private JTextField inpConsulta2Cod;
    private JTextField inpConsulta2Marca;
    private JScrollPane barraDeRolagem;
    private JTable tabelaEstoque;
    Publicidade publicidade;

    public JPanel getEstoqueContainer() {
        return EstoqueContainer;
    }

    public void setEstoqueContainer(JPanel estoqueContainer) {
        EstoqueContainer = estoqueContainer;
    }

    public TabbetPanel() {
        DadosBanco date = new DadosBanco();
        criarPainel("default");
        panelComprarSelecionado.setVisible(false);
        PainelNumerico.setVisible(false);
        if (rbCompra.isSelected()) {
            panelComprarSelecionado.setVisible(true);
        }
        btnSubmitCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = inpNomeCliente.getText();
                String cpf = inpCpfCliente.getText();
                String telefone = inpTelefoneCliente.getText();
                if (cpf.equals("") || telefone.equals("") || nome.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    Cliente cliente = new Cliente(telefone, cpf, nome);
                    DbFuncitions db = new DbFuncitions();
                    db.InserirCliente(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), cliente);
                }
            }
        });
        /*



         */
        btnSubmitVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = inpMarcaVeiculo.getText();
                String ano = inpAnoVeiculo.getText();
                int anoInt = Integer.parseInt(ano);
                String modelo = inpModeloVeiculo.getText() + "-";
                String model = "";
                String tipo = "";
                String cor = inpCorVeiculo.getText();
                String descricao = inpDescricaoVeiculo.getText();
                String quilometragem = inpQuilometragemVeiculo.getText();
                String tamanhoRoda = inpTamanhoRodaVeiculo.getText();
                String tipoCambio = "";
                int quilo = Integer.parseInt(quilometragem);
                double valor = Double.parseDouble(inpValorVeiculo.getText());
                String cilindrada = "";
                if (rb150.isSelected()) {
                    model = "Simples";
                    cilindrada = "150";
                } else if (rb150plus.isSelected()) {
                    model = "Espotiva";
                    cilindrada = "150+";
                } else if (rbSedan.isSelected()) {
                    model = "Sedan";
                } else if (rbSport.isSelected()) {
                    model = "Sport";
                } else if (rbHatch.isSelected()) {
                    model = "Hatch";
                } else {
                    model = "Indefinido";
                }
                if (rbAuto.isSelected()) {
                    tipoCambio = "Automático";
                } else if (rbManual.isSelected()) {
                    tipoCambio = "Manual";
                } else {
                    tipoCambio = "Indefinido";
                }
                if (rbCarro.isSelected()) {
                    tipo = "Carro";
                } else if (rbMoto.isSelected()) {
                    tipo = "Moto";
                } else {
                    tipo = "Indefinido";
                }
                if (marca.equals("") || model.equals("") || model.equals("Indefinido") || tipo.equals("") || cor.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Veiculo veiculo = new Veiculo();
                    int codigo = veiculo.getCodigo();
                    if (rbCarro.isSelected()) {
                        Carro carro = new Carro(anoInt, quilo, marca, valor, tipo, cor, modelo + model, descricao, tamanhoRoda, tipoCambio);
                        db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), carro);
                        db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), carro);
                    } else if (rbMoto.isSelected()) {
                        Moto moto = new Moto(anoInt, quilo, marca, valor, tipo, cor, model, descricao, cilindrada);
                        db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), moto);
                        db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), moto);
                    } else {
                        JOptionPane.showMessageDialog(null, "TIPO É OBRIGATÓRIO!", "Erro Tipo de veiculo nao informado", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        });
        btnSubmitClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpMarcaVeiculo.setText("");
                inpQuilometragemVeiculo.setText("");
                inpValorVeiculo.setText("");
                inpCorVeiculo.setText("");
                inpAnoVeiculo.setText("");
                inpDescricaoVeiculo.setText("");
            }
        });
        clienteTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("cliente");
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String descricao = inpDescricaoPublicidade.getText();
                double custo = Double.parseDouble(inpCustoPublicidade.getText());
                int CodColaborador = Integer.parseInt(codColaboradorPublicidade.getText());
                if (descricao.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Publicidade publicidade = new Publicidade(descricao, custo, CodColaborador);
                    int cod = publicidade.getCodigo();
                    publicidade.setCodigo(cod);
                    db.InserirPublicidade(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), publicidade);
                }
            }
        });
        btnSubmitDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = inpNomeDepartamento.getText();
                String multi = inpMultiplicadorDepartamento.getText();
                int agencia = 1;
                if (ckAg.isSelected()) {
                    agencia = 1;
                } else {
                    agencia = 1;
                }
                if (nome != null && multi != null) {
                    int mult = Integer.parseInt(multi);
                    Departamento departamento = new Departamento(nome, mult, agencia);
                    int codigo = departamento.getCod_departamento();
                    departamento.setCod_departamento(codigo);
                    DbFuncitions db = new DbFuncitions();
                    db.InserirDepartamento(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), departamento);
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        btnClearDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpNomeDepartamento.setText("");
                inpMultiplicadorDepartamento.setText("");
            }
        });
        veiculoTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("veiculo");
            }
        });
        colaboradorTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("colaborador");
            }
        });
        departamentosTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("departamento");
            }
        });
        negocioTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("negocio");
            }
        });
        btnSubmitColaborador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codDepartamento = 0;
                String nome = inpNomeColaborador.getText();
                String cpf = inpCpfColaborador.getText();
                String salario = inpSalarioColaborador.getText();
                double salarioDouble = Double.parseDouble(salario);
                String departamento = "";
                Departamento dep = new Departamento();
                if (rbVendas.isSelected()) {
                    departamento = "Vendas";
                    dep.setCod_departamento(1);
                } else if (rbMecanico.isSelected()) {
                    departamento = "Mecanicos";
                    dep.setCod_departamento(2);
                } else if (rbMarket.isSelected()) {
                    departamento = "Market";
                    dep.setCod_departamento(3);
                }
                Colaborador colaborador = new Colaborador(nome, cpf, salarioDouble);
                int cod = colaborador.getCodigo();
                colaborador.setCodigo(cod);
                colaborador.setDepartamento(dep);
                DbFuncitions db = new DbFuncitions();
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), colaborador);
            }
        });
        btnClearColaborador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpNomeColaborador.setText("");
                inpCpfColaborador.setText("");
                inpSalarioColaborador.setText("");
                if (rbVendas.isSelected()) {
                    rbVendas.setSelected(false);
                } else if (rbMecanico.isSelected()) {
                    rbMecanico.setSelected(false);
                } else if (rbMarket.isSelected()) {
                    rbMarket.setSelected(false);
                }
            }
        });
        editarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = inpEditarCpfCliente.getText();
                String telefone = inpNovoTelefoneCliente.getText();

                if (cpf.equals("") || telefone.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    db.Atualizar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "cliente", "telefone", "cpf_cliente", cpf, telefone);
                }
            }
        });
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = inpDeletarCpfCliente.getText();
                if (cpf.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    db.Deletar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "cliente", "cpf_cliente", cpf);
                }
            }
        });

        alterarDepartamentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codDepartamento = inpCodDepartamento.getText();
                String codColaborador = inpCodColaborador.getText();
                if (codDepartamento.equals("") || codColaborador.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    db.Atualizar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "colaborador", "cod_departamento", "id_colaborador", codColaborador, codDepartamento);
                }
            }
        });
        btnAlteraSalario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String salario = inpNovoSalario.getText();
                String codColaborador = inpCodColaboradorAlterar.getText();
                if (salario.equals("") || codColaborador.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    db.Atualizar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "colaborador", "salario", "id_colaborador", codColaborador, salario);
                }
            }
        });
        limparButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpCodColaborador.setText("");
                inpCodDepartamento.setText("");
                inpNovoSalario.setText("");
                inpCodColaboradorAlterar.setText("");
            }
        });
        btnAlterarValorVeic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codVeiculo = inpCodVeic.getText();
                String valor = inpNewValueVeic.getText();
                double value = Double.parseDouble(valor);
                if (codVeiculo.equals("") || valor.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    db.Atualizar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "valor", "cod_veiculo", codVeiculo, valor);
                }
            }
        });
        btnClearVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpCodVeic.setText("");
                inpNewValueVeic.setText("");
                inpBuscarVeiculo.setText("");
                inpLimiteSuperior.setText("");
                rbQuilometragem.setSelected(false);
                rbValor.setSelected(false);
                rbAno.setSelected(false);
                rbMarca.setSelected(false);
                rbMaior.setSelected(false);
                rbMenor.setSelected(false);
                rbIgual.setSelected(false);
            }
        });
        btnClearDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpNomeDepartamento.setText("");
                inpMultiplicadorDepartamento.setText("");
                inpCodDepMeta.setText("");
                inpDataMeta.setText("");
                inpValorMeta.setText("");
                inpCodigoColaboradorMeta.setText("");
            }
        });
        btnEnviarMetaDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataMeta = inpDataMeta.getText();
                String valorMeta = inpValorMeta.getText();
                double valor = Double.parseDouble(valorMeta);
                String codColaborador = inpCodigoColaboradorMeta.getText();
                if (inpDataMeta.equals("") || inpValorMeta.equals("") || inpCodigoColaboradorMeta.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha a data, valor e o código do colaborador ou código do departamento", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Meta meta = new Meta(valor);
                    int codCol = Integer.parseInt(inpCodigoColaboradorMeta.getText());
                    Colaborador colaborador = new Colaborador();
                    colaborador.setCodigo(Integer.parseInt(codColaborador));
                    meta.setColaborador(colaborador);
                    meta.getId_meta();
                    db.CadastrarMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), meta);

                }
            }
        });
        visualizarMetasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("meta");
            }
        });
        visualizarPublicidadesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("publicidade");
            }
        });
        btnSubmitPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomePeca = inpNomePeca.getText();
                String valorPeca = inpValorPeca.getText();
                double valor = Double.parseDouble(valorPeca);
                int qtde = Integer.parseInt(inpQtdPeca.getText());
                if (nomePeca.equals("") || valorPeca.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Peca peca = new Peca(nomePeca, qtde, valor);
                    db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), peca);
                }
            }
        });
        btnClearPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpNomePeca.setText("");
                inpValorPeca.setText("");
                inpQtdPeca.setText("");
            }
        });
        visualizarPeçasEmEstoqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("peca_material");
            }
        });
        btnSubmitTabelaPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codPeca = inpCodigoTabelaPeca.getText();
                int cod = Integer.parseInt(codPeca);
                String valorPeca = inpValorTabelaPeca.getText();
                String qtde = inpQuantidadePeca.getText();
                double valor = 0;
                int qtd = 0;

                if (codPeca != null && valorPeca.equals("") == false) {
                    if (valorPeca != null) {
                        System.out.println(valorPeca);
                        valor = Double.parseDouble(valorPeca);
                        System.out.println(valor);
                        DbFuncitions db = new DbFuncitions();
                        db.AtualizarValorPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "peca_material", "valor", "id_pecamaterial", cod, valor);
                    }
                } else if(codPeca != null)  {
                        qtd = Integer.parseInt(qtde);
                        DbFuncitions db = new DbFuncitions();
                        db.AtualizarQuantidadePeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "peca_material", "qtde", "id_pecamaterial", cod, qtd);
                }
            }
        });
        btnClearTabelaPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpCodigoTabelaPeca.setText("");
                inpValorTabelaPeca.setText("");
                inpQuantidadePeca.setText("");
            }
        });
        btnSubmitRevisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codV = inpCodigoVeiculoRevisao.getText();
                int codVeiculo = Integer.parseInt(codV);
                String dataRevisao = inpDataRevisao.getText();
                DbFuncitions db = new DbFuncitions();
                Revisao revisao = new Revisao(dataRevisao, codVeiculo);
                int codRevisao = revisao.getCodigo();
                String laudo = "Sem decrição de laudo";
                revisao.setCodigo(codRevisao);
                revisao.setLaudo(laudo);
                if (rbGerarLaudoRevisao.isSelected()) {
                    laudo = inpLaudo.getText();
                    revisao.setLaudo(laudo);
                }
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao);
                if (ckPeca.isSelected()) {
                    if (inpCodPecaRevisao.equals("") || inpQtdPecaRevisao.equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o código da peça e a quantidade", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String codP = inpCodPecaRevisao.getText();
                        int codPeca = Integer.parseInt(codP);
                        String qtdePeca = inpQtdPecaRevisao.getText();
                        int qtde = Integer.parseInt(qtdePeca);
                        db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao, codPeca, qtde);
                        db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), codPeca, qtde);
                    }
                }
            }
        });
        btnClearRevisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpCodigoVeiculoRevisao.setText("");
                inpDataRevisao.setText("");
                inpLaudo.setText("");
                inpCodPecaRevisao.setText("");
                inpQtdPecaRevisao.setText("");
                rbGerarLaudoRevisao.setSelected(false);
                ckPeca.setSelected(false);
                inpValorPecaRevisao.setText("");
            }
        });
        limparButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpNomeCliente.setText("");
                inpCpfCliente.setText("");
                inpTelefoneCliente.setText("");
            }
        });
        deletarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codColaborador = inpDeleteColaborador.getText();
                db.Deletar(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "colaborador", "id_colaborador", codColaborador);
            }
        });
        revisoesTabelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("revisao");
            }
        });
        btnVerTableRevPec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarPainel("revisao_peca");
            }
        });
        inpFiltrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buscar = inpBuscarCliente.getText();
                Object[][] data;
                if (rbBuscarCpfCliente.isSelected()) {
                    DbFuncitions db = new DbFuncitions();
                    data = db.FiltrarString(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "cliente", "cpf_cliente", buscar);
                    criarFiltro(data, "cliente");
                } else if (rbBuscarNomeCliente.isSelected()) {
                    DbFuncitions db = new DbFuncitions();
                    data = db.FiltrarString(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "cliente", "nome_cliente", buscar);
                    criarFiltro(data, "cliente");
                }
            }
        });
        esvaziarBancoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DbFuncitions db = new DbFuncitions();
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "meta");         //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "publicidade");  //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "revisao_peca"); //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "peca_material");//
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "revisao");      //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "moto");         //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "carro");        //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "negocio");      //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "colaborador");  //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "departamento"); //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "agencia");      //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "cliente");      //
                db.reset(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo");      //
            }
        });
        popularBancoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DbFuncitions db = new DbFuncitions();

                Agencia ag = new Agencia(1, 35222323, "Rua 1", "Agencia 1");

                Departamento vendas = new Departamento("Vendas", 2, 1, 1);
                Departamento mecanicos = new Departamento("Mecanicos", 1, 1, 2);
                Departamento marketing = new Departamento("Marketing", 1, 1, 3);

                Colaborador vendedor1 = new Colaborador("Vendedor1", "12345678901", vendas, 1900.50, 1);
                Colaborador vendedor2 = new Colaborador("Vendedor1", "123456", vendas, 1850.50, 2);
                Colaborador vendedor3 = new Colaborador("Vendedor1", "123", vendas, 2100.50, 3);
                Colaborador vendedor4 = new Colaborador("Vendedor1", "1238901", vendas, 2050.50, 4);
                Colaborador vendedor5 = new Colaborador("Vendedor1", "123781", vendas, 1978.50, 5);
                Colaborador mecanico1 = new Colaborador("Mecanico1", "12345678801", mecanicos, 3000.50, 6);
                Colaborador marketing1 = new Colaborador("Marketing1", "12322378901", marketing, 1500.50, 7);

                Cliente cliente1 = new Cliente("4835222723", "12345678901", "Cliente1");
                Cliente cliente2 = new Cliente("4835222723", "22345678901", "Cliente2");
                Cliente cliente3 = new Cliente("4835222723", "32345678901", "Cliente3");

                Meta meta = new Meta(1, 150000, vendedor1, vendas);
                Meta meta2 = new Meta(2, 150000, vendedor2, vendas);

                Publicidade publicidade = new Publicidade("Publicidade 1", 1000, 3);
                publicidade.getCodigo();

                Peca pneu = new Peca("Pneu", 100, 130.95);
                Peca farol = new Peca("Farol", 100, 4.95);
                Peca parafuso = new Peca("Parafuso", 100, 0.71);
                Peca motor = new Peca("Motor", 100, 4155.71);
                Peca porta = new Peca("Porta", 100, 100.71);
                Peca amortecedor = new Peca("Amortecedor", 100, 631.13);
                Peca bateria = new Peca("Bateria", 100, 231.45);
                Peca oleo = new Peca("Óleo", 100, 21.95);


                Carro Cpalio = new Carro(2015, 10000, "Fiat", 18000, "Manual", "Branco", "Palio", "Palio 1.0", "14", "Manual");
                Carro Cgol = new Carro(2016, 102000, "Volkswagen", 21000, "Manual", "Azul", "Gol", "Gol 1.0", "14", "Manual");
                Carro Ccorsa = new Carro(2017, 75000, "Chevrolet", 29000, "Manual", "Vermelho", "Corsa", "Corsa 1.0", "14", "Manual");
                Carro fiatUno = new Carro(2018, 45000, "Fiat", 19000, "Manual", "Preto", "Uno", "Uno 1.0", "14", "Manual");
                Carro Cgol2 = new Carro(2019, 8000, "Volkswagen", 21000, "Manual", "Branco", "Gol", "Gol 1.0", "14", "Manual");
                Carro fiatSiena = new Carro(2015, 38000, "Fiat", 18000, "Manual", "Prata", "Siena", "Siena 1.0", "14", "Manual");
                Carro fiatLinea = new Carro(2016, 91000, "Fiat", 18000, "Manual", "Verde", "Linea", "Linea 1.0", "14", "Manual");
                Carro VolkswagemGolf = new Carro(2017, 72100, "Volkswagen", 49000, "Manual", "Verde", "Golf", "Golf 1.0", "14", "Manual");
                Carro VolkswagemNivus = new Carro(2022, 1, "Volkswagen", 97000, "Automatico", "Preto", "Nivus", "Nivus 1.0", "14", "Automatico");
                Carro VolkswagemAmarok = new Carro(2019, 500, "Volkswagen", 139400, "Automatico", "Verde", "Amarok", "Amarok 1.6", "14", "Automatico");


                Moto Mcg = new Moto(2018, 19800, "Honda", 9000, "Passeio", "Azul", "CG", "CG 150 Completa", "150");
                Moto Mcb = new Moto(2019, 8000, "Honda", 13000, "Esportiva", "Vermelho", "CB", "CB 300 Completa", "300");
                Moto Mxre = new Moto(2020, 32000, "Honda", 23000, "Esportiva", "Branco", "XRE", "XRE 300 Completa", "300");
                Moto Mr1 = new Moto(2020, 1300, "Honda", 79210.78, "Esportiva", "Preto", "R1", "R1 Completa", "1000");
                Moto Mz1000 = new Moto(2020, 2000, "Kawasaki", 79210.78, "Esportiva", "Azul", "Z100", "Z1000 Completa", "1000");
                Moto Mz800 = new Moto(2020, 1500, "Kawasaki", 69210.78, "Esportiva", "Amarelo", "Z800", "Z800 Completa", "800");
                Moto Mz750 = new Moto(2020, 9300, "Kawasaki", 82210.78, "Esportiva", "Vermelho", "Z750", "Z750 Completa", "750");
                Moto Mz650 = new Moto(2020, 15000, "Kawasaki", 59590.78, "Esportiva", "Preto", "Z650", "Z650 Completa", "650");


                Negocio compra1 = new Negocio("Compra", "2022-09-15", Cpalio.getCodigo(), "12345678901", 1, 18000.0);
                Negocio compra2 = new Negocio("Compra", "2022-09-21", Ccorsa.getCodigo(), "12345678901", 1, 29000.0);
                Negocio compra3 = new Negocio("Compra", "2022-10-13", VolkswagemGolf.getCodigo(), "12345678901", 1, 49000.0);
                Negocio compra4 = new Negocio("Compra", "2022-10-21", VolkswagemNivus.getCodigo(), "12345678901", 2, 97000.0);
                Negocio compra5 = new Negocio("Compra", "2022-07-23", VolkswagemAmarok.getCodigo(), "12345678901", 4, 139400.0);

                Negocio venda1 = new Negocio("Venda", "2022-09-15", Cpalio.getCodigo(), "12345678901", 1, 18000.0);
                Negocio venda2 = new Negocio("Venda", "2022-09-21", Ccorsa.getCodigo(), "12345678901", 1, 29000.0);
                Negocio venda3 = new Negocio("Venda", "2022-10-06", VolkswagemGolf.getCodigo(), "12345678901", 1, 49000.0);
                Negocio venda4 = new Negocio("Venda", "2022-10-21", Mcb.getCodigo(), "12345678901", 2, 9000.0);
                Negocio venda5 = new Negocio("Venda", "2022-11-06", Mz1000.getCodigo(), "12345678901", 4, Mz1000.getValor());
                Negocio venda6 = new Negocio("Venda", "2022-11-21", Mz650.getCodigo(), "12345678901", 4, Mz650.getValor());


                Revisao revisao1 = new Revisao("2022-11-23", Cpalio.getCodigo());
                Revisao revisao2 = new Revisao("2022-11-23", Cgol.getCodigo());
                Revisao revisao3 = new Revisao("2022-09-23", Ccorsa.getCodigo());
                Revisao revisao4 = new Revisao("2022-03-23", fiatUno.getCodigo());
                Revisao revisao5 = new Revisao("2022-01-23", Cgol2.getCodigo());
                Revisao revisao6 = new Revisao("2022-06-23", fiatSiena.getCodigo());
                Revisao revisao7 = new Revisao("2022-12-23", fiatLinea.getCodigo());
                Revisao revisao8 = new Revisao("2022-11-13", VolkswagemGolf.getCodigo());
                Revisao revisao9 = new Revisao("2022-11-18", VolkswagemNivus.getCodigo());
                Revisao revisao10 = new Revisao("2022-10-21", VolkswagemAmarok.getCodigo());
                Revisao revisao11 = new Revisao("2022-09-12", Mcg.getCodigo());


                RevisaoPeca revisaoPeca1 = new RevisaoPeca(revisao1.getCodigo(), farol.getCodigo(), 1);
                RevisaoPeca revisaoPeca2 = new RevisaoPeca(revisao2.getCodigo(), pneu.getCodigo(), 2);
                RevisaoPeca revisaoPeca3 = new RevisaoPeca(revisao3.getCodigo(), parafuso.getCodigo(), 13);
                RevisaoPeca revisaoPeca4 = new RevisaoPeca(revisao4.getCodigo(), motor.getCodigo(), 1);
                RevisaoPeca revisaoPeca5 = new RevisaoPeca(revisao5.getCodigo(), porta.getCodigo(), 1);
                RevisaoPeca revisaoPeca6 = new RevisaoPeca(revisao6.getCodigo(), amortecedor.getCodigo(), 2);
                RevisaoPeca revisaoPeca7 = new RevisaoPeca(revisao7.getCodigo(), bateria.getCodigo(), 1);


                db.CadastrarAgencia(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), ag);
                db.InserirDepartamento(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendas);
                db.InserirDepartamento(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), mecanicos);
                db.InserirDepartamento(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), marketing);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendedor1);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendedor2);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendedor3);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendedor4);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), vendedor5);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), mecanico1);
                db.InserirColaborador(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), marketing1);
                db.CadastrarMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), meta);
                db.CadastrarMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), meta2);
                db.InserirPublicidade(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), publicidade);
                db.InserirCliente(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), cliente1);
                db.InserirCliente(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), cliente2);
                db.InserirCliente(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), cliente3);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), farol);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), pneu);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), parafuso);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), motor);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), amortecedor);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), bateria);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), oleo);
                db.CadastrarPeca(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), porta);

                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cpalio);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cgol);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Ccorsa);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatUno);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cgol2);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatSiena);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatLinea);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemGolf);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemNivus);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemAmarok);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cpalio);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cgol);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Ccorsa);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatUno);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Cgol2);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatSiena);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), fiatLinea);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemGolf);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemNivus);
                db.InserirCarro(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), VolkswagemAmarok);

                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mcg);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mcb);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mxre);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mr1);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz1000);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz750);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz800);
                db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz650);


                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mr1);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mcg);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mcb);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mxre);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mr1);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz1000);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz750);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz800);
                db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), Mz650);

                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao1);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao2);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao3);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao4);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao5);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao6);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao7);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao8);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao9);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao10);
                db.CadastrarRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao11);

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao1, farol.getCodigo(), revisaoPeca1.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), farol.getCodigo(), revisaoPeca1.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao2, pneu.getCodigo(), revisaoPeca2.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), pneu.getCodigo(), revisaoPeca2.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao3, parafuso.getCodigo(), revisaoPeca3.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), parafuso.getCodigo(), revisaoPeca3.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao4, farol.getCodigo(), revisaoPeca4.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), farol.getCodigo(), revisaoPeca4.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao5, pneu.getCodigo(), revisaoPeca5.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), pneu.getCodigo(), revisaoPeca5.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao6, parafuso.getCodigo(), revisaoPeca6.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), parafuso.getCodigo(), revisaoPeca6.getQuantidade());

                db.CadastrarPecaRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), revisao7, farol.getCodigo(), revisaoPeca7.getQuantidade());
                db.AtualizarEstoquePosRevisao(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), farol.getCodigo(), revisaoPeca7.getQuantidade());


                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), compra1);
                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), compra2);
                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), compra3);
                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), compra4);
                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), compra5);


                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda1);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", Cpalio.getCodigo(), "VENDIDO  /");
                db.SomaNaMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda1.getCod_colaborador(), meta.getId_meta(), venda1.getValor());

                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda2);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", Ccorsa.getCodigo(), "VENDIDO  /");
                db.SomaNaMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda2.getCod_colaborador(), meta.getId_meta(), venda2.getValor());

                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda3);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", VolkswagemGolf.getCodigo(), "VENDIDO  /");
                db.SomaNaMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda3.getCod_colaborador(), meta.getId_meta(), venda3.getValor());

                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda4);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", Mcb.getCodigo(), "VENDIDO  /");

                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda5);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", Mz1000.getCodigo(), "VENDIDO  /");

                db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), venda6);
                db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", Mz650.getCodigo(), "VENDIDO  /");


            }
        });
        btnSubmitNegociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codV = Integer.parseInt(inpCodigoVendedorNegociar.getText());
                String codC = inpCpfClienteNegociar.getText();
                String codVeiculo = inpCodigoVeiculoNegociar.getText();
                int codVei = Integer.parseInt(inpCodigoVeiculoNegociar.getText());
                String data = inpDataNegociar.getText();
                double valor = Double.parseDouble(inpValorNegociar.getText());
                String info = "VENDIDO";
                DbFuncitions db = new DbFuncitions();
                if (rbVenda.isSelected()) {
                    Negocio negocio = new Negocio("Venda", data, codVei, codC, codV, valor);
                    Meta meta = new Meta();
                    if (rbCarroNegociar.isSelected()) {//TODO: NEGOCIO DE CARRO
                        db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), negocio);
                        db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", codVeiculo, info);
                        db.SomaNaMeta(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), codV, 1, valor);
                    } else if (rbMotoNegociar.isSelected()) {
                        db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), negocio);
                        db.AtualizarVenda(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "descricao", "cod_veiculo", codVeiculo, info);
                    }
                } else if (rbCompra.isSelected()) {
                    Negocio negocio = new Negocio("Compra", data, codVei, codC, codV, valor);
                    db.CadastrarNegocio(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), negocio);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma opção de negociação", "Erro Campo Negocio nao informado!", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        ckComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ckComprar.isSelected()) {
                    panelComprarSelecionado.setVisible(true);
                } else {
                    panelComprarSelecionado.setVisible(false);
                }
            }
        });
        btnEnviarCadVeiculoNegociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = inpMarcaCadNegociar.getText();
                String ano = inpAnoCadNegociar.getText();
                int anoInt = Integer.parseInt(ano);
                String modelo = inpModeloCadNegociar.getText() + "-";
                String model = "";
                String tipo = "";
                String cor = inpCorCadNegociar.getText();
                String descricao = inpDescCadNegociar.getText();
                String quilometragem = inpQuiloCadNegociar.getText();
                String tamanhoRoda = inpTamCadNegociar.getText();
                String tipoCambio = "";
                int quilo = Integer.parseInt(quilometragem);
                double valor = Double.parseDouble(inpValorCadNegociar.getText());
                String cilindrada = "";
                if (rbMotoNormal.isSelected()) {
                    model = "Simples";
                    cilindrada = "150";
                } else if (rbMotoEsportiva.isSelected()) {
                    model = "Espotiva";
                    cilindrada = "150+";
                } else if (rbModeloSedan.isSelected()) {
                    model = "Sedan";
                } else if (rbModeloEsporte.isSelected()) {
                    model = "Sport";
                } else if (rbModeloHatch.isSelected()) {
                    model = "Hatch";
                } else {
                    model = "Indefinido";
                }
                if (rbAuto.isSelected()) {
                    tipoCambio = "Automático";
                } else if (rbManual.isSelected()) {
                    tipoCambio = "Manual";
                } else {
                    tipoCambio = "Indefinido";
                }
                if (rbCarroCadNegociar.isSelected()) {
                    tipo = "Carro";
                } else if (rbMotoCadNegociar.isSelected()) {
                    tipo = "Moto";
                } else {
                    tipo = "Indefinido";
                }
                if (marca.equals("") || model.equals("") || model.equals("Indefinido") || tipo.equals("") || cor.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Veiculo veiculo = new Veiculo();
                    int codigo = veiculo.getCodigo();
                    if (rbCarroCadNegociar.isSelected()) {
                        Carro carro = new Carro(anoInt, quilo, marca, valor, tipo, cor, modelo + model, descricao, tamanhoRoda, tipoCambio);
                        db.InserirVeiculo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), carro);
                    } else if (rbMotoCadNegociar.isSelected()) {
                        Moto moto = new Moto(anoInt, quilo, marca, valor, tipo, cor, model, descricao, cilindrada);
                        db.InserirMoto(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), moto);
                    } else {
                        JOptionPane.showMessageDialog(null, "TIPO É OBRIGATÓRIO!", "Erro Tipo de veiculo nao informado", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnClearNegociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpCodigoVendedorNegociar.setText("");
                inpCpfClienteNegociar.setText("");
                inpCodigoVeiculoNegociar.setText("");
                inpDataNegociar.setText("");
                inpValorNegociar.setText("");
                rbVenda.setSelected(false);
                rbCompra.setSelected(false);
                ckComprar.setSelected(false);
            }
        });
        btnClearCompraNegociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inpMarcaCadNegociar.setText("");
                inpModeloCadNegociar.setText("");
                inpAnoCadNegociar.setText("");
                inpCorCadNegociar.setText("");
                inpDescCadNegociar.setText("");
                inpQuiloCadNegociar.setText("");
                inpTamCadNegociar.setText("");
                rbModeloSedan.setSelected(false);
                rbModeloHatch.setSelected(false);
                rbModeloEsporte.setSelected(false);
                rbMotoNormal.setSelected(false);
                rbMotoEsportiva.setSelected(false);
                rbAutomaticoNegociar.setSelected(false);
                rbManualNegociar.setSelected(false);
                rbMotoCadNegociar.setSelected(false);
                rbCarroCadNegociar.setSelected(false);
            }
        });
        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buscar = inpBuscarVeiculo.getText();
                String superior = inpLimiteSuperior.getText();
                Object[][] data = null;
                DbFuncitions db = new DbFuncitions();
                if (rbAno.isSelected()) {
                    if (rbMaior.isSelected()) {
                        data = db.FiltrarDataEspecial(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "ano", ">", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbMenor.isSelected()) {
                        data = db.FiltrarDataEspecial(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "ano", "<", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbIgual.isSelected()) {
                        data = db.FiltrarDataEspecial(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "ano", "=", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (superior != null) {
                        data = db.FiltrarDataComLimite(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", buscar, superior);
                        criarFiltro(data, "veiculo");
                    }
                    /*else {
                        data = db.FiltrarString(db.getConnection(date.getHost(),date.getUser(),date.getPassword()), "veiculo", "ano", buscar);
                        criarFiltro(data, "veiculo");
                    }*/
                } else if (rbMarca.isSelected()) {
                    data = db.FiltrarString(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "marca", buscar);
                    criarFiltro(data, "veiculo");
                } else if (rbQuilometragem.isSelected()) {
                    if (rbMaior.isSelected()) {
                        int km = Integer.parseInt(buscar);
                        data = db.FiltraKms(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "quilometragem", ">", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbMenor.isSelected()) {
                        data = db.FiltraKms(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "quilometragem", "<", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbIgual.isSelected()) {
                        data = db.FiltraKms(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "quilometragem", "=", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (superior != null) {
                        rbMaior.setSelected(false);
                        rbMenor.setSelected(false);
                        rbIgual.setSelected(false);
                        data = db.FiltrarIntervalo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "quilometragem", buscar, superior);
                        criarFiltro(data, "veiculo");
                    }
                } else if (rbValor.isSelected()) {
                    if (rbMaior.isSelected()) {
                        data = db.FiltrarParamComOp(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "valor", ">", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbMenor.isSelected()) {
                        data = db.FiltrarParamComOp(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "valor", "<", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (rbIgual.isSelected()) {
                        data = db.FiltrarParamComOp(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "valor", "=", buscar);
                        criarFiltro(data, "veiculo");
                    } else if (superior != null) {
                        data = db.FiltrarIntervalo(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "valor", buscar, superior);
                        criarFiltro(data, "veiculo");
                    }
                } else {
                    int kms = Integer.parseInt(inpBuscarVeiculo.getText());
                    data = db.FiltrarInt(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), "veiculo", "quilometragem", kms);
                    criarFiltro(data, "veiculo");
                }

            }
        });
        rbAno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbAno.isSelected() || rbValor.isSelected() || rbQuilometragem.isSelected()) {
                    pesquisarButton.setEnabled(true);
                    PainelNumerico.setVisible(true);
                } else {
                    PainelNumerico.setVisible(false);
                }
            }
        });
        rbValor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbAno.isSelected() || rbValor.isSelected() || rbQuilometragem.isSelected()) {
                    PainelNumerico.setVisible(true);
                } else {
                    PainelNumerico.setVisible(false);
                }
            }
        });
        rbQuilometragem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbAno.isSelected() || rbValor.isSelected() || rbQuilometragem.isSelected()) {
                    PainelNumerico.setVisible(true);
                } else {
                    PainelNumerico.setVisible(false);
                }
            }
        });
        rbMarca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rbMarca.isSelected()) {
                    rbMaior.setSelected(false);
                    rbMenor.setSelected(false);
                    rbIgual.setSelected(false);
                    PainelNumerico.setVisible(false);
                } else if (rbAno.isSelected() || rbValor.isSelected() || rbQuilometragem.isSelected()) {
                    PainelNumerico.setVisible(true);
                }
            }
        });
        consulta1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DbFuncitions db = new DbFuncitions();
                Object[][] data = db.Consulta1(db.getConnection(date.getHost(), date.getUser(), date.getPassword()));
                criarFiltro(data, "consulta1");
            }
        });
        btnconsulta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codColaborador = Integer.parseInt(codColConsulta2.getText());
                String marca = codVeicConsulta2.getText();
                if (codColaborador == 0 || marca.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Object[][] data = db.Consulta2(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), codColaborador, marca);
                    criarFiltro(data, "consulta2");
                }
            }
        });
        btnConsulta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codColaborador = Integer.parseInt(inpCodVende.getText());
                if (codColaborador == 0) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                } else {
                    DbFuncitions db = new DbFuncitions();
                    Object[][] data = db.Consulta3(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), codColaborador);
                    criarFiltro(data, "consulta3");
                }
            }
        });
        visualizarCarrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DbFuncitions db = new DbFuncitions();
                Object[][] datee = db.Consulta4(db.getConnection(date.getHost(), date.getUser(), date.getPassword()));
                criarFiltro(datee, "carro");
            }
        });
        VisualizarMoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DbFuncitions db = new DbFuncitions();
                Object[][] datee = db.Consulta5(db.getConnection(date.getHost(), date.getUser(), date.getPassword()));
                criarFiltro(datee, "moto");
            }
        });
    }


    public void criarPainel(String table_name) {
        Object[][] data = null;
        DadosBanco date = new DadosBanco();
        if (table_name.equals("default")) {
            table_name = "cliente";
            data = null;
            DbFuncitions db = new DbFuncitions();
            data = db.VisualizarVeiculos(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), table_name);
            ClassTableModel model = new ClassTableModel(table_name);
            model.setDados(data);
            tabelaEstoque = new JTable();
            tabelaEstoque.setModel(model);
            tabelaEstoque.setFillsViewportHeight(true);
            barraDeRolagem = new JScrollPane(tabelaEstoque);
            EstoqueContainer.setLayout(new BorderLayout());
            EstoqueContainer.add(barraDeRolagem, BorderLayout.CENTER);
            EstoqueContainer.setVisible(true);
        } else {
            EstoqueContainer.remove(barraDeRolagem);
            EstoqueContainer.setVisible(false);
            tabelaEstoque = null;
            barraDeRolagem = null;
            data = null;
            DbFuncitions db = new DbFuncitions();
            data = db.VisualizarVeiculos(db.getConnection(date.getHost(), date.getUser(), date.getPassword()), table_name);
            ClassTableModel model = new ClassTableModel(table_name);
            model.setDados(data);
            tabelaEstoque = new JTable();
            tabelaEstoque.setModel(model);
            tabelaEstoque.setFillsViewportHeight(true);
            barraDeRolagem = new JScrollPane(tabelaEstoque);
            EstoqueContainer.setLayout(new BorderLayout());
            EstoqueContainer.add(barraDeRolagem, BorderLayout.CENTER);
            EstoqueContainer.setVisible(true);
        }
    }

    public void criarFiltro(Object data[][], String table_name) {
        if (data != null) {
            EstoqueContainer.remove(barraDeRolagem);
            EstoqueContainer.setVisible(false);
            tabelaEstoque = null;
            barraDeRolagem = null;
            ClassTableModel model = new ClassTableModel(table_name);
            model.setDados(data);
            tabelaEstoque = new JTable();
            tabelaEstoque.setModel(model);
            tabelaEstoque.setFillsViewportHeight(true);
            barraDeRolagem = new JScrollPane(tabelaEstoque);
            EstoqueContainer.setLayout(new BorderLayout());
            EstoqueContainer.add(barraDeRolagem, BorderLayout.CENTER);
            EstoqueContainer.setVisible(true);
        }
    }
}