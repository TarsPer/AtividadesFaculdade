
package OITODOONZE;

import java.util.Scanner;


public class MaiorNumero {
     public static float entrada() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um Numero: ");
        float num = scan.nextFloat();
        return num;
    }
    
    public static float maior(float a, float b){
        float maior = a;
        if(b>maior){
            maior = b;
        } 
        return maior;
    }
    
    public static void imprimir(float m){
        
        System.out.println("Maior Numero: "+m);
    }
    
    public static void main(String[] args) {
        float a = entrada();
        float b = entrada();
        float m = maior(a, b);        
        imprimir(m);
    }
}

