/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beneficios_convenios;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaque
 */
public class BeneficioTest {
    
    public BeneficioTest() {
    }
   
    @Test
    public void testAtribuirData() {
        beneficios_convenios.Beneficio b1 = new beneficios_convenios.Beneficio("a", 
                "22/11/2015", "b", "c");
        b1.setData_beneficio("22/11/2015");
        boolean esperado = true;
        boolean resultado = b1.atribuirData(b1.getData_beneficio());
        Assert.assertEquals(esperado, resultado);
        
    }
    
}
