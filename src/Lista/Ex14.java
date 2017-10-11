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
public class Ex14 {
    
    public static void main(String[]args){
        
        int horasTrabalhada;
        double valorPorHoraTrabalhada;
        double salario;
        double valorPorHora;
        
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        System.out.println("qual a quantidade de horas trabalhadas? ");
        horasTrabalhada = s.nextInt();
        System.out.println("qual o valor por hora trabalhada? ");
        valorPorHoraTrabalhada = s.nextDouble();

        if (horasTrabalhada > 40)
        {
            valorPorHora = (valorPorHoraTrabalhada + (valorPorHoraTrabalhada)/2);
            salario = horasTrabalhada * valorPorHora;
            System.out.println("a quantia do seu salario é: "+ df.format(salario));
        }
        else
        {
            salario = horasTrabalhada * valorPorHoraTrabalhada;
            System.out.println("a quantia do seu salario é: "+ df.format(salario));
        }
    
    }
}
