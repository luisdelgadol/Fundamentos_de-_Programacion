/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author alum_tes_a
 */
public class B12017_ej02_28 
{
    public static void main(String args [])
    {
     String strNum;
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        do{
           System.out.println("ingrese un numero:");
        strNum=bur.readLine();  
        }while (!isNumero (strNum));
       
        System.out.println("Felicidades :Su numero fue aceptado");
     }

     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
    
    private static boolean isNumero (String strNum)
    {
    boolean blnRes=true;
    try
    {
     Double.parseDouble(strNum);   
    }
    catch (Exception e)
    {
      blnRes=false;   
    }
    return blnRes;
    }
} 