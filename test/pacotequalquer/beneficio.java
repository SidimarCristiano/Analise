/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotequalquer;

import org.junit.Test;

/**
 *
 * @author Sidimar
 */

public class beneficio {
    double salariobase= 800.00;
    double totaldesconto = 0.20;
    
    String dataAtual = "18/11/2015";
    public boolean ValidarData(String data){
        if(dataAtual.equals(data)){
            return true;
        }else
            return false;
        
    }
    
    public boolean calculadesconto(double desconto){
        if(desconto<=(salariobase*totaldesconto))
            return true;
          else
            return false;
    }
}
