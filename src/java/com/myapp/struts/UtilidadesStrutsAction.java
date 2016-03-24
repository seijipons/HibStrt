/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author SeijiPons
 */
public class UtilidadesStrutsAction extends org.apache.struts.action.Action {

ResultSet result=null;
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
//        Empleado em=new Empleado();
//        em.setTiemposervicio(laf.getTiempo());
//        em.setCargo(laf.getCargo());
//        em.setMonto(laf.getMonto());
//        s.save(em);
//        trx.commit();
//        
//        s.close();
        
// termina hibernate

//        lmanejador.setConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/utilidades?zeroDateTimeBehavior=convertToNull");
//        lmanejador.setExecuteUpdate("INSERT INTO `empleado`(`tiemposervicio`, `cargo`, `monto`) VALUES ("+laf.getTiempo()+",'"+laf.getCargo()+"',"+laf.getMonto()+")");
//        
                    return mapping.findForward(SUCCESS);
    }
         
}
