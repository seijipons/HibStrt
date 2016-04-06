/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

/**
 *
 * @author SeijiPons
 */
public class FuncHonorarios {
public double Iva(double sueldo){
    double iva=sueldo*0.16;
    System.out.println("IVA: "+iva);
    return iva;
    
}    
public double Isr(double sueldo){
    double isr=sueldo*.10;
    System.out.println("ISR: "+isr);
    return isr;
    
}

public double SNAI(double sueldo){
    double snai=sueldo+Iva(sueldo);
    System.out.println("SNAI: "+snai);
    return snai;
}
public double sueldoNeto(double sueldo){
    System.out.println("----SUELDO: "+sueldo);
    double snai=SNAI(sueldo);
    double desc=(Iva(sueldo)*2/3)+Isr(sueldo);
    double sn=snai-desc;
    
    return sn;
    
}

//    public static void main(String[] args) {
//        FuncHonorarios ob=new FuncHonorarios();
//        
//        System.out.println("Iva: "+ob.Iva(15000));
//        System.out.println("SNAI: "+ob.Isr(15000));
//        
//        System.out.println("SN: "+ob.sueldoNeto(15000));
//        
//    }
    
}
