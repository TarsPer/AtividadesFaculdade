
package OITODOONZE;

import java.util.Scanner;

public class ParEImpar {
    public static int entrada() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero pra ver se é par ou impar: ");
        int n = scan.nextInt();
        return n;
    }
    public static int par(int n){
        int par = (n%2);
        return par;
    }
    public static void imprimir(int par){
        if(par == 0){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }
    }
    public static void main(String[] args) {
        int n = entrada();
        int par = par(n);
        imprimir(par);
    }
}

