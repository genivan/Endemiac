/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endemiac.usuario;

import br.com.endemiac.autenticacao.Autenticacao;
import br.com.endemiac.generic.GenericDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tulioqrxkyde
 */
@ManagedBean(name = "usuarioBean")
public class UsuarioBean {

    Usuario usuario;
    GenericDAO genericDAO;
    Autenticacao autenticacao;
    UsuarioBean usuarioBean;

    public UsuarioBean() {
        usuario = new Usuario();
        genericDAO = new GenericDAO();
        autenticacao = new Autenticacao();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void autenticacao() {
        autenticacao.setUsuario(usuario);
        System.out.println(((autenticacao.buscaUsuario()) ? "Sucesso " : " Falha")); 
    }

}
