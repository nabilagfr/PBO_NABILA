/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author User
 */
public class Latihan3 {
    public static void main(String [] args){
        int number1 = 10;
        int number2 = 23;
        int number3 = 55;
        int max;
        
        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);      
        System.out.println("Number 3 = " + number3);
        max = (number2 >= number1)? number2: number1;
        max = (number3 >= max)? number3: max;
        System.out.println("Nilai Tertingginya adalah angka = " + max);
    } 
}
