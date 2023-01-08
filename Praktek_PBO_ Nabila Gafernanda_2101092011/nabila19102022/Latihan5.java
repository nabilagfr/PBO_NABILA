/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila19102022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LABMM07
 */
public class Latihan5 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        double rata = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        
        try{
        System.out.print("Nilai pertama : ");
        a1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Nilai kedua   : ");
        a2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Nilai ketiga   : ");
        a3 = Integer.parseInt(dataIn.readLine());
       
        }catch( IOException e ){
        System.out.println("Error!");
        }
        
        rata = (a1 + a2 + a3)/ 3 ;
        System.out.println( "Rata = " +rata); 
        
        if (rata >= 60){
            System.out.println("Anda Berhasil!\n");
        }
        else{
            System.out.println("Maaf, Anda Gagal!\n");
        }

    }
}
