package com.acme.feedback.controller;

import com.acme.feedback.facade.CargoFacade;
import com.acme.feedback.model.Cargo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author crist
 */
@Named
@RequestScoped
public class CargoListarBean {
    
    @Inject        
    private CargoFacade facade;
    private List<Cargo> cargos;

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
    
    @PostConstruct
    public void init(){
        cargos = facade.findAll();
    }
}