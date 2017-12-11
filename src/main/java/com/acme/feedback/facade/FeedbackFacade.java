package com.acme.feedback.facade;

import com.acme.feedback.model.Feedback;
import com.acme.feedback.model.Pessoa;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author crist
 */
@Stateless
public class FeedbackFacade extends AbstractFacade<Feedback> 
{

    @PersistenceContext(unitName = "feedback_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() 
    {
        return em;
    }

    public FeedbackFacade() 
    {
        super(Feedback.class);
    }
    
//    public Long totalAvaliacoes(Long idPessoa)
//    {
//        TypedQuery<Feedback> query = em.createNamedQuery("Feedback.todosPessoa", Feedback.class);
//        query.setParameter("idPessoa", idPessoa);
//        try 
//        {
//            return query.getResultList();
//        } 
//        catch (NoResultException e) 
//        {
//            return null;
//        }
//    }
    
    public List<Feedback> findByPessoaID(Long idPessoa)
    {
        TypedQuery<Feedback> query = em.createNamedQuery("Feedback.todosPessoa", Feedback.class);
        query.setParameter("idPessoa", idPessoa);
        try 
        {
            return query.getResultList();
        } 
        catch (NoResultException e) 
        {
            return null;
        }
    }
}

