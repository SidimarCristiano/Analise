/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beneficios_convenios;

import bancoDeDados.Dados_BD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 Benefícios podem ser perfeitamente, dentro do contexto empresarial, algumas
 regalias ou vantagens concedidas aos empregados como parte que se adiciona aos
 salários, uma remuneração extra de acordo com que os empregados de uma empresa.

 */
/**
 *
 * @author Jaque
 */
public class Beneficio extends Cadastro {

    private String tipo_beneficio;
    private String acrescimo;
    private String Status;
    private String id;
    Dados_BD dados;

    public Beneficio() {
    }

    public Beneficio(String nome, String data, String tipo, String acrescimo, String id) {
        super(nome, data);
        this.tipo_beneficio = tipo;
        this.acrescimo = acrescimo;
        this.id = id;
    }

    public void setTipo_beneficio(String tipo) {
        this.tipo_beneficio = tipo;
    }

    public String getTipo_beneficio() {
        return tipo_beneficio;
    }

    public void setAcrescimo(String acresc) {
        this.acrescimo = acresc;
    }

    public String getAcrescimo() {
        return acrescimo;
    }

    @Override
    public void inserir() {
        System.out.println("inserido com sucesso");
    }

    @Override
    public void excluir() {
        dados = new Dados_BD();
        dados.excluir(Integer.parseInt(this.getId()));
        System.out.println("excluido com sucesso");
    }

    public void editar(List dadosAlterar) {

        String id = (String) dadosAlterar.get(0);
        String nome = (String) dadosAlterar.get(1);
        String data = (String) dadosAlterar.get(2);
        String tipo = (String) dadosAlterar.get(3);
        String valorB = (String) dadosAlterar.get(4);

        dados = new Dados_BD();
        dados.updateBeneficio(id, nome, data, tipo, valorB);
        
        if(dados.sucesso() == true){
            sucesso();
        }
        

    }

    @Override
    public void consultar() {

    }

//    public  ArrayList<Beneficio> consultarArray(){
//         ArrayList<Beneficio> consulta = new ArrayList<>();
//         Dados_BD db = new Dados_BD();
//         ResultSet dados=null;
//        try {
//            dados = db.consultar("beneficio");
//        } catch (SQLException ex) {
//            Logger.getLogger(Beneficio.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//         while(dados.next()){
//             Beneficio beneficio = new Beneficio();
//             cardapioVO.setCodigo(dados.getInt("codigoP"));
//             cardapioVO.setNome(dados.getString("nomeProduto"));
//             cardapioVO.setPreco(dados.getDouble("preco"));
//             cardapioVO.setTipo(dados.getString("tipo"));
//             consulta.add(cardapioVO);
//         }
//          return consulta;
//        }catch(Exception e){
//        
//        }
//    }
//    @Override
//    public ArrayList<Beneficio> consultar()throws SQLException{
//      
//    }
    public boolean atribuirData(String dataT) {
        String dataIncluida = "22/11/2015";

        if (dataT != dataIncluida) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    public boolean sucesso(){
        if(dados.sucesso() == true){
            return true;
        }else return false;
    }
}
