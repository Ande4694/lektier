import java.util.*;
public class Array2{
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      System.out.println("Hvor stort skal dette array, fyldt med ulige tal vaere?");
   
      // anti jarl
      while(!input.hasNextInt()){
      input.next();
      System.out.println("Not an integet, try again");
      }
   
      // der scannes for "input".
      int st�rrelseAfArray = input.nextInt();
      // array der fyldes med x antal ullige, st�rrelsen er den int vi i ovenst�ende linie har scannet som "input"
      int[]ulige = new int[st�rrelseAfArray];
      for(int i = 0; i<st�rrelseAfArray; i++){
         ulige[i]=2*i+1;
      }
      // udskrift af hvad der nu er i arrayet
      System.out.println(Arrays.toString(ulige));
      
      // udskrift p� hver sin linie
      for(int i = 0; i<ulige.length; i++){
      System.out.println("indeks "+i+" er: "+ulige[i]);
      }
   }
}