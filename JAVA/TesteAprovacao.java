
package OITODOONZE;

import java.util.Scanner;


public class TesteAprovacao {
    
    public static void main(String[] args) {
        String nota = imprimirNota(dados());
        System.out.println(nota);
    }
    
    public static float dados(){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite sua nota: ");
              
            float n = input.nextFloat();
            return n;
        }
        
         public static String imprimirNota (float n){
         String status;
        if (n >= 6){
            status = "Aprovado";
            
        } else {
            status = "Reprovado";
        }
        return status ;
    } 
}
