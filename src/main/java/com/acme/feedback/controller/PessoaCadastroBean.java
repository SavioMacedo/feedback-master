package com.acme.feedback.controller;

import com.acme.feedback.facade.PessoaFacade;
import com.acme.feedback.model.Pessoa;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PessoaCadastroBean {
    
    
    @Inject
    private PessoaFacade facade;
    private Pessoa pessoa = new Pessoa();
    
    private Long selectId;

    public Long getSelectId() {
        return selectId;
    }

    public void setSelectId(Long selectId) {
        this.pessoa = facade.find(selectId);
        this.selectId = selectId;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public String salvar(){
        if(this.selectId == null){
            facade.create(pessoa);
        }else{
            facade.edit(pessoa);
        }
        return "/pessoas/listar";
    }
}
