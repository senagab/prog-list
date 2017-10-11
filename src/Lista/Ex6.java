/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author Gab
 */
public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner numeroEntrada = new Scanner (System.in);
        
        System.out.println("type a number: "); 
        
        int i = numeroEntrada.nextInt();
        
        if (i % 2 == 0){
        System.out.println("O numero " + i + " é par");
        } else {
        System.out.println( " O numero " + i + " é impar");}
    }
}
