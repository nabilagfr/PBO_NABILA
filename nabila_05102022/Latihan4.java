/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila_05102022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LABMM07
 */
public class Latihan4 {
     public static void main( String[] args ){

        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        try{
        System.out.print("Word1 : ");
        word1 = dataIn.readLine();
        System.out.print("Word2 : ");
        word2 = dataIn.readLine();
        System.out.print("Word3 : ");
        word3 = dataIn.readLine();
        
        }catch( IOException e ){
        System.out.println("Error!");
        }
        
        System.out.print("" + word1);
        System.out.print(" " + word2);
        System.out.println(" " + word3);
        
    } 
}
