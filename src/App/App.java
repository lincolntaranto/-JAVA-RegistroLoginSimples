package App;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {


        FileWriter arquivo = new FileWriter("dados.txt", true); // O true serve para que ele abra o arquivo caso ele já exista.
        PrintWriter gravador = new PrintWriter(arquivo);

        // Input do usuario para registro do login e senha
        
        Scanner input = new Scanner(System.in);

        System.out.println("===REGISTRO===");

        System.out.println("Digite seu login:");

        String login = input.nextLine();

        System.out.println("Digite sua senha:");
        
        String senha = input.nextLine();

        // Confere se o login e a senha tem mais de 3 caracteres.

        if (senha.length() < 3 && login.length() < 3) {

            System.out.println("Senha ou login muito curto.");
            
        } else{

            System.out.println("Confirme sua senha:");

            String senha2 = input.nextLine();

            // Confere se as duas senhas inseridas no registro são iguais.

            if(senha2.equals(senha)){

                gravador.println("Login: " + login);
                gravador.println("Senha: " + senha);

                System.out.println("Registrado com sucesso!");

            } else{

                System.out.println("As senhas não conferem.");

            }


        }

        // Área de login
        
        System.out.println("===LOGIN===");
        System.out.println("Login:");
        String loginL = input.nextLine();

        System.out.println("Senha:");
        String senhaL = input.nextLine();

            if(loginL.equals(login) && senhaL.equals(senha) ){
                System.out.println("Logado com sucesso!");
            } else{
                System.out.println("Login ou senha não conferem.");
            }


        input.close();
        arquivo.close();
        gravador.close();

    }

}
