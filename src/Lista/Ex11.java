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
public class Ex11 {
    
    public static void main(String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        
        int i = numeroDigitado.nextInt();
        
        if (i < 10) {
            System.out.println(i + " é menor que 10");
        } else if (i > 10){
            System.out.println(i + " é maior que 10");
        } else if (i == 10){
            System.out.println(i + " é igual a 10");
        }
    }
}
