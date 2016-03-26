/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

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
 *asdasd 
 * @author Ivan
 */
public class AdminStrutsAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESSADMIN = "Successadm";

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
        AdminStrutsActionForm laf=(AdminStrutsActionForm) form; // instaciar de un BEAN
        
        Usuario us=new Usuario();
        Empleados em=new Empleados();
        
        em.setAmaterno(laf.getAmaterno());
        em.setApaterno(laf.getApaterno());
        em.setDireccion(laf.getDireccion());
        em.setFechaContratacion(laf.getFechaContratacion());
        em.setFechaNaci(laf.getFechaNaci());
        em.setNombre(laf.getNombre());
        em.setSueldo(laf.getSueldo());
        em.setTelefono(laf.getTelefono());
        
        
        //Se crea Usuario y contraseña por automatico
        String nombreUsuario = laf.getNombreUsuario(em.getNombre(), em.getApaterno());
        String pass = laf.randomString(8);
        us.setPass(pass);
        us.setUsuario(nombreUsuario);
        
        String hql="From Roles p Where idrol="+laf.getRol();
        Query query=s.createQuery(hql);
        List <Roles> rol=query.list();
        Roles roles=null;
        for(Roles r:rol){
            roles=r;
        }
        us.setRoles(roles);
               
        s.save(us);
        
        em.setUsuario(us); //Se asigna usuario
               
        hql="From Formapagos p Where idFormaPago="+laf.getFormapagos();
        query = s.createQuery(hql);
        List <Formapagos> emps=query.list();
        Formapagos forma=null;
        for(Formapagos p:emps){
            forma=p;
        }
        em.setFormapagos(forma);
        
        hql="From Tiempopagos p Where idTiempoPago="+laf.getTiempopagos();
        query = s.createQuery(hql);
        List <Tiempopagos> tmp=query.list();
        Tiempopagos tiempo=null;
        for(Tiempopagos q:tmp){
            tiempo=q;
        }
        em.setTiempopagos(tiempo);
        
      
        s.save(em);
        trx.commit();
        
        s.close();
        return mapping.findForward(SUCCESSADMIN);
    }
}
