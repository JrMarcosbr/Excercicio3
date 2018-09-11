
import java.util.Scanner;


public class Caixa {
    double saldo = 0;
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcao = 1;
        Caixa obj = new Caixa();
        while(opcao != 0){
        obj.menu();
        System.out.println("DIGITE UMA AÇÃO ");
        opcao= tcl.nextInt();
        switch(opcao){
            case 1 : obj.VerSaldo();
            break;
            case 2 : obj.Sacar();
            break;
            case 3 : obj.Depositar();
            break;
            case 4 : System.exit(0);
            break;
            default:
                System.out.println("ESTA NÃO E UMA OPÇÃO VÁLIDA");
            }
        }
    }
    public void menu(){
        System.out.println("CAIXA ELETRONICA");
        System.out.println(" ");
        System.out.println("1 - VER SALDO");
        System.out.println("2 - SACAR");
        System.out.println("3 - DEPOSITAR");
        System.out.println("4 - SAIR");
        System.out.println(" ");
    }
    public void VerSaldo(){
        System.out.println("SEU SALDO E DE R$:"+saldo);
    }
    public double Sacar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR A SER SACADO");
        double sacar = tcl.nextDouble();
        saldo = saldo - sacar;
        return saldo;   
    }
    public double Depositar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR A SER DEPOSITADO");
        double dep = tcl.nextDouble();
        saldo = saldo + dep;
        return saldo;
    }
}
