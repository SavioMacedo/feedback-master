package com.acme.feedback.controller;

import com.acme.feedback.facade.PessoaFacade;
import com.acme.feedback.model.Pessoa;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alunoces
 */
@Named
@RequestScoped
public class PessoaListarBean 
{
    
    @Inject
    private PessoaFacade facade;
    private List<Pessoa> pessoas;
    private String nomeBusca;
    private List<Pessoa> pessoasBuscadas = null;
    
    public List<Pessoa> getPessoas() 
    {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) 
    {
        this.pessoas = pessoas;
    }
    
    public String excluir(Pessoa pessoa)
    {
        facade.remove(pessoa);
        return "/pessoas/listar?faces-redirect=true";
    }

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }

    public List<Pessoa> getPessoasBuscadas() {
        return pessoasBuscadas;
    }
    
    public String buscaPorNome()
    {
        pessoasBuscadas = facade.findByName(nomeBusca);
        if (pessoasBuscadas != null){
            return "/pessoas/buscaPorNome";
        }
        return null;
    }
    
    @PostConstruct
    public void init()
    {
        pessoas = facade.findAll();
    }
}
