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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complexo z = new Complexo();  
         Complexo w = new Complexo();      
          getData g1 = new getData();   
          getData r1 = new getData();
                  
     z.x = 1;
     z.y = 2;

     System.out.print( "O valor de z é ");
     z.print();
     System.out.println( "A parte real de z é = " + z.Re() );
    // System.out.println( "A parte imaginária de z é = ", z.Im() );
     System.out.print("O valor de z ao quadrado é ");
     w = z.Vezes( z );
     w.print();
       System.out.print(g1.getData2());
       System.out.print("Pica " + r1.getMpdo(4,8));
  }
    }
    

