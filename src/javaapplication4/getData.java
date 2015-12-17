package javaapplication4;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delio
 */
public class getData {
    	public String getData2() {  
     SimpleDateFormat sdf = new SimpleDateFormat("MMM-yy");   
	     return sdf.format(new Date()).toUpperCase();  
	}  
 public int getMpdo(int a, int b) {  
      
     int resultado;
     resultado = a + b;   
	     return resultado;  
	}  
}
