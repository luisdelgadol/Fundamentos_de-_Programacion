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
public class B12017_ej02_06b 
{
    public static void main(String args [])
    {
     String strUs ,strCl, strCcl; // inicio de sesion
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("Ingrese su Usuario:");
        strUs=bur.readLine();
        System.out.println("Ingrese su clave :" );
        strCl=bur.readLine();
        System.out.println("Confirme su clave :" );
        strCcl=bur.readLine();
        
         if(strCl.equalsIgnoreCase(strCcl))
        System.out.println("Bienvenido" + " "+ strUs);
         else
        System.out.println("Error :La Clave es diferente a la confirmacion");  
        
         
     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 