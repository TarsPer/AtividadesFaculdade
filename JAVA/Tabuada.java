
package faculdade.exer5;

import java.util.Scanner;

public class Tabuada {

 public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
           
           int n, cal;
           
           System.out.println("Digite um Numero: (Tabuada) ");
           n = input.nextInt();
           
           for (int i=1; i<=10; i++){
               cal = n * i;
               System.out.println(n + " x " + i + " = " + cal);
               //System.out.printf("%d * %d = %d \n",n,i,i*n);
                               //(n)   (i) (i*n)
           }
                   
    }
}
