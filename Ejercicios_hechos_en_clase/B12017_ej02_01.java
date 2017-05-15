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
public class B12017_ej02_01 
{
    public static void main(String args [])
    {
     String strNom;
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese su nombre:");
        strNom=bur.readLine();
        System.out.println("Buenas noches :" + strNom);
     }

     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 