
package OITODOONZE;

import java.util.Scanner;

public class MenorEntreTodos {
    public static void main(String[] args) {
        
        entradaDados();
        
    }
    public static float entradaDados(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro:");
        float n1 = input.nextFloat();
        
        System.out.println("Digite o Segundo:");
        float n2 = input.nextFloat();
        
        System.out.println("Digite o Terceiro:");
        float n3 = input.nextFloat();
        
       if (n1<n2 && n1<n3){
           System.out.println("numero menor: " + n1);
         float menor = n1;  
         
       }else if (n2<n3 && n2<n1){
            System.out.println("numero menor:" + n2);
       float menor = n2;
       
       }else if (n3<n2 && n3<n1)
            System.out.println("Numero Menor: " + n3);
       float menor = n3;

       return menor;
    }
}


