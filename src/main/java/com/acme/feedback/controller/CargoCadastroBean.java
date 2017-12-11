package com.acme.feedback.controller;

import com.acme.feedback.facade.CargoFacade;
import com.acme.feedback.model.Cargo;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author crist
 */
@Named
@RequestScoped
public class CargoCadastroBean {
    
    @Inject
    private CargoFacade facade;
    
    private Cargo cargo = new Cargo();
    
    private Long selectId;

    public Long getSelectId() {
        return selectId;
    }

    public void setSelectId(Long selectId) {
        this.cargo = facade.find(selectId);
        this.selectId = selectId;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo pessoa) {
        this.cargo = pessoa;
    }
    
    public String salvar(){
        if(this.selectId == null){
            facade.create(cargo);
        }else{
            facade.edit(cargo);
        }
        return "/cargo/listarCargo";
    }
}
