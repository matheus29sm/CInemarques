/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Matheus S M
 */
public class Data {
    public String gerarData(){
        Date d= new Date();
	Calendar c = Calendar.getInstance();
        return c.get(Calendar.DATE)
         + "/" + c.get(Calendar.MONTH)
         + "/" + c.get(Calendar.YEAR)
         + " as " + c.get(Calendar.HOUR_OF_DAY)
         + ":"+ c.get(Calendar.MINUTE)
         +":" + c.get(Calendar.SECOND);
        
    }
}
