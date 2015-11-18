package PacoteTestes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sidimar
 */
public class testes {
    
    
    public testes() {
       
        
    }
    @Test
   /* public void verificadata(){
        pacotequalquer.beneficio beneficio = new pacotequalquer.beneficio(); 
        String dataInclusao = "18/11/2015";
        boolean dataok = true;
        boolean result = beneficio.ValidarData(dataInclusao);
        Assert.assertEquals(dataok, result);
           
        
    }*/
    
    public void qtdDesconto(){
         pacotequalquer.beneficio beneficio = new pacotequalquer.beneficio();
         double desconto = 159.00;
         boolean result =beneficio.calculadesconto(desconto);
         boolean descontoOk = true;
         Assert.assertEquals(descontoOk, result);
    }
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
