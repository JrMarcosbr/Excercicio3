/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juniorredes;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        double fatorial = 1;
        Fatorial obl = new Fatorial();
        obl.fat(fatorial);
    }
    
public double fat(double fatorial){
        while(true){
            Scanner tcl = new Scanner (System.in);
            System.out.println("Digite um valor ");
            double valor1 = tcl.nextDouble();
            System.out.println("Digite outro valor ");
            double valor2 = tcl.nextDouble();
            double saida1 = 0;
            double saida2 = 0;
            for( int i = 2; i <= valor1; i++ ){ 
            fatorial = fatorial * i;
            saida1 = fatorial;
            }
            for( int i = 2; i <= valor2; i++ ){ 
            fatorial = fatorial * i;
            saida2 = fatorial;
            }
            System.out.println(saida1+saida2);  
        } 
    }
}