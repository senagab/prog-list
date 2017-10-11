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
public class Ex18 {
    
    public static void main(String[] args) {

        int n=0;
        Scanner leitorDeDados = new Scanner(System.in);
        System.out.println("insira o valor de n");
        n = leitorDeDados.nextInt();
        for(int linha = 1; linha<=n; linha++){
            for(int coluna = 1; coluna<=n; coluna++){
                System.out.print(" " + linha + coluna + " ");
            }
            System.out.println("");
        }        
    }
}
