/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nabila02112022;

/**
 *
 * @author LABMM07
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(80);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(90);
                
        ///tampilkan
        System.out.println("Nama          :"+student1.getName());
        System.out.println("Alamat        :"+student1.getAddress());
        System.out.println("Umur          :"+student1.getAge());
        System.out.println("Matematika    :"+student1.getMathGrade());
        System.out.println("B.inggris     :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan   :"+student1.getScienceGrade());
        System.out.println("Rata-rata     :"+student1.getAverage());
        System.out.println("Nilai maximum :"+student1.getMaximum());
        
        StudentRecord student2 = new StudentRecord();
        student2.setName("Ani");
        student2.setAddress("Bukittinggi");
        student2.setAge(18);
        student2.setMathGrade(70);
        student2.setEnglishGrade(80);
        student2.setScienceGrade(90);
       
        
        student2.print("");
        student2.print(student2.getEnglishGrade(),
                student2.getMathGrade(),student2.getScienceGrade(),student2.getMaximum());
    }
    
    
}
