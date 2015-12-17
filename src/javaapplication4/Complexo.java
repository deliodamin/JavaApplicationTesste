/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author delio
 */

 // Classe de números complexos
class Complexo {
  double x=0, y=0;       // parte real e complexo, respectivamnte
  public double Re() { // retorna a parte real
    return x;
  }
  public double Im() { //retorna a parte imaginaria
    return y; 
  }
  public Complexo Vezes(Complexo c) {
     Complexo resultado = new Complexo();  
     resultado.x = x * c.x - y * c.y;
     resultado.y = x * c.y + y * c.x;
     return resultado;
  }
  public void print() {
    System.out.println("(" + x + " + " + y + "i)");
  }
}   

