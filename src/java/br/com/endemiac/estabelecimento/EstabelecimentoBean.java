/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.endemiac.estabelecimento;

import br.com.endemiac.generic.GenericDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author asus1
 */
@ManagedBean
public class EstabelecimentoBean {

    private Estabelecimento estabelecimento = new Estabelecimento();
    private GenericDAO genericDAO = new GenericDAO();

    public EstabelecimentoBean() {
        genericDAO.save(estabelecimento);
    }

    public void salvar() {

    }

    /**
     * @return the estabelecimento
     */
    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * @param estabelecimento the estabelecimento to set
     */
    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

}
