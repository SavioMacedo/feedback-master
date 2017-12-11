package com.acme.feedback.controller;

import com.acme.feedback.facade.FeedbackFacade;
import com.acme.feedback.facade.PessoaFacade;
import com.acme.feedback.model.Feedback;
import com.acme.feedback.model.Pessoa;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alunoces
 */
@Named("Feedback")
@RequestScoped
public class FeedbackBean 
{
    
    @Inject
    private FeedbackFacade facade;
    @Inject
    private PessoaFacade pessoaFacade;
    private List<Feedback> feedbacks;
    private String nomeBusca;
    private List<Feedback> feedbackBuscadas = null;
    private Feedback feedback = new Feedback();
    private Long selectIdPessoa;
    private int tipoFeedback;
    
    private Pessoa pessoa = new Pessoa();

    public Long getSelectIdPessoa() 
    {
        return selectIdPessoa;
    }

    public void setSelectIdPessoa(Long selectId) 
    {
        this.pessoa = pessoaFacade.find(selectId);
        this.feedback.setPessoa(pessoa);
        this.feedbackBuscadas = facade.findByPessoaID(selectId);
        this.selectIdPessoa = selectId;
    }
    
    public String Salvar()
    {     
        feedback.setDataPublicacao(new Date());
        if (tipoFeedback == 1)
        {
            feedback.setPositivo(1);
            feedback.setNegativo(0);
        }
        else
        {
            feedback.setNegativo(1);
            feedback.setPositivo(0);
        }
        
        facade.create(feedback);
        
        return "/feedback/cadastroFeedback?faces-redirect=true&idPessoa="+pessoa.getId();
    }
    
    public List<Feedback> getFeedbacks() 
    {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedback) 
    {
        this.feedbacks = feedback;
    }
    
    public String excluir(Feedback feedback)
    {
        facade.remove(feedback);
        return "/pessoas/listar?faces-redirect=true";
    }

    public String getNomeBusca() 
    {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) 
    {
        this.nomeBusca = nomeBusca;
    }

    public List<Feedback> getFeedbacksBuscados() 
    {
        return feedbackBuscadas;
    }
    
    @PostConstruct
    public void init()
    {
        feedbacks = facade.findAll();
    }

    /**
     * @return the feedback
     */
    public Feedback getFeedback() 
    {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(Feedback feedback) 
    {
        feedback.setPessoa(pessoa);
        this.feedback = feedback;
    }

    /**
     * @return the tipoFeedback
     */
    public int getTipoFeedback() {
        return tipoFeedback;
    }

    /**
     * @param tipoFeedback the tipoFeedback to set
     */
    public void setTipoFeedback(int tipoFeedback) {
        this.tipoFeedback = tipoFeedback;
    }
}
