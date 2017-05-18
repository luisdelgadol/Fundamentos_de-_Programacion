/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
/**
 *
 * @author alum_tes_a
 */
public class B12017_ej02_19 
{
    public static void main(String args [])
    {
     String strCad ; //dia de la semana en numero
     int intNumTotVoc , intNumTotOtr;//total de vocales y total de otros caracteres
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese una cadena:");
        strCad=bur.readLine().toLowerCase();
        intNumTotVoc=getNumeroTotalVocales(strCad);
        intNumTotOtr=strCad.length()-intNumTotVoc;
        System.out.println("Vocales :" +intNumTotVoc );
        System.out.println(" No Vocales :" +intNumTotOtr );
     }

     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
    private static int getNumeroTotalVocales(String strCad)
    {
    int intRes=0;//Respuesta
    char chrCar;//caracter
    for(int i=0; i<strCad.length(); i++)
    {
      chrCar=strCad.charAt(i);
      if("aeiou".indexOf(String.valueOf(chrCar))!=-1)
      intRes++;
    }
      return intRes;}
}
    
    

    