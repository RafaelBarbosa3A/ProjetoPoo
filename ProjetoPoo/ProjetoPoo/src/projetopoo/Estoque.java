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

    public Estoque(String nome, double valor, int qtd) {
        super(nome, valor, qtd);

    }

    public List armazenar() {
        List prodCadastrados = new ArrayList();
        Produto produto = new Produto(nome, valor, qtd);

        prodCadastrados.add(produto);
        
        return prodCadastrados;
    }
}
