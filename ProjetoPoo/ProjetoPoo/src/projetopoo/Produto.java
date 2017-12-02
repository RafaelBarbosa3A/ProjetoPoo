/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

/**
 *
 * @author rafael.abarbosa1
 */
public class Produto {
    int codProd, qtd;
    String nome, descricao;
    double valor;

    public Produto(int codProd, String descricao, String nome, double valor, int qtd) {
        this.codProd = codProd;
        this.descricao = descricao;
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }
    
    public Produto(){
        
    }

    public int getId() {
        return codProd;
    }

    public void setId(int id) {
        this.codProd = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}