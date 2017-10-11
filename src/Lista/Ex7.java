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
public class Ex7 {
    
    public static void main(String[] args) {
        
        int n1;
        int n2;
        String Operation;

        Scanner enter = new Scanner(System.in);

        System.out.println("digite a operação: ");
        Operation = enter.next();        

        System.out.println("digite o primeiro número: ");
        n1 = enter.nextInt();

        System.out.println("digite o segundo número: ");
        n2 = enter.nextInt();
        
        switch (Operation){
            case "+":
                System.out.println("O resultado da soma é: " + (n1+n2));
            case "-":
                System.out.println("O resultado da subtração é: " + (n1-n2));
            case "/":
                System.out.println("O resultado da divisão é: " + (n1/n2));
            case "*":
                System.out.println("O resultado da multiplicação é: " + (n1*n2));
            }
        
    }
}
