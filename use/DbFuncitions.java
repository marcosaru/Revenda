package empresa.use;

import empresa.dominio.*;

import javax.swing.*;
import java.net.ConnectException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Optional;

public class DbFuncitions {
    private Cliente cliente;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Connection getConnection(String db, String user, String password) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void InserirCliente(Connection db, Cliente cliente) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO cliente (cpf_cliente,nome_cliente,telefone) VALUES ('" + cliente.getCpf() + "','" + cliente.getNome() + "','" + cliente.getTelefone() + "')";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CadastrarAgencia(Connection db, Agencia agencia) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO agencia (id_ag,telefone,endereco,nome) VALUES ('" + agencia.getId() + "','" + agencia.getTelefone() + "','" + agencia.getEndereco() + "','" + agencia.getNome() + "')";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InserirVeiculo(Connection db, Carro carro) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO veiculo (valor,ano,marca,cod_veiculo,cor,modelo,quilometragem,descricao) VALUES " +
                    "('" + carro.getValor() + "','" + carro.getAno() + "-01-01 08:00:00 -3:00" + "','" + carro.getMarca() + "','" + carro.getCodigo() + "','" + carro.getCor() + "','" + carro.getModelo() + "','" + carro.getQuilometragem() + "','" + carro.getDescricao() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Carro inserido com sucesso seu codigo é: " + carro.getCodigo());
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InserirVeiculo(Connection db, Moto moto) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO veiculo (valor,ano,marca,cod_veiculo,cor,modelo,quilometragem,descricao) VALUES " +
                    "('" + moto.getValor() + "','" + moto.getAno() + "-01-01 08:00:00 -3:00" + "','" + moto.getMarca() + "','" + moto.getCodigo() + "','" + moto.getCor() + "','" + moto.getModelo() + "','" + moto.getQuilometragem() + "','" + moto.getDescricao() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Carro inserido com sucesso seu codigo é: " + moto.getCodigo());
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InserirMoto(Connection db, Moto moto) {
        try {
            Statement stmt = db.createStatement();
            String sqlMoto = "INSERT INTO moto (cilindrada,cod_veiculo) VALUES ('" + moto.getCilindrada() + "','" + moto.getCodigo() + "')";
            stmt.executeUpdate(sqlMoto);
            JOptionPane.showMessageDialog(null, "Moto inserida com sucesso seu código: " + moto.getCodigo());

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InserirCarro(Connection db, Carro carro) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO carro (tipo,tamanhoroda,cod_veiculo) VALUES " +
                    "('" + carro.getTipoCambio() + "','" + carro.getTamanhoroda() + "','" + carro.getCodigo() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Carro inserido com sucesso seu codigo é: " + carro.getCodigo());
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InserirColaborador(Connection db, Colaborador colaborador) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO colaborador (cpf,nome,id_colaborador,cod_departamento,salario) values" +
                    " ('" + colaborador.getCpf() + "','" + colaborador.getNome() + "','" + colaborador.getCodigo() + "','" + colaborador.getCodDepartamento() + "','" + colaborador.getSalario() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Colaborador inserido com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void InserirDepartamento(Connection db, Departamento departamento) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO departamento (cod_departamento,nome,id,multiplicador) VALUES ('" + departamento.getCod_departamento() + "','" + departamento.getNome() + "','" + departamento.getAgencia() + "','" + departamento.getMultiplicador() + "')";
            stmt.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Departamento inserido com sucesso codigo: " + departamento.getCod_departamento());
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InserirPublicidade(Connection db, Publicidade publicidade) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO publicidade (id_publicidade,custo,descricao,id_colaborador) VALUES ('" + publicidade.getCodigo() + "','" + publicidade.getCusto() + "','" + publicidade.getDescricao() + "','" + publicidade.getId_colaborador() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Publicidade inserida com sucesso seu código: " + publicidade.getCodigo());
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CadastrarPeca(Connection db, Peca peca) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO peca_material (id_pecamaterial,nome,valor,qtde) VALUES ('" + peca.getCodigo() + "','" + peca.getNome() + "','" + peca.getPreco() + "','" + peca.getQtd() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Peça inserida com sucesso seu código: " + peca.getCodigo());
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CadastrarMeta(Connection db, Meta meta) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO meta (id_meta,valorvendido,valormeta,id_colaborador) VALUES ('" + meta.getId_meta() + "','" + 0 + "','" + meta.getValorMeta() + "','" + meta.getCodColaborador() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Meta para o colaborador cadastrada com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SomaNaMeta(Connection db, int cod_colaborador, int id_meta, double valorVendido) {
        try {
            Statement stmt = db.createStatement();
            String sql = "UPDATE meta SET valorvendido = valorvendido + '" + valorVendido + "' WHERE id_colaborador = '" + cod_colaborador + "' AND id_meta = '" + id_meta + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Valor da venda adicionado na meta!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object[][] VisualizarVeiculos(Connection db, String table_name) {
        Statement stmt;
        ResultSet rs = null;
        Object[][] data = null;
        try {
            stmt = db.createStatement();
            String query = "SELECT * FROM " + table_name;
            rs = stmt.executeQuery(query);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] VisualizarCarros(Connection db) {
        Statement stmt;
        ResultSet rs = null;
        Object[][] data = null;
        try {
            stmt = db.createStatement();
            String query = "SELECT veiculo.cod_veiculo,veiculo.marca,veiculo.modelo,veiculo.quilometragem,veiculo.valor,veiculo.cor,carro.tipo,carro.tamanhoroda,veiculo.ano,veiculo.descricao FROM carro inner join veiculo on veiculo.cod_veiculo = carro.cod_veiculo";
            rs = stmt.executeQuery(query);
            contadorDeLinhas(db, "carro");
          data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] FiltrarString(Connection db, String table_name, String procurar, String paramSearch) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + procurar + " LIKE '%" + paramSearch + "%'";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public void CadastrarRevisao(Connection db, Revisao revisao) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO revisao (id_revisao,dataocorrencia,laudo,cod_veiculo) VALUES ('" + revisao.getCodigo() + "','" + revisao.getData() + "','" + revisao.getLaudo() + "','" + revisao.getCod_veiculo() + "')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AtualizarEstoquePosRevisao(Connection db, int cod_peca, int qtd) {
        try {
            Statement stmt = db.createStatement();
            String sql = "UPDATE peca_material SET qtde = qtde - " + qtd + " WHERE id_pecamaterial = '" + cod_peca + "'";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contadorDeLinhas(Connection db, String tabela) {
        Statement stmt;
        ResultSet rsCount;
        try {
            stmt = db.createStatement();
            String count = "SELECT COUNT(*) FROM " + tabela;
            rsCount = stmt.executeQuery(count);
            rsCount.next();
            int countRows = (int) rsCount.getInt(1);
            this.count = countRows;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Atualizar(Connection db, String table_name, String param_a_Atualizar, String where, String paramSearch, String newValueChange) {
        try {
            Statement stmt = db.createStatement();
            String sql = "UPDATE " + table_name + " SET " + param_a_Atualizar + " = '" + newValueChange + "' WHERE " + where + " = '" + paramSearch + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AtualizarVenda(Connection db, String table_name, String param_a_Atualizar, String where, String paramSearch, String newValueChange) {
        try {
            Statement stmt = db.createStatement();
            String valorAntigo = SearchValue(db, paramSearch);
            String sql = "UPDATE " + table_name + " SET " + param_a_Atualizar + " = '" + newValueChange + " " + valorAntigo + "' WHERE " + where + " = '" + paramSearch + "'";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AtualizarVenda(Connection db, String table_name, String param_a_Atualizar, String where, int paramSearch, String newValueChange) {
        try {
            Statement stmt = db.createStatement();
            String valorAntigo = SearchValue(db, paramSearch);
            String sql = "UPDATE " + table_name + " SET " + param_a_Atualizar + " = '" + newValueChange + " " + valorAntigo + "' WHERE " + where + " = '" + paramSearch + "'";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String SearchValue(Connection db, String paramSearch) {
        try {
            Statement stmt = db.createStatement();
            String sql = "SELECT descricao FROM veiculo WHERE cod_veiculo = " + paramSearch + "";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            rs.getString(1);
            return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String SearchValue(Connection db, int paramSearch) {
        try {
            Statement stmt = db.createStatement();
            String sql = "SELECT descricao FROM veiculo WHERE cod_veiculo = " + paramSearch + "";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            rs.getString(1);
            return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public void AtualizarValorPeca(Connection db, String table_name, String param_a_Atualizar, String where, int param_a_encontrar, double newValueChange) {
        try {
            Statement stmt = db.createStatement();
            String sql = "UPDATE " + table_name + " SET " + param_a_Atualizar + " = '" + newValueChange + "' WHERE " + where + " = '" + param_a_encontrar + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AtualizarQuantidadePeca(Connection db, String table_name, String param_a_Atualizar, String where, int paramSearch, int newValueChange) {
        try {
            Statement stmt = db.createStatement();
            String sql = "UPDATE " + table_name + " SET " + param_a_Atualizar + " = '" + newValueChange + "' WHERE " + where + " = '" + paramSearch + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void Deletar(Connection db, String table_name, String row, String value) {
        try {
            Statement stmt = db.createStatement();
            String sql = "DELETE FROM " + table_name + " WHERE " + row + " = '" + value + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset(Connection db, String table_name) {
        try {
            Statement stmt = db.createStatement();
            String sql = "DELETE FROM " + table_name;
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CadastrarPecaRevisao(Connection connection, Revisao revisao, int codP, int qtde) {
        try {
            Statement stmt = connection.createStatement();
            double valor = CalcularValorPecaRevisao(connection, qtde, codP);
            String sql = "INSERT INTO revisao_peca (qtde,valor,id_revisao,id_pecamaterial) VALUES ('" + qtde + "','" + valor + "','" + revisao.getCodigo() + "','" + codP + "')";
            stmt.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Seu registro foi inserido com sucesso!");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double CalcularValorPecaRevisao(Connection db, int qtd, int codP) {
        try {
            Statement stmt = db.createStatement();
            String sql = "SELECT valor FROM peca_material WHERE id_pecamaterial = '" + codP + "'";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            double valor = rs.getDouble(1);
            valor = valor * qtd;
            return valor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    public void CadastrarNegocio(Connection db, Negocio negocio) {
        try {
            Statement stmt = db.createStatement();
            String sql = "INSERT INTO negocio (numero_nota,tipo,data_negocio,valor,cod_veiculo,cpf_cliente,id_colaborador) " +
                    "VALUES ('" + negocio.getNumero_nota() + "','" + negocio.getTipo() + "','" + negocio.getData() + "','" + negocio.getValor() + "','" + negocio.getCod_veiculo() + "','" + negocio.getCpf_cliente() + "','" + negocio.getCod_colaborador() + "')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object[][] FiltrarInt(Connection db, String table_name, String procurar, int paramSearch) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + procurar + " = '" + paramSearch + "'";
            System.out.println(sql);
            System.out.println(paramSearch + " Parametro a buscar" + procurar + " , where");
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltrarData(Connection db, String table_name, String procurar, int paramSearch) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + procurar + " = '" + paramSearch + "'";
            System.out.println(sql);
            System.out.println(paramSearch + " Parametro a buscar" + procurar + " , where");
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltrarDouble(Connection db, String table_name, String procurar, double paramSearch) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + procurar + " = '" + paramSearch + "'";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public Object[][] FiltrarDataEspecial(Connection db, String table_name, String Pwhere, String SinalOperacao, String valor) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String comp = "-01-01";
            String hora = " 08:00:00";
            if (SinalOperacao.equals("=")) {
                String sql = "SELECT * FROM " + table_name + " WHERE " + Pwhere + " = '" + valor + comp + hora + "'";
                rs = stmt.executeQuery(sql);
            } else {
                String sql = "SELECT * FROM " + table_name + " WHERE " + Pwhere + " " + SinalOperacao + " '" + valor + comp + "'";
                rs = stmt.executeQuery(sql);
            }
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltrarDataComLimite(Connection db, String table_name, String valorInicial, String valorFinal) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String comp = "-01-01 08:00:00";

            String sql = "SELECT * FROM " + table_name + " WHERE " + "ano " + "between '" + valorInicial + comp + "' AND '" + valorFinal + comp + "'";

            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltraKms(Connection connection, String veiculo, String quilometragem, String s, String buscar) {
        Object[][] data = null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + veiculo + " WHERE " + quilometragem + " " + s + " '" + buscar + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, veiculo);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltrarIntervalo(Connection db, String table_name, String Pwhere, String valorInicial, String valorFinal) {
        Object[][] data = null;
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + Pwhere + " between '" + valorInicial + "' AND '" + valorFinal + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public Object[][] FiltrarParamComOp(Connection db, String table_name, String Pwhere, String Operacao, String buscar) {
        try {
            Statement stmt = db.createStatement();
            ResultSet rs = null;
            String sql = "SELECT * FROM " + table_name + " WHERE " + Pwhere + " " + Operacao + " '" + buscar + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(db, table_name);
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] Consulta1(Connection connection) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "SELECT rev.cod_veiculo, v.marca , sum(rp.valor) as valor_total " +
                    "FROM revisao as rev inner join revisao_peca as rp on rp.id_revisao = rev.id_revisao " +
                    "inner join veiculo as v on rev.cod_veiculo = v.cod_veiculo" +
                    " group by rev.cod_veiculo, v.marca";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, "revisao_peca");
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] Consulta2(Connection connection, int cod_colaborador, String marca) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "SELECT ven.nome, ven.id_colaborador,v.marca,count(*) , sum(v.valor)  FROM colaborador as ven inner join negocio as n on n.id_colaborador = ven.id_colaborador inner join veiculo as v on n.cod_veiculo = v.cod_veiculo where v.marca = '" + marca + "' AND ven.id_colaborador = " + cod_colaborador + " AND n.tipo = 'Venda' group by ven.nome,ven.id_colaborador,v.marca";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, "revisao_peca");
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            //Object[][] data = new Object[3][3];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] Consulta3(Connection connection, int cod_colaborador) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "SELECT col.nome,v.marca,rev.id_revisao, SUM(rep.valor) from colaborador as col inner join negocio as n on col.id_colaborador = n.id_colaborador inner join veiculo as v on n.cod_veiculo = v.cod_veiculo inner join revisao as rev on rev.cod_veiculo = v.cod_veiculo inner join revisao_peca as rep on rep.id_revisao = rev.id_revisao where n.tipo = 'Compra' AND col.id_colaborador = " + cod_colaborador + " AND n.data_negocio between '2022-09-01' and '2022-09-30' group by col.nome,v.marca,rev.id_revisao";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, "revisao_peca");
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] Consulta4(Connection connection) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "SELECT veiculo.cod_veiculo,veiculo.marca,veiculo.modelo,veiculo.quilometragem,veiculo.valor,veiculo.cor,carro.tipo,carro.tamanhoroda,veiculo.ano,veiculo.descricao FROM carro inner join veiculo on veiculo.cod_veiculo = carro.cod_veiculo";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, "carro");
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Object[][] Consulta5(Connection connection) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = null;
            String sql = "select veiculo.cod_veiculo,veiculo.marca,veiculo.modelo,veiculo.quilometragem,veiculo.valor,veiculo.cor,moto.cilindrada,veiculo.ano,veiculo.descricao from moto inner join veiculo on veiculo.cod_veiculo = moto.cod_veiculo";
            rs = stmt.executeQuery(sql);
            contadorDeLinhas(connection, "moto");
            Object[][] data = new Object[this.count][rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    data[rs.getRow() - 1][i] = rs.getObject(i + 1);
                }
            }
            stmt.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}