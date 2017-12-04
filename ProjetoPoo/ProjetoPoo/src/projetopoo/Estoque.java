/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author rafael.abarbosa1
 */
public class Estoque extends Produto {

    Scanner leitor = new Scanner(System.in);
    ArrayList<Produto>produtos;

    public ArrayList inserir() {
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
        Produto prod = new Produto(codProd, descricao, nome, valor, qtd);

        ArrayList produtos = new ArrayList();
        produtos.add(prod);

        return produtos;
    }

    public boolean remover(int id) {
        ArrayList<Produto> produt = consultar(produtos);
        for (int i = 0; i < produt.size(); i++) {
            if (produt.get(i).getId() == id) {
                produt.remove(produt.get(i).getId());
                System.out.println("produto excluído com sucesso");
            }
        }
        return true;
    }

    public ArrayList consultar(ArrayList<Produto>prod) {
        
        if (!prod.isEmpty()) {
            for(int i = 0; i<prod.size();i++){
                System.out.print(prod.get(i).getNome() + " / " + prod.get(i).getDescricao() + " / " + 
                        prod.get(i).getQtd() + " / " + prod.get(i).getValor());
                System.out.println("");
            }

        } else {
            System.out.println("ops, a lista parece estar vazia :(");
        }
        return prod;
    }
}
