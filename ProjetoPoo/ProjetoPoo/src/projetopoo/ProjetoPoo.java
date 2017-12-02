/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author rafael.abarbosa1
 */
public class ProjetoPoo {

    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("informe o usuario:");
            String usuario = entrada.readLine();
            System.out.println("informe a senha:");
            String senha = entrada.readLine();
            Gerente usu = new Gerente(usuario, senha);
            boolean user = usu.confere(usuario, senha);
            Comum usu2 = new Comum(usuario, senha);
            boolean user2 = usu2.confere(usuario, senha);
        
        if (user) {
            System.out.println("bem vindo sr. gerente");
        } else if (user2) {
            System.out.println("bem vindo usuário comum ");
        } else {
            System.out.println("vc não está cadastrado!!!");
        }
        
    }

}
