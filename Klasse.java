import java.util.*;
public  class Klasse{
   public static void main(String[]args){
   /*
      /// proper 10 af class "Student" i et array, kalder det "stud"
      Student[] stud = new Student[3]; 
      /// test af hvad det indeholder     
      System.out.println(Arrays.toString(stud));
      /// instanciere hvert indeks af "stud"
      stud[0] = new Student("Torben",8,12);
      stud[1] = new Student("Iben",9,13);
      // stud[2] bliver instancieret med en constructor
      stud[2] = new Student();
      /// test om det virker
      System.out.println(Arrays.toString(stud));
      
      
      /// setter name, grade og age p� stud[2], v�k fra constructor
      stud[2].setStudent("BERTRAM",0,18);
      System.out.println(stud[2]);
     */
      
      /// nyt array "students". indeks er 15 stort.
      Stud[] students = new Stud[15];
      /// hvert indeks er nu blankt "null"
      
      /// hvert indeks bliver nu instancieret til default constructor values med random name, grade og age..
      for ( int i = 0; i<students.length; i++){
         students[i] = new Stud();
      }
      
      /// print af hver lille lort..
      for (int i = 0; i<students.length; i++){
         System.out.println("student "+(i+1)+" ser saeledes ud\n"+students[i]);
      }
      
      
   }
}