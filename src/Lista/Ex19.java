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
public class Ex19 {
    
    public static void main(String[] args) {
        
        int acc;
        float saldo, saldoAtual;
        float credito;
        float debito;

        Scanner s = new Scanner(System.in);
        
        System.out.println("insira o numero da conta: ");
        acc = s.nextInt();
        
        System.out.println("insira o saldo da conta: ");
        saldo = s.nextFloat();
        
        System.out.println("insira o valor do credito: ");
        credito = s.nextFloat();
        
        System.out.println("insira o valor do débito: ");
        debito = s.nextFloat();

        saldoAtual = saldo - debito + credito;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("seu saldo atual é de " + df.format(saldoAtual));
        if (saldoAtual >= 0) {
            System.out.println("saldo positivo XD ");
        } else {
            System.out.println("saldo negativo :( ");
        }
    }
}
