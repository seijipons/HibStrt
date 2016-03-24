/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.math.BigDecimal;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Ivan
 */
public class AdminStrutsActionForm extends org.apache.struts.action.ActionForm {

    public Integer getIdEmple() {
        return idEmple;
    }

    public void setIdEmple(Integer idEmple) {
        this.idEmple = idEmple;
    }

    public Formapagos getFormapagos() {
        return formapagos;
    }

    public void setFormapagos(Formapagos formapagos) {
        this.formapagos = formapagos;
    }

    public Tiempopagos getTiempopagos() {
        return tiempopagos;
    }

    public void setTiempopagos(Tiempopagos tiempopagos) {
        this.tiempopagos = tiempopagos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
    
    
     Integer idEmple;
     Formapagos formapagos;
     Tiempopagos tiempopagos;
     Usuario usuario;
     String nombre;
     String apaterno;
     String amaterno;
     String fechaNaci;
     String direccion;
     String telefono;
     String fechaContratacion;
      BigDecimal sueldo;
     
    public AdminStrutsActionForm() {
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
        if (getNombre()== null) {
            errors.add("nombre", new ActionMessage("error.nombre.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
