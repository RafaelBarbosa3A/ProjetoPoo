/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael.abarbosa1
 */
public class Estoque extends Produto {

    List<Produto> produtos = new ArrayList();

    public boolean inserir(int codProd, String descricao, String nome, double valor, int qtd) {
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
