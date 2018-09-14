/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juniorredes;
import java.util.Scanner;
public class Fibonacci {
  
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
  
    public static void main(String[] args) {   
    Scanner tcl = new Scanner(System.in);
    System.out.println("Digite a quantidade");
        int aux = tcl.nextInt();
        int vetor = aux;
        for (int i = 0 ; i < vetor.lenght ; i++) {
                System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }
  
    }
}
  
