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

    static Scanner leitor = new Scanner(System.in);

    public static void menu(int opcao) {
        switch(opcao){
            case 1:
                Estoque incluir = new Estoque();
                incluir.inserir();
                break;
            case 2:
                System.out.println("digite o codigo do produto a ser excluído");
                int id = leitor.nextInt();
                Estoque excluir = new Estoque();
                excluir.remover(id);
                break;
            case 3:
                Estoque consulta = new Estoque();
                consulta.consultar();
                break;
            case 4:
                //implementar
            case 5:
                System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        String msg = "digite uma opção:";
        
        String menu = "menu de produtos \n 1- incluir \n 2- excluir \n 3- consultar \n"
                + "4- exportar arquivo \n 5- sair ";
/*        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
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
*/       
        System.out.println(menu + "\n" + msg);
        int opcao = leitor.nextInt();
        menu(opcao);

    }

}
