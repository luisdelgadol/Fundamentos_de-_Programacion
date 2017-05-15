/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author alum_tes_a
 */
public class B12017_ej02_06a 
{
    public static void main(String args [])
    {
     String strStc; //Sexo
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese su estado civil: (S=Soltero ; C=Casado ; D=Divorciado ; V=Viudo ; U=Union libre :");
        strStc=bur.readLine();
         if(strStc.equalsIgnoreCase("S"))
        System.out.println("Soltero");
        
         else if (strStc.equalsIgnoreCase("C"))
            
        System.out.println("Casado");




         else if(strStc.equalsIgnoreCase("D"))
        System.out.println("Divorciado");
         else if(strStc.equalsIgnoreCase("V"))
            
        System.out.println("Viudo");
            
 
         else if(strStc.equalsIgnoreCase("U"))
        System.out.println("Union libre");
       
       
        else
        System.out.println("Error Estado civil desconocido");    

     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 