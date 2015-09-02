/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endemiac.autenticacao;

import br.com.endemiac.generic.GenericDAO;
import br.com.endemiac.usuario.Usuario;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author endemiac
 */
public class Autenticacao<T> extends GenericDAO {

    private Usuario usuario = new Usuario();
    private final PropertyChangeSupport BEAN = new PropertyChangeSupport(this);

    public boolean buscaUsuario() {
        Map<String, T> fields = new HashMap();
        fields.put("login", (T) this.usuario.getLogin());
        fields.put("senha", (T) this.usuario.getSenha());
        fields.put("cargo", (T) this.usuario.getCargo());
        return ((Usuario) searchObject(usuario, fields)) != null;
    }
    
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        Usuario antigoUsuario = this.usuario;
        this.usuario = usuario;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        BEAN.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        BEAN.removePropertyChangeListener(listener);
    }
}
