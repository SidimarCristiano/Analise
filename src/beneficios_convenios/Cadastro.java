/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beneficios_convenios;

import bancoDeDados.Conexao;
import bancoDeDados.Dados_BD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jaque
 */
public class Cadastro {
    private String id;
    private String nome;
    private String data;
    //private double desconto;
    
    public Cadastro(String nome, String data){
        this.nome = nome;
        this.data = data;
        //this.desconto = desconto;        
    }
    
    public void setId_beneficio(String id){
        this.id = id;
    }
    
    public String getId_beneficio(){
        return id;
    }
    
    public void setNome_beneficio(String nome){
        this.nome = nome;
    }
    
    public String getNome_beneficio(){
        return nome;
    }
    
    public void setData_beneficio(String data){
        this.data = data;
    }
    
    public String getData_beneficio(){
        return data;
    }
    
       /*
    public void setDesconto_beneficio(double desconto){
        this.desconto = desconto;
    }
    
    public double getDesconto_beneficio(){
        return desconto;
    }*/
    
    public void inserir(){
        
    }
    
    public void excluir(){
        
    }
    public void editar(){
       
    }
    
   public void consultar(){
   }
    
   
    public void relatorio(){
        
    }
    
}
