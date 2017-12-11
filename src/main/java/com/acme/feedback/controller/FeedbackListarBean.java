package com.acme.feedback.controller;

import com.acme.feedback.facade.FeedbackFacade;
import com.acme.feedback.model.Feedback;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author crist
 */
@Named
@RequestScoped
public class FeedbackListarBean {
    
    @Inject
    private FeedbackFacade facade;
    private Feedback feedback = new Feedback();

    public Feedback getFeedback() {
        return feedback;
    }
}