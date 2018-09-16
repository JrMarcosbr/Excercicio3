package juniorredes;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        primo obj = new primo();
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR ");
        int num1 = tcl.nextInt();
        int result = obj.funcao(num1);
    }
    public int funcao(int num1){
        for (int i = 1; i < num1 ; i++) {
            if (num1%i == 0){
                System.out.println("O numero "+num1+" nao e primo");
                break;
            }else{
                System.out.println("O numero "+num1+" e primo");
                break;
            }
        }
        return 0;
    }
}
