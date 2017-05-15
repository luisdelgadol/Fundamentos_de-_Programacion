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
public class B12017_ej02_03 
{
    public static void main(String args [])
    {
     String strSex; //Sexo
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese su sexo: (M=Masculino ; F=Femenino");
        strSex=bur.readLine();
        if(strSex.equals("M")|| strSex.equals("m"))
        System.out.println("Buenas noches caballero");
        else
            
        System.out.println("Buenas noches señorita");
     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 