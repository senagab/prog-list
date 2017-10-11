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
public class Ex16 {
    
    public static void main(String[] args) {

        float nota = 0;
        int quantidade = 0;
        float sum = 0;
        float media = 0;
        Scanner leitorDeDados = new Scanner(System.in);
        do{
            System.out.println("insira o valor da sua nota ou -1 para sair");
                 nota = leitorDeDados.nextFloat();
            if (nota >= 0 && nota <= 10){
                sum+=nota;
                quantidade++;
            }else if (nota==-1){
                break;
            }else{
                System.out.println("insira um valor válido");
            }
                
        }while(true);
        
        media = sum/quantidade;
        
        System.out.println("a media é " + media);
    }
    
}
