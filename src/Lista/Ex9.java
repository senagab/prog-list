/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Gab
 */
public class Ex9 {
    
    public static void main(String[] args) {

        int c = 1;
        c = 0;
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        c -= --c - c++;
        
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        /** 
         * sequência de 6 linhas, todas com valor zero 
         */
    }
}
