/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.feedback.facade;

import com.acme.feedback.model.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author welington
 */
@Stateless
public class PessoaFacade extends AbstractFacade<Pessoa> {

    @PersistenceContext(unitName = "feedback_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PessoaFacade() {
        super(Pessoa.class);
    }

    public List<Pessoa> findByName(String string) {
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscaPorNome", Pessoa.class);
        query.setParameter("nome", "%" + string + "%");
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

   /* public List<Pessoa> findByCargo(String string) {
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscaPorCargo", Pessoa.class);
        query.setParameter("cargo", string);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }*/

    public List<Pessoa> findByCargo(Long id) {
        TypedQuery<Pessoa> q = em.createQuery("SELECT p FROM Pessoa p WHERE p.cargo.id = :Long", Pessoa.class);
        q.setParameter("Long", id);
        try {
            return q.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
}
