/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDeDados;

/**
 *
 * @author Jaque
 */
public class testeConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao connect = new Conexao();
        System.out.println("Tentando conexao...");
        connect.conectar();
        System.out.println("Desconectando....");
        connect.desconectar();
    }
    
}
