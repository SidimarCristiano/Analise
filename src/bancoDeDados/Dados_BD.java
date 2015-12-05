/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDados;

import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaque
 */
public class Dados_BD {

    Conexao conect;

    public Dados_BD() {

    }

    public ResultSet consultar(String tabela) throws SQLException {
        conect = new Conexao();
        conect.conectar();
        String sql = "SELECT * FROM " + tabela;
        PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
        // stmt.execute();
        ResultSet dados = stmt.executeQuery(sql);
        return dados;
    }

    public void inserirBeneficio(String nome, String data, String tipo, String valorB) {
        conect = new Conexao();
        conect.conectar();

        String sql = "insert into beneficio (nomeBeneficio, dataInclusao, tipoBeneficio, acrescimo)"
                + " values (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, data);
            stmt.setString(3, tipo);
            stmt.setString(4, valorB);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Registro Inserido com sucesso!");
            sucesso();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro!");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }

        conect.desconectar();

    }

    public void excluir(int id) {
        conect = new Conexao();
        conect.conectar();

        String sql = "DELETE FROM beneficio WHERE idBeneficio=?";

        try {
            PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
            sucesso();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro!");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }

        conect.desconectar();
    }

    public void updateBeneficio(String id, String nome, String data, String tipo, String valorB) {
        conect = new Conexao();
        conect.conectar();

        

        String sql = "UPDATE beneficio "
                + "SET nomeBeneficio=?, dataInclusao=?, tipoBeneficio=?, acrescimo=? WHERE idBeneficio=?";
        try {
            PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, data);
            stmt.setString(3, tipo);
            stmt.setString(4, valorB);
            stmt.setString(5, id);

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro atalizado com sucesso!");
            sucesso();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro!");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }

        conect.desconectar();

    }

    public void inserirConvenio(String nome, String Status) {
        Conexao conect = new Conexao();
        conect.conectar();

        String sql = "INSERT INTO convenio (nome_convenio, status)"
                + " values (?, ?)";
        try {
            PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, Status);

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Registro Inserido com sucesso!");
            sucesso();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro!");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }

        conect.desconectar();

    }

    public boolean sucesso() {
        return true;

    }

}
