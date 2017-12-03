/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.feedback.facade;

import com.acme.feedback.model.Usuario;
import com.acme.feedback.util.Hash;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author welington
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "feedback_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Optional<Usuario> findByCredenciais(String login, String senha){
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.buscaPorCredenciais", Usuario.class);
        query.setParameter("login", login);
        query.setParameter("senha", Hash.md5(senha));
        try {
            return Optional.of(query.getSingleResult());
        } catch (NonUniqueResultException | NoResultException e) {
            return Optional.empty();
        }
    }
    
}
