package com.myapp.struts;
// Generated 6/04/2016 07:23:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUser;
     private Roles roles;
     private String usuario;
     private String pass;
     private Set empleadoses = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Roles roles) {
        this.roles = roles;
    }
    public Usuario(Roles roles, String usuario, String pass, Set empleadoses) {
       this.roles = roles;
       this.usuario = usuario;
       this.pass = pass;
       this.empleadoses = empleadoses;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Set getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set empleadoses) {
        this.empleadoses = empleadoses;
    }




}


