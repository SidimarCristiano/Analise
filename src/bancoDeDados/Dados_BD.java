/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDados;

import java.security.Principal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaque
 */
public class Dados_BD {
    
    public Dados_BD(){
        
    }
    
    public void inserirBeneficio(String nome, String data, String tipo, String valorB){
        Conexao conect = new Conexao();
        conect.conectar();
        
        String sql = "insert into beneficio (nomeBeneficio, dataInclusao, tipoBeneficio, acrescimo)"
                +" values (?, ?, ?, ?)";
        try{
        PreparedStatement stmt = conect.getConexao().prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, data);
        stmt.setString(3, tipo);
        stmt.setString(4, valorB);
        
        stmt.execute();
         
        JOptionPane.showMessageDialog(null, "Registro Inserido com sucesso!");
            sucesso();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro!");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, e);
        }
        
        conect.desconectar();
        
    }
    
    public boolean sucesso(){
            return true;
        }
    
}
