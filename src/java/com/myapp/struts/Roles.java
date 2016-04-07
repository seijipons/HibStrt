package com.myapp.struts;
// Generated 6/04/2016 07:23:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles  implements java.io.Serializable {


     private Integer idrol;
     private String descripcion;
     private Set usuarios = new HashSet(0);

    public Roles() {
    }

	
    public Roles(String descripcion) {
        this.descripcion = descripcion;
    }
    public Roles(String descripcion, Set usuarios) {
       this.descripcion = descripcion;
       this.usuarios = usuarios;
    }
   
    public Integer getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


