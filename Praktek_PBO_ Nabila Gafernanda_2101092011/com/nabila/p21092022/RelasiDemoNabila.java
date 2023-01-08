/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabila.p21092022;

/**
 *
 * @author LABMM07
 */
public class RelasiDemoNabila {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Variable values...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
        
        //Lebih besar dari
        System.out.println("Gather than...");
        System.out.println(" i > j = " + (i > j)); //false
        System.out.println(" j > i = " + (j > i)); //true
        System.out.println(" k > j = " + (k > j)); //true
        
        //Lebih besar atau sama dengan
        System.out.println("Gather than...");
        System.out.println(" i >= j = " + (i >= j)); //false
        System.out.println(" j >= i = " + (j >= i)); //true
        System.out.println(" k >= j = " + (k >= j)); //true
        
        //Lebih kecil dari
        System.out.println("less than...");
        System.out.println(" i < j = " + (i < j)); //false
        System.out.println(" j < i = " + (j < i)); //true
        System.out.println(" k < j = " + (k < j)); //true
        
        //Lebih  kecil atau sama
        System.out.println("Gather than...");
        System.out.println(" i <= j = " + (i <= j)); //false
        System.out.println(" j <= i = " + (j <= i)); //true
        System.out.println(" k <= j = " + (k <= j)); //true
        
        //sama dengan
       System.out.println("Gather than...");
        System.out.println(" i = j = " + (i = j)); //false
        System.out.println(" j = i = " + (j = i)); //true
        System.out.println(" k = j = " + (k = j)); //true
        
        //tipe penggabungan
        System.out.println("Gather than...");
        System.out.println(" i != j = " + (i != j)); //false
        System.out.println(" k != j = " + (k != j)); //true
        
    }
}
