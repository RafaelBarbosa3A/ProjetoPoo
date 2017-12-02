/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael.abarbosa1
 */
public class Comum extends Usuario {

    public Comum(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public List<Produto> consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List usuarioSenha() {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("informe o usuario:");
            String usuario = entrada.readLine();
            System.out.println("informe a senha:");
            String senha = entrada.readLine();
            
            List usuSenha = new ArrayList();
            Usuario novo = null;
            usuSenha.add(novo.getUsuario());
            usuSenha.add(novo.getSenha());
            
            return usuSenha;

            /*Properties p = new Properties();

            p.load(new FileInputStream("usuarioPoo.txt"));
            if (confere(usuario, senha,new File("usuarioPoo.txt"))) {
                System.out.println("bem vindo sr. " + p.getProperty("cargo"));
            } else {
                System.out.println("usuario e/ou senha invalida!");
            }*/
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            System.exit(0);
        }
        return null;
    }

    @Override
    public boolean confere(String usuario, String senha) {

        Properties p = new Properties();
        try {
            p.load(new FileInputStream("usuario2Poo.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Gerente.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Gerente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        String usuarioLido = p.getProperty("usuario");
        String senhaLida = p.getProperty("senha");
        return usuario.equals(usuarioLido) && senha.equals(senhaLida);
    }
}
