/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Gab
 */
public class Ex5 {
    
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = b + 1;
        int d = c > ++b ? (a - 3) : b;
        int e = 4;
        if( d > a && b + 1 < a || b > 1)
        c += 7;
        if( -7 >= -c)
        a -= 4;
        else
        d *= 2;
        e = ++d % 3;
        b = d++ % 3;
        System.out.println("resultado de A " + a);
        System.out.println("resultado de B " + b);
        System.out.println("resultado de C " + c);
        System.out.println("resultado de D " + d);
        System.out.println("resultado de E " + e);
    }
}
