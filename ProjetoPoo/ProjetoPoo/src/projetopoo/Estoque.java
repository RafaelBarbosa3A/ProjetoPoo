/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafael.abarbosa1
 */
public class Estoque extends Produto {
    Scanner leitor = new Scanner (System.in);

    List<Produto> produtos = new ArrayList();

    public boolean inserir() {
        System.out.println("digite o código do produto:");
        int codProd = leitor.nextInt();
        System.out.println("digite a descrição:");
        String descricao = leitor.next();
        System.out.println("digite o nome:");
        String nome = leitor.next();
        System.out.println("digite o valor:");
        double valor = leitor.nextDouble();
        System.out.println("digite a quantidade:");
        int qtd = leitor.nextInt();
        Produto produto = new Produto(codProd, descricao, nome, valor, qtd);
        produtos.add(produto);

        return false;
    }

    public boolean remover(int id) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                produtos.remove(id);
            }
        }

        return false;
    }

    public List<Produto> consultar() {
        return produtos;
    }
}
