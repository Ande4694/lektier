import java.util.*;
public class Array4{
   public static void main(String[]args){     
      int[] lista = {2,5,2,5,1,5,2,9};
      int pos = mindst(lista,4);
      System.out.println(pos);
      int pos2 = højst(lista,4);
      System.out.println(pos2);
   
      
   }
   
public static int mindst(int[]list, int target){
      for(int i = 0; i<list.length; i++){
         if(list[i] == target){
            return i;
         }
      }
      return -1;
}

public static int højst(int[] list, int target){
      for (int i = (list.length-1); i>=0; i--){
         if(list[i] == target){
            return i;
         }
      }
      return -1;
}
}