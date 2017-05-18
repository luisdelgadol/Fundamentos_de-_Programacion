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
public class B12017_ej02_10a 
{
    public static void main(String args [])
    {
     String strMes , strcl ,strRes;
     try
     {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader bur=new BufferedReader(isr);
        int Mes;
        System.out.println("ingrese numero de mes: (1=Enero ; 2=Febrero  ; 3= Marzo ; 4=Abril ; 5=Mayo 6=junio ; 7=Julio ;8=Agosto ; 9= Septiembre ; 10=Octubre ; 11=Noviembre ; 12=Diciembre :");
        strMes=bur.readLine().toUpperCase();
        Mes = Integer.parseInt(strMes);
        if( Mes <0 || Mes >12)
        System.out.println("Numero de mes no existe");
        else System.out.println("Ingrese formato C=corto , L=largo");
        strcl=bur.readLine().toUpperCase();
        switch (strcl)
        {
             case "C":
             
                      
            strRes="Ene";
            break ;
            case "2": 
            strRes="feb";
            break ;
            case "3": 
            strRes="Marzo";
            break ;
            case "4": 
            strRes="Abril";
            break ;
            case "5": 
            strRes="Mayo";
            break ;
            case "6": 
            strRes="Junio";
            break ;
            case "7": 
            strRes="Julio";
            break ;
            case "8": 
            strRes="Agosto";
            break ;
                case "9": 
            strRes="Septiembre";
            break ;
                    case "10": 
            strRes="Octubre";
            break ;
                        case "11": 
            strRes="noviembre";
            break ;
                            case "12": 
            strRes="Diciembre";
            break ;
                
                    default :
                  strRes=("ERROR : Mes no existe");      
        }  
            
           System.out.println(strRes); 
          

     }
 
     catch (IOException e)
     {
    System.out.println("Excepcion" + e.toString());
     }
    }
} 