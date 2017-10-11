/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gab
 */
public class Ex13 {
    
    public static void main(String[] args)
    {
        int qComprada;
        double valor;
        Scanner s = new Scanner (System.in);
        System.out.println("Quantas maçãs foram compradas? ");
        qComprada = s.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        if (qComprada > 12)
        {
            valor = qComprada * 1.00;
            System.out.println("O valor da compra é: "+ df.format(valor));
        }
        else
        {
            valor = qComprada * 1.30;
            System.out.println("O valor da compra é: "+ df.format(valor));
        }
    }
}
