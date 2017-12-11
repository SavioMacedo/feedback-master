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
    private String nomeBusca;
    private Long cargoBusca;

    private List<Pessoa> pessoasBuscadas = null;
    
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

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }
    
    public Long getCargoBusca() {
        return cargoBusca;
    }

    public void setCargoBusca(Long cargoBusca) {
        this.cargoBusca = cargoBusca;
    }

    public List<Pessoa> getPessoasBuscadas() {
        return pessoasBuscadas;
    }
    
    public String buscaPorNome(){
        pessoasBuscadas = facade.findByName(nomeBusca);
        if (pessoasBuscadas != null){
            return "/pessoas/buscaPorNome";
        }
        return null;
    }
    
    public String buscaPorCargo(){
        pessoasBuscadas = facade.findByCargo(cargoBusca);
        if (pessoasBuscadas != null){
            return "/pessoas/buscaPorCargo";
        }
        return null;
    }
    
    @PostConstruct
    public void init(){
        pessoas = facade.findAll();
    }
}
