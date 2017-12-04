/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;


import java.util.List;

/**
 *
 * @author rafael.abarbosa1
 */
public abstract class Usuario{
    
    String usuario;
    String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public abstract List<Produto> consulta();

    public abstract List usuarioSenha();

    public abstract boolean confere(String usuario, String senha);

}
