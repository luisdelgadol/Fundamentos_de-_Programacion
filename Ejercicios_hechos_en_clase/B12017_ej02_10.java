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
public class B12017_ej02_10 
{
    public static void main(String args [])
    {
     String strStc ,strRes;
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese su Estado Civil: (S=soltero ; C=Casado  ; D= Divorciado ; V=Viudo ; U=Union Libre :");
        strStc=bur.readLine().toUpperCase();
        switch (strStc)
        {
            case "S": 
            strRes="Soltero";
            break ;
            case "C": 
            strRes="Casado";
            break ;
            case "V": 
            strRes="Viudo";
            break ;
                case "D": 
            strRes="Divorciado";
            break ;
                    case "U": 
            strRes="Union libre";
            break ;
                    default :
                  strRes=("ERROR : Estado civil desconocido");      
        }  
            
           System.out.println(strRes); 
          

     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 