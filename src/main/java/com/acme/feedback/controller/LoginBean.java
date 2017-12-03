/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.feedback.controller;

import com.acme.feedback.facade.UsuarioFacade;
import com.acme.feedback.model.Usuario;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean {
    
    @Inject
    private UsuarioFacade facade;
    
    private String login;
    
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String entrar(){
        
        Optional<Usuario> usuario = facade.findByCredenciais(login, senha);
        if (usuario.isPresent()){
            return "principal";
        } 
        FacesMessage msg = new FacesMessage(
        FacesMessage.SEVERITY_ERROR, "Falha de Autenticação", "Usuário ou senha inválidos.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return null;
    }    
}
