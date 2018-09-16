
package juniorredes;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        primo obj = new primo();
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR ");
        int num1 = tcl.nextInt();
        int aux = num1 % num1;
        int aux1 = 1 / num1;
        int result = obj.funcao(aux, aux1);
    }
    public int funcao(int aux,int aux1){
        if (aux == 0 && aux1 >= 0){
            return System.out.println("ESSE NUMERO E PRIMO");
        }else{
            return System.out.println("ESSE NUMERO NÃO E PRIMO"); 
        }
    }
}
