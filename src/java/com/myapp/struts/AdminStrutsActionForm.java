/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.math.BigDecimal;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Ivan
 */
public class AdminStrutsActionForm extends org.apache.struts.action.ActionForm {

    Integer idEmple;
    String formapagos;/*ya*/
    String tiempopagos;/*ya*/
    String usuario;/*ya*/
    String nombre;/*ya*/
    String apaterno;/*ya*/
    String amaterno;/*ya*/
    String fechaNaci;/*ya*/
    String direccion;/*ya*/
    String telefono;/*ya*/
    String fechaContratacion;/*ya*/
    Double sueldo;/*ya*/
    Integer rol;
    
    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
    
    public String getFormapagos() {
        return formapagos;
    }

    public void setFormapagos(String formapagos) {
        this.formapagos = formapagos;
    }

    public String getTiempopagos() {
        return tiempopagos;
    }

    public void setTiempopagos(String tiempopagos) {
        this.tiempopagos = tiempopagos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public Integer getIdEmple() {
        return idEmple;
    }

    public void setIdEmple(Integer idEmple) {
        this.idEmple = idEmple;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
     
    public AdminStrutsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //Generar acceso
    
    String getNombreUsuario(String nombre, String apePat) {

        System.out.println(nombre + " " + apePat);
        String aRemplazar = nombre;
        String remplazado = aRemplazar.replace(" ", "");
        remplazado = remplazado.replace("á", "a");
        remplazado = remplazado.replace("é", "e");
        remplazado = remplazado.replace("í", "i");
        remplazado = remplazado.replace("ó", "o");
        remplazado = remplazado.replace("ú", "u");

        String aRemplazar2 = apePat;
        String remplazado2 = aRemplazar2.replace(" ", "");

        remplazado2 = remplazado2.replace("á", "a");
        remplazado2 = remplazado2.replace("é", "e");
        remplazado2 = remplazado2.replace("í", "i");
        remplazado2 = remplazado2.replace("ó", "o");
        remplazado2 = remplazado2.replace("ú", "u");
        if (remplazado.length() < 3) {
            int num = 3 - remplazado.length();
            remplazado = remplazado + randomString(num);
        }
        if (remplazado2.length() < 4) {
            int num2 = 4 - remplazado2.length();
            remplazado2 = remplazado2 + randomString(num2);
        }

        String nombreUsuario, apellido = remplazado2;

        int i = 0;

        nombreUsuario = "" + remplazado.charAt(0) + remplazado.charAt(1) + remplazado.charAt(2) + apellido.charAt(0) + apellido.charAt(1) + apellido.charAt(2) + apellido.charAt(3);

        return nombreUsuario;

    }

    //Random String
     static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static Random rnd = new Random();

    String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
    
    // end random string
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
        if (getNombre()== null) {
            errors.add("apaterno", new ActionMessage("error.apaterno.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("amaterno", new ActionMessage("error.amaterno.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("fechaNaci", new ActionMessage("error.fechaNaci.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("direccion", new ActionMessage("error.direccion.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("telefono", new ActionMessage("error.telefono.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("fechaContratacion", new ActionMessage("error.fechaContratacion.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("tiempopagos", new ActionMessage("error.tiempopagos.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("formapagos", new ActionMessage("error.formapagos.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("sueldo", new ActionMessage("error.sueldo.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNombre()== null) {
            errors.add("usuario", new ActionMessage("error.usuario.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
