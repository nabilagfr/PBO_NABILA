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
public class TestXorNabila {
    public static void main(String[] args) {
        boolean val1 = true ;
        boolean val2 = true;
        System.out.println(val1 ^ val2);
        
        val1 = false ;
        val2 = true;
        System.out.println(val1 ^ val2);
        
        val1 = false ;
        val2 = false;
        System.out.println(val1 ^ val2);
        
        val1 = true ;
        val2 = false;
        System.out.println(val1 ^ val2);
    }
}
