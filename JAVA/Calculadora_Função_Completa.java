
package OITODOONZE;

import java.util.Scanner;


public class Calculadora_Função_Completa {
    
    public static float entradaDados(){
        System.out.println("entrada de dados");
        Scanner input = new Scanner(System.in);
        System.out.println("Numero: ");
        float n = input.nextFloat();
        return n;
         }
    public static int menu(){
       int op;
        do{
        System.out.println("- Menu -");
        Scanner input = new Scanner(System.in);
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        System.out.println("5- Raiz");
        System.out.println("6- Potencia");
        System.out.println("Opção: ");
        op = input.nextInt();
        
         if (op > 6 || op < 1){
             System.out.println("Opção Invalida, Tente novamente");
         }
        }while (op > 6 || op < 1);
        
        return op;
    }
        public static float adicao(float n1, float n2){
            System.out.println("- Adição -");
            return n1 + n2;
        }
        public static float subtracao(float n1, float n2){
            System.out.println("- Subtração -");
            return n1 - n2;
        }
        public static float multiplicacao(float n1, float n2){
            System.out.println("- Multiplicação -");
            return n1 * n2;
        }
        public static float divisao(float n1, float n2){
            System.out.println("- Divisão -");
            return n1 / n2;
        }
        public static float raiz(float n1){
            
            System.out.println("- Raiz -");
            return (float)Math.sqrt(n1);
        }
        public static float potencia (float n1, float n2){
            System.out.println("- Potencia -");
            return (float)Math.pow(n1, n2);
        }
        public static void imprimirResultado(float r){
            System.out.println("- Imprimir Resultado -");
            System.out.println("Resultado: " + r);
        }
        public static float controlador(float n1, float n2, int op){
            System.out.println("- Controlador -");
            float resultado;
            switch(op){
                case 1:
                    resultado = adicao(n1, n2);
                    break;
                case 2:
                    resultado = subtracao(n1, n2);
                    break;
                case 3: 
                    resultado = divisao(n1, n2);
                    break;
                case 4:
                    resultado = multiplicacao(n1, n2);
                    break;
                case 5: 
                     resultado = raiz(n1);
                     break;
                case 6:
                    resultado = potencia (n1, n2);
                    break;
                default:
                    resultado = 0;
            } 
            return resultado;
        }
        public static void main(String[] args) {
            int op = menu();
            float n1,n2;
            if(op == 5){
            n1 = entradaDados();
            n2 = 0;
            }else{
            n1 = entradaDados();
            n2 = entradaDados();
            }
            float resultado = controlador(n1, n2, op);
            imprimirResultado(resultado);
        }
    }
    
    

