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
public class Ex15 {
    public static void main(String[] args){
        
        int qEstoque;
        int qMax;
        int qMin;
        int mEstoque;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a Quantidade de Estoque Atual: ");
        qEstoque = s.nextInt();
        System.out.println("Entre com a Quantidade Maxima de Estoque: ");
        qMax = s.nextInt();
        System.out.println("Entre com a Quantidade Minima de Estoque: ");
        qMin = s.nextInt();
        
        mEstoque = (qMax + qMin)/2;
        System.out.println("A Média do estoque é " + mEstoque );
        
        if (qEstoque <= mEstoque) 
        {
            System.out.println("Não efetuar Compra");
        }
        else
        {
            System.out.println("Efetuar Compras");
        }
    }
}
