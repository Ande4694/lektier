import java.util.*;
public  class Klasse2{
   public static void main(String[]args){
   
      /// proper 10 af class "Student" i et array, kalder det "stud"
      Student[] stud = new Student[10]; 
      /// test af hvad det indeholder     
      System.out.println(Arrays.toString(stud));
      /// test af hvad en "stud" indeholder
      System.out.println(stud[0]);
      
      
      /// setter name, grade og age på stud[0]
      stud[0].setName("torben");
      stud[0].setGrade(7.8);
      stud[0].setAge(12);
   }
}