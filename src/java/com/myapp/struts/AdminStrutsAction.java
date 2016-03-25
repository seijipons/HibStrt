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
 *
 * @author Ivan
 */
public class AdminStrutsAction extends org.apache.struts.action.Action {

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
        s.save(us);
        //
        em.setUsuario(us); //Se asigna usuario
        
        /*em.setTiempopagos(tiempopagos);
        em.setFormapagos(formapagos);
        em.setUsuario(usuario);
        */
        
        String hql="From formapagos p Where idFormaPago="+laf.getFormapagos();
        Query query = s.createQuery(hql);
        List <Formapagos> emps=query.list();
        
        for(Formapagos p:emps){
            
        }
      /*
        
        List<Persona> emps=query.list();
        for(Persona p:emps){
            System.out.println(p.getNombre());
            System.out.println(p.getFechanacimiento());
            System.out.println(p.getDireccion().getColonia());
            System.out.println(p.getDireccion().getColonia());
            System.out.println(p.getDireccion().getCodigopostal());
        }
        
        */
//        em.setTiemposervicio(laf.getTiempo());
//        em.setCargo(laf.getCargo());
//        em.setMonto(laf.getMonto());
        s.save(em);
        trx.commit();
        
        s.close();
        return mapping.findForward(SUCCESS);
    }
}
