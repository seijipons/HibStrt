/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        
        Session s;
        s=NewHibernateUtil.getSessionFactory().openSession();
        Transaction trx=s.beginTransaction();      
                
        String hql = "FROM Usuario WHERE usuario LIKE '"+getUsuario()+"' and pass LIKE '"+getPassword()+"'";
        Query query = s.createQuery(hql);
        List<Usuario> usuario = query.list();
        int cont=0;
        Usuario us=new Usuario();
        for(Usuario e:usuario){
            
            us=e;
            cont++;
        }
        
//        if (cont == 0) {
//            //errors.add(ActionErrors.GLOBAL_MESSAGE, new ActionError("error.bad.input",)); 
//            errors.add("usuario", new ActionMessage("error.loginerror.required"));
//
//        }
        if (getUsuario()== null) {
            errors.add("usuario", new ActionMessage("error.usuarioerror.required"));
            
            //activa el microfono papu
            // TODO: add 'error.name.required' key to your resources 
        }
        if (getPassword()== null) { 
            errors.add("password", new ActionMessage("error.passworderror.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
