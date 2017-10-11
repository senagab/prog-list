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
public class Ex17 {
    
    public static void main(String[] args){

        Scanner c = new Scanner(System.in);
        
        int decimal, modulo, aux;
        String binario = "";
        System.out.println("insira um numero decimal: ");
        decimal = c.nextInt();
        aux = decimal;

        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;
        }
        System.out.println("O numero " + aux + " em base 10 é " + binario + " na base 2");
    }

}
