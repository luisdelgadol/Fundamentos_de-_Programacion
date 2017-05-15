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
public class B12017_ej02_08 
{
    public static void main(String args [])
    {
     String strM , strC ,strl; //Meses
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("Ingrese Numero de mes: (1=Enero ; 2=Febrero  ; 3= Marzo ; 4=Abril ; 5=Mayo 6=junio ; 7=Julio ;8=Agosto ; 9= Septiembre ; 10=Octubre ; 11=Noviembre ; 12=Diciembre)");
        strM=bur.readLine();
         System.out.println("Ingrese formato : ( C= corto ; L = largo)");
        strC=bur.readLine();
        System.out.println("Union Libre ");
        
        switch (strM)
        {
            case "1": 
               
            System.out.println(" ");
            break ;
            case "C":
            case "c":
              System.out.println("Casado ");
              break ;
            case "V":
            case "v":    
              System.out.println("Viudo ");
              break ;
            case "D": 
            case "d":    
              System.out.println("Divorciado ");
              break ;
            case "U": 
            case "u":
              System.out.println("Union Libre ");
              break ;
                    default :
                  System.out.println("ERROR : Estado civil desconocido"); 
                        
        }  
            
            
          

     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 