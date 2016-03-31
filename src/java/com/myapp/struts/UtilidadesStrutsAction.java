/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.sql.ResultSet;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SeijiPons
 */
public class UtilidadesStrutsAction extends org.apache.struts.action.Action {

    
    /* forward name="success" path="" */
    ResultSet resultado = null;
    private static final String ADMINISTRADOR = "Administrador";
    String FWD="success";
    
    
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        
        
        Session s;
        s=NewHibernateUtil.getSessionFactory().openSession();
        Transaction trx=s.beginTransaction();      
        UtilidadesStrutsActionForm laf=(UtilidadesStrutsActionForm) form; // instaciar de un BEA
        
        String hql = "FROM Usuario WHERE usuario LIKE '"+laf.getUsuario()+"' and pass LIKE '"+laf.getPassword()+"'";
        Query query = s.createQuery(hql);
        List<Usuario> usuario = query.list();
        
        Usuario us=new Usuario();
        for(Usuario e:usuario){
            System.out.println(e.getUsuario()+"_"+e.getPass()+" "+e.getRoles().getIdrol());
            System.out.println("Entró a For");
            us=e;
            
        }
        
            if (null != us.getRoles().getIdrol()) {
            switch (us.getRoles().getIdrol()) {
                case 1:
                    FWD = ADMINISTRADOR;
                    break;
                case 2:
                    FWD = "success";
                    break;
                default:
                    FWD = "failure";
                    break;
            }
        }
       

        return mapping.findForward(FWD); 
    }
         
}
