/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDados;


import java.sql.Connection;//
import java.sql.DriverManager;//
import java.sql.SQLException;//
import java.util.logging.Level;//
import java.util.logging.Logger;//
import javax.swing.JOptionPane;


/**
 *
 * @author Jaque
 */
public class Conexao {
    private String driver; //identificar o serviço do BD
    private String caminho; //armazenar o caminho da conexão
    private String usuario;
    private String senha;
    private Connection conn;
    
    public Conexao(){
        this.driver = "com.mysql.jdbc.Driver";
        this.caminho = "jdbc:mysql://localhost:3306/beneficio_convenio?zeroDateTimeBehavior=convertToNull";
        this.usuario = "root";
        this.senha = "";
    }
    
    public Conexao(String driver, String caminho, String usuario, String senha){
        this.driver = driver;
        this.caminho = caminho;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void conectar(){
        try {
            Class.forName(driver);//carregar o driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (ClassNotFoundException ex) {
            //JOptionPane.showMessageDialog(null, "erro ao conectar");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar(){
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConexao() {
        return this.conn;
    }
}