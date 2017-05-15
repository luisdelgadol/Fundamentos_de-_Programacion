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
public class B12017_ej02_09 
{
    public static void main(String args [])
    {
     String strStc; //Sexo
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese su Estado Civil: (S=soltero ; C=Casado  ; D= Divorciado ; V=Viudo ; U=Union Libre :");
        strStc=bur.readLine().toUpperCase();
        switch (strStc)
        {
            case "S": 
            System.out.println("SOltero ");
            break ;
            case "C": 
            System.out.println("Casado ");
            break ;
            case "V": 
            System.out.println("Viudo ");
            break ;
                case "D": 
            System.out.println("Divorciado ");
            break ;
                    case "U": 
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