/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beneficios_convenios;


/*
O convenio é um desconto em algum serviço. Então, o funcionário que adere a ele,
tem que pagar um valor simbólico no mês, a fim de quitar seu uso do serviço
conveniado.
*/

/**
 *
 * @author Jaque
 */
public class Convenio extends Cadastro{
    
    private String empresa;
    private String tipo_convenio;
    private double desconto;
    
    public Convenio (String empresa, String tipo, double desconto, 
            String nome, String data){
        super(nome, data);
        this.empresa = empresa;
        this.tipo_convenio = tipo;
        this.desconto = desconto;
    }

  
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    public void setTipo_convenio(String tipo){
        this.tipo_convenio = tipo;
    }
    
    public String getTipo_convenio(){
        return tipo_convenio;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    public double getDesconto(){
        return desconto;
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
    
    
}
