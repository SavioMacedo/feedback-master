package com.acme.feedback.controller;

import com.acme.feedback.facade.PessoaFacade;
import com.acme.feedback.model.Pessoa;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alunoces
 */
@Named
@RequestScoped
public class PessoaListarBean {
    
    @Inject
    private PessoaFacade facade;
    private List<Pessoa> pessoas;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public String excluir(Pessoa pessoa){
        facade.remove(pessoa);
        return "/pessoas/listar?faces-redirect=true";
    }
    
    @PostConstruct
    public void init(){
        pessoas = facade.findAll();
    }
}
