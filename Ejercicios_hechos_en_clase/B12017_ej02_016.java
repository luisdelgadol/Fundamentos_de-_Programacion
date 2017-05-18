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
public class B12017_ej02_016 
{
    public static void main(String args [])
    {
     int intDiaSemNum ; //dia de la semana en numero
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        System.out.println("ingrese un numero entre 1 y 7:");
        intDiaSemNum=Integer.parseInt(bur.readLine());
        System.out.println("Dia de la semana :" + getNombreDiaSemana(intDiaSemNum));
     }

     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
    private static String getNombreDiaSemana(int intDiaSem)
    {
    String strRes="";//Respuesta
    
    switch (intDiaSem)
    {
        case 1:
            strRes="lunes";
            break;
            case 2:
            strRes="martes";
            break;
                case 3:
            strRes="Miercoles";
            break;
                    case 4:
            strRes="jueves";
            break;
                        case 5:
            strRes="viernes";
            break;
                            case 6:
            strRes="sabado";
            break;
                                case 7:
            strRes="domingo";
            break;
            default:
              strRes=("Error dia de la semana desconocido");  }                    
            return strRes; 
} 
}