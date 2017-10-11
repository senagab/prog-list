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
public class Ex12 {
    
    public static void main(String[] args) {
        
        int ladox, ladoy, ladoz;
        int option = 1;
        while (option == 1) {
            Scanner s = new Scanner(System.in);
            
            System.out.println("insira o lado x:");
            ladox = s.nextInt();
            
            System.out.println("                           ");
            
            System.out.println("insira o lado y:");
            ladoy = s.nextInt();
            
            System.out.println("                           ");
            
            System.out.println("insira o lado z:");
            ladoz = s.nextInt();
            
            System.out.println("                           ");
            
            if ((ladox < ladoy + ladoz) && (ladoy < ladox + ladoz) && (ladoz < ladox + ladoy)) {
                if (ladox == ladoy && ladox == ladoz) {
                    System.out.println("Triangulo Equilatero");
                } else if ((ladox == ladoy) || (ladox == ladoz)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("                             ");
            System.out.println("Deseja continuar? -- 1(Sim)/2(Não)-- ");
            option = s.nextInt();
            System.out.println("                             ");
        } System.out.println("Até logo :) ");
    }
}
