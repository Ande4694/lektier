import java.util.*;
public  class Klasse{
   public static void main(String[]args){

      /// nyt array "students". indeks er 15 stort.. det kan nu indeholde objekter "Stud".
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