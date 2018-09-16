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
        int vetor[] = new int[aux];
        for (int i = 0 ; i <= vetor.length ; i++) {
                System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }
  
    }
}