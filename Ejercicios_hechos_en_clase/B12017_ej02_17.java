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
public class B12017_ej02_17 
{
    public static void main(String args [])
    {
     String strCad ; //dia de la semana en numero
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese una cadena:");
        strCad=bur.readLine();
        System.out.println("espacios en Blanco :" + getNumeroTotalEspaciosBlanco(strCad));
     }

     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
    private static int getNumeroTotalEspaciosBlanco(String strCad)
    {
    int intRes=0;//Respuesta
    char chrCar;//caracter
    for(int i=0; i<strCad.length(); i++)
    {
      chrCar=strCad.charAt(i);
      if(chrCar==' ')
      intRes++;
    }
      return intRes;}
}
    
    

    