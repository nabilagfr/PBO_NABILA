/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul11.Latihan1;

/**
 *
 * @author User
 */
public class StudentRecordExample {
      public static void main(String[] args){
        StudentRecord student;
        
        Komputer komputer=new Komputer();
        
        student=komputer;
        
        student.setName("Nabila");
        student.setAddress("Padang");
        student.setAge(18);
        student.setMathGrade(86.0);
        student.setEnglishGrade(87.0);
        student.setScienceGrade(78.0);
        student.setKomputer(80.0);
        System.out.println("Nama : "+student.getName());
        System.out.println("Umur : "+student.getAge());
        System.out.println("Alamat : "+student.getAddress());
        System.out.println("Nilai MTK : "+student.getMathGrade());
        System.out.println("Nilai B.inggris : "+student.getEnglishGrade());
        System.out.println("Nilai Science : "+student.getScienceGrade());
        System.out.println(student.getKomputer());
    }
}
