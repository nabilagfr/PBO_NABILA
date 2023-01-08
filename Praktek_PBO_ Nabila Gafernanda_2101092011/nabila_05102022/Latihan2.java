/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila_05102022;

/**
 *
 * @author LABMM07
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
     public static void main( String[] args ){

        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
        int a1 = 0;
        int a2 = 0;
        int jumlah = 0;
        
        try{
        System.out.print("Angka pertama : ");
        a1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Angka kedua   : ");
        a2 = Integer.parseInt(dataIn.readLine());
       
        
        }catch( IOException e ){
        System.out.println("Error!");
        }
        
        jumlah = a1 + a2;
        System.out.println(a1 + " + " + a2 + " = " +jumlah);
        } 
}
