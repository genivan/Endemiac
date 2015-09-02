package br.com.endemiac.generic;

import br.com.endemiac.connection.ManagerConnection;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.hibernate.criterion.Restrictions;

/**
 * 
 * @author endemiac
 * @param <T> 
 */
public class GenericDAO<T> extends ManagerConnection {

    /**
     * Descrição: Salva um objeto de tipo genérico.
     *
     * @param object
     */
    public void save(T object) {
        getSession().save(object);
        getTransaction().commit();
        closeConnection();
        
    }

    /**
     * Descrição: Atualiza um objeto de tipo genérico.
     *
     * @param object
     */
    public void update(T object) {
        getSession().update(object);
        getTransaction().commit();
        closeConnection();
    }

    /**
     * Descrição: Deleta um objeto de tipo genérico.
     *
     * @param object a ser deletado
     */
    public void delete(T object) {
        getSession().delete(object);
        getTransaction().commit();
        closeConnection();
    }

    /**
     * Descrição: Retorna um objeto de tipo Genérico<(T)>.
     *
     * @param object tipo de classe
     * @param value valor
     * @return
     */
    public T get(T object, Object value) {
        T objectT = ((T) getSession().get(object.getClass(), (Serializable) value));
        closeConnection();
        return object;
    }
    
   /**
    * Descrição: Localiza um objeto de tipo Genérico<(T)> que contenha possua os values respectivos aos valores de parâmetro.
    * 
    * @param object
    * @param params
    * @return 
    */
    public T searchObject(T object, Map<String,T> params) {
        T finded = (T) getSession().createCriteria(object.getClass()).add(Restrictions.allEq(params)).uniqueResult();
        closeConnection();
        return finded;
    }

    /**
     * Descrição: Procura por objetos do tipo Genérico<(T)> e os retorna em
     * forma de uma lista genérica.
     *
     * @param object tipo de classe
     * @return
     */
    public List<T> list(T object) {
        List<T> objects = (List<T>) getSession().createCriteria(object.getClass()).list();
        closeConnection();
        return objects;
    }
    
    /**
     * Descrição: Procura por objetos do tipo Genérico<(T)> que tenham o param 
     * iniciados com o valor de value e os retorna em forma de uma lista genérica.
     * 
     * @param object
     * @param param
     * @param value
     * @return 
     */
    public List<T> startWith(T object, String param, Object value) {
        List<T> objects = (List<T>) getSession().createCriteria(object.getClass())
                .add(Restrictions.ilike(param, value.toString())).list();
        closeConnection();
        return objects;
    }
}