/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafael.abarbosa1
 */
public interface ProjetoPoo {

    static Scanner leitor = new Scanner(System.in);
    static ArrayList produtos = new ArrayList();

    public static void menu(int opcao) {
        //Estoque popularLista = new Estoque();

        if (opcao == 1) {
            Estoque incluir = new Estoque();
            produtos.add(incluir.inserir());
            System.out.println("produtos cadastrados com sucesso");
        } else if (opcao == 2) {
            System.out.println("digite o código do produto a ser excluído");
            int codigoExclusao = leitor.nextInt();
            Estoque excluir = new Estoque();
            excluir.remover(codigoExclusao);
        } else if (opcao == 3) {
            Estoque consulta = new Estoque();
            consulta.consultar(produtos);
        } else if (opcao == 4) {
        } else if (opcao == 5) {
            System.exit(0);
        }

    }

    public static void main(String[] args) throws IOException {
        String msg = "digite uma opção:";

        String menu = "menu de produtos \n 1- incluir \n 2- excluir \n 3- consultar \n"
                + " 4- exportar arquivo \n 5- sair ";

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
            int cont = 0;
            while (cont < 100) {
                System.out.println(menu + "\n" + msg);
                int opcao = leitor.nextInt();
                menu(opcao);
            }
        } else if (user2) {
            System.out.println("bem vindo usuário comum ");
            int cont = 0;
            while (cont < 100) {
                System.out.println(menu + "\n" + msg);
                int opcao = leitor.nextInt();
                menu(opcao);
            }
        } else {
            System.out.println("vc não está cadastrado!!!");
        }
    }
}
