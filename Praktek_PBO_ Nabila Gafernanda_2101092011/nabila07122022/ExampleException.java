/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila07122022;

/**
 *
 * @author User
 */
public class ExampleException {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index ke " + ex.getMessage() + "\ntidak ada");
        }finally{
             System.out.println("Keluar");
        }
    }
}
