package com.acme.feedback.facade;

import com.acme.feedback.model.Feedback;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author crist
 */
@Stateless
public class FeedbackFacade extends AbstractFacade<Feedback> {

    @PersistenceContext(unitName = "feedback_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FeedbackFacade() {
        super(Feedback.class);
    }
}

