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
public class Ex8 {
    
    public static void main(String[] args) {
        
        int n1;
        int n2;
        double media;
        
        Scanner nMedia = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota: ");
        n1 = nMedia.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        n2 = nMedia.nextInt ();
        
        media = (n1 + n2) /2;
        if (media >= 6){
            System.out.println("aprovado!!!");
        } else{
            System.out.println("reprovado :( ");
        }
    }
}
