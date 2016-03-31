/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author SeijiPons
 */
public class FuncNominas {
  
    public double salarioDiario(double salario, String tiempo){
       
        double salarioDiario = 0;
        int dias=0;
        if(tiempo.compareToIgnoreCase("Quincenal")==0){
            dias=15;
        }else if(tiempo.compareToIgnoreCase("Semanal")==0){
            dias=7;
        }else if(tiempo.compareToIgnoreCase("mensual")==0){
            dias=30;
        }
        salarioDiario=salario/dias;
        
        
        return salarioDiario;
    }
    
    public int diasVacaciones(String fecha) {
        int days = 0, years,vacaciones=0;
        DateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        
        //SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        
        //String inputString2 = "1993/12/07";
        String inputString2 = fecha;

        try {
            Date date1 = myFormat.parse(inputString2);
            Date date2 = date;
            long diff = date2.getTime() - date1.getTime();
            

            days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            years=days/365;
            if(years<=1){
                vacaciones=6;
            }else if(years>1&&years<=2){
                vacaciones=8;
            }else if(years>2&&years<=3){
                vacaciones=10;
            }else if(years>3&&years<=4){
                vacaciones=12;
            }else if(years>5&&years<=9){
                vacaciones=14;
            }else if(years>9&&years<=14){
                vacaciones=16;
            }else if(years>14&&years<=19){
                vacaciones=18;
            }else if(years>20){
                vacaciones=20;
            }
        
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return vacaciones;
    }

    public double primaVacacional(double salarioDiario, int diasvacaciones){
        double pv=salarioDiario*diasvacaciones*0.25;
        return pv;
    }
    public double aguinaldo(double salDiario){
        
        double aguinaldo=salDiario*15;
        return aguinaldo;
    }

    // Main para hacer pruebas
//    
//    public static void main(String[] args) {
//        FuncNominas ob = new FuncNominas();
//        
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
//        
//        System.out.println ("Days: " + ob.diasVacaciones("1993/12/07"));
//
//        // TODO code application logic here
//    }
}
