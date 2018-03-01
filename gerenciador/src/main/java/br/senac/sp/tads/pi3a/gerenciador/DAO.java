package br.senac.sp.tads.pi3a.gerenciador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAO {

    private Connection obterConexao() throws ClassNotFoundException, SQLException {

        // 1A) Registrar driver JDBC
        Class.forName("com.mysql.jdbc.Driver");

        // 1B) Abrir conexão com DB
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/PRODUTOBD", "root", "");
    }

    public void incluir(Produto produto) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO PRODUTOBD.PRODUTO(NOME, DESCRICAO, PRECO_COMPRA, "
                + "PRECO_VENDA, QUANTIDADE, DT_CADASTRO) VALUES (?,?,?,?,?,?)";

        try (Connection conn = obterConexao();
                PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getDescricao());
            statement.setDouble(3, produto.getPrecoCompra());
            statement.setDouble(4, produto.getPrecoVenda());
            statement.setInt(5, produto.getQtde());
            Timestamp t = new Timestamp(produto.getDataCadastro().getTime());
            statement.setTimestamp(6, t);

            statement.executeUpdate();
        }
    }
    
        public List<Categoria> receberCategorias() throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM PRODUTOBD.CATEGORIA";

        List<Categoria> lista = new ArrayList<Categoria>();

        try (Connection conn = obterConexao();
                PreparedStatement statement = conn.prepareStatement(query)) {

            ResultSet resultados = statement.executeQuery(query);

            while (resultados.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(resultados.getInt("ID"));
                categoria.setNome(resultados.getString("NOME"));
                lista.add(categoria);
            }

        } catch (Exception e) {

        }
        return lista;
    }

    public List<Produto> consultar(String tipo, String pesquisa) throws ClassNotFoundException, SQLException {
        String query = "SELECT ID, NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DT_CADASTRO "
                + "FROM PRODUTOBD.PRODUTO";

        List<Produto> lista = new ArrayList<Produto>();

        try (Connection conn = obterConexao();
                PreparedStatement statement = conn.prepareStatement(query)) {

            if (tipo.equals("Nome") && !pesquisa.equals("")) {
                query = "SELECT ID, NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DT_CADASTRO "
                        + "FROM PRODUTOBD.PRODUTO WHERE NOME = '" + pesquisa + "'";
            } else if (tipo.equals("Descrição") && !pesquisa.equals("")) {
                query = "SELECT ID, NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DT_CADASTRO "
                        + "FROM PRODUTOBD.PRODUTO WHERE DESCRICAO = '" + pesquisa + "'";
            } else if (!tipo.equals("Selecione....") && pesquisa.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor inserir um valor válido para a busca");
                query = "";
            }

            ResultSet resultados = statement.executeQuery(query);

            while (resultados.next()) {
                Produto produto = new Produto();
                produto.setId(resultados.getLong("ID"));
                produto.setNome(resultados.getString("NOME"));
                produto.setDescricao(resultados.getString("DESCRICAO"));
                produto.setPrecoCompra(resultados.getDouble("PRECO_COMPRA"));
                produto.setPrecoVenda(resultados.getDouble("PRECO_VENDA"));
                produto.setQtde(resultados.getInt("QUANTIDADE"));
                produto.setDataCadastro(resultados.getDate("DT_CADASTRO"));
                lista.add(produto);
            }

        } catch (Exception e) {

        }
        return lista;
    }

    public void editar(Produto produto) throws ClassNotFoundException, SQLException {
        String query = "UPDATE PRODUTOBD.PRODUTO SET "
                + "NOME = '" + produto.getNome() + "'" + ", "
                + "DESCRICAO = '" + produto.getDescricao() + "'" + ", "
                + "PRECO_COMPRA = '" + produto.getPrecoCompra() + "'" + ", "
                + "PRECO_VENDA = '" + produto.getPrecoVenda() + "'" + ", "
                + "QUANTIDADE = '" + produto.getQtde() + "'" + ", "
                + "DT_CADASTRO = '" + produto.getDataCadastro() + "'" + ", "
                + "WHERE ID = '" + produto.getId() + "'";
        System.out.println(query);
        try (Connection conn = obterConexao();
                PreparedStatement statement = conn.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void excluirProduto(Long codigo) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM PRODUTOBD.PRODUTO WHERE ID = " + codigo;

        try (Connection conn = obterConexao();
                PreparedStatement statement = conn.prepareStatement(query)) {

            statement.executeUpdate();
        }

    }

}
