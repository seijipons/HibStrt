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

    private String cargo;
    private int monto,tiempo;
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getMonto() {
        if(cargo.equals("Administrador")){
            if(tiempo>=1&&tiempo<3){
                 monto=2000;
            }else if(tiempo<6&&tiempo>=3){
                monto=2500;
            }else if(tiempo>6&&tiempo<=8){
                monto=3000;
            }else if(tiempo>8){
                monto=4000;
            }
            else{
            monto=0;
            }
        }else if(cargo.equals("Contador")){
            if(tiempo==1||tiempo<3){
                 monto=1500;
            }else if(tiempo<6&&tiempo>=3){
                monto=2000;
            }else if(tiempo>6&&tiempo<=8){
                monto=2500;
            }else if(tiempo>8){
                monto=3500;
            }
            else{
            monto=0;
            }
        }else if(cargo.equals("Empleado")){
            if(tiempo==1||tiempo<3){
                 monto=1000;
            }else if(tiempo<6&&tiempo>=3){
                monto=1500;
            }else if(tiempo>6&&tiempo<=8){
                monto=2000;
            }else if(tiempo>8){
                monto=2500;
            }
            else{
            monto=0;
            }
        }
        return monto;
    }


    public void setMonto(int monto) {
        this.monto = monto;
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
        if (getTiempo()<0) {
            errors.add("name", new ActionMessage("error.tiempoerror.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
