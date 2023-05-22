
package faculdade.exer5;

import java.util.Scanner;

public class Login_Senha {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       // String errou = "";
        
        
        String loginAcesso = "admin";
        
        System.out.println("Crie seu login: ");
        String login = input.next();
        
        System.out.println("Cadastra-se sua senha: ");
        String snc = input.next();

        int contador = 3;
        
        while(contador > 0){
            
            System.out.println("Digite sua Senha:  ");
            
            String sn = input.next();
            
            if(snc.equals(sn) && login.equals(loginAcesso))
            {
                System.out.println("ACESSO PERMITIDO!");
                
                contador = 0;
            }else{
                
                    System.out.println("Senha incorreta, Tente novamente: \nTentativas Restantes: "+ ( contador = contador - 1 ));
                    
                    if(contador == 0){
                        System.out.println("Acesso Bloqueado (Senha Incorreta)");
                    }
            }
        }
        
    }
}
