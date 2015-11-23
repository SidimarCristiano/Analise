/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beneficios_convenios;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Benefícios podem ser perfeitamente, dentro do contexto empresarial, algumas
regalias ou vantagens concedidas aos empregados como parte que se adiciona aos
salários, uma remuneração extra de acordo com que os empregados de uma empresa.

*/
/**
 *
 * @author Jaque
 */
public class Beneficio extends Cadastro{
    
    private String tipo_beneficio;
    private String acrescimo;
    
    public Beneficio(String nome, String data, String tipo, String acrescimo){
        super(nome, data);
        this.tipo_beneficio = tipo;
        this.acrescimo = acrescimo;
    }
    
    public void setTipo_beneficio(String tipo){
        this.tipo_beneficio = tipo;
    }
    
    public String getTipo_beneficio(){
        return tipo_beneficio;
    }
    
    public void setAcrescimo(String acresc){
        this.acrescimo = acresc;
    }
    
    public String getAcrescimo(){
        return acrescimo;
    }
    
    @Override
    public void inserir(){
        System.out.println("inserido com sucesso");
    }
    
    @Override
    public void excluir(){
        System.out.println("excluido com sucesso");
    }
    
    @Override
    public void editar(){
        System.out.println("Editado com sucesso");
    }
    
    @Override
    public void consultar(){
        System.out.println("Consultado");
    }
    
    public boolean atribuirData(String dataT){
        String dataIncluida = "22/11/2015";
      
        
        if (dataT != dataIncluida){
            return false;
        }else return true;
    }
}
