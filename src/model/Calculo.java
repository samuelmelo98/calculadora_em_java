/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Questao05.view.Cal;

/**
 *
 * @author Samuel Melo
 */
public class Calculo {
    
    public static  double a=0,b=0;
    public static String c,d,vainatela,operacao,res="";
    
    public static double somar(double a, double b){
       res=Double.toString(a+b);
       
       return (a)+(b);
    }
    
     public static double subtrair(double a, double b){
        res=Double.toString(a-b);
        return (a)-(b);
    }
     
      public static double dividir(double a, double b){
         res=Double.toString(a/b);
         if(b==0){
             res="Impossivel dividir por 0!";
         }
        return (a)/(b);
        
    }
      
       public static double multiplicar(double a, double b){
         res=Double.toString(a*b);
        return (a*b);
    }
  public static void main(String args[]){
      
      Cal c=new Cal();
      c.setVisible(true);
      
  }
  
   
    
}
