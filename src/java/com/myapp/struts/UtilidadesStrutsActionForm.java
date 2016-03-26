/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author SeijiPons
 */
public class UtilidadesStrutsActionForm extends org.apache.struts.action.ActionForm {

     String usuario,password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    
    /**
     * @return
     */
    public UtilidadesStrutsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsuario()== null) {
            errors.add("usuario", new ActionMessage("error.usuarioerror.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getPassword()== null) { 
            errors.add("password", new ActionMessage("error.passworderror.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
