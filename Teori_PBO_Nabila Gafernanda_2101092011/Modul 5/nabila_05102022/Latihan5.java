/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila_05102022;

import javax.swing.JOptionPane;
/**
 *
 * @author LABMM07
 */
public class Latihan5 {
    public static void main( String[] args ) {
          String word1 = "";
          String word2 = "";
          String word3 = "";
          
          word1 = JOptionPane.showInputDialog("word1 : ");
          word2 = JOptionPane.showInputDialog("word2 : ");
          word3 = JOptionPane.showInputDialog("word3 : ");
          
          String msg = " " + word1 + " " + word2 + " " + word3;
          
          JOptionPane.showMessageDialog(null, msg);
      }
}
