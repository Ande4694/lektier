import java.util.*; /// scanner importeres
public class Array3{
   public static void main(String []args){
   /// scanner oprettes, der scannes efter "input"
   Scanner input = new Scanner(System.in);
   System.out.println("Hvor stort skal dette array vaere?");
      
      /// anti jarl
      while (!input.hasNextInt()){
      input.next();
      System.out.println("Det intastet var ikke en Int, prøv igen");
      }
  
   //// næste input bliver til størrelseAfArray
   int størrelseAfArray = input.nextInt();
   /// Der oprettes et array, hvor størrelsen er hvad vi lige har tastet input til
   int arrayet[] = new int[størrelseAfArray];
   
   /// der oprettes en int sum, som skal "huske" hvad den sammenlagte sum er, der bliver tillagt værdi til "sum" længere nede
   int sum = 0;
   /// dette "for loop" løber lige så mange gange som vi har sat størrelseAfArray til
   /// note < grundet 0 baseret indeks
   for(int i=0;i<størrelseAfArray;i++){
      System.out.println("Hvad skal tal # "+(i+1)+"vaere?");
   /// hvert indeks i arrayet bliver givet en værdi, læst fra scanneren
      arrayet[i] = input.nextInt();
   /// hver værdi fra scanneren bliver lagt til "sum"
      sum += arrayet[i];
      }
   ///   for hver loop testes der for om det pågældende tal er større end det hidtil største tal
   int max = arrayet[0];
   for (int i = 0; i<størrelseAfArray;i++){
   /// hvis det er, bliver det til det nye "max"
      if (arrayet[i] > max){
      max = arrayet[i];
      }
   }
   
   /// samme som før, blot med mindst
   int min = arrayet[0];
   for (int i = 0; i<størrelseAfArray;i++){
      if (arrayet[i] < min){
      min = arrayet[i];
      }
   }
   System.out.println("De intastet tal er "+Arrays.toString(arrayet));
   System.out.println("Den sammenlagte sum er: "+sum);
   System.out.println("Gennemsnittet er: "+sum/størrelseAfArray);
   System.out.println("Det hoejeste tal er: "+max);
   System.out.println("Det leveste tal er: "+min);
   

   
   
   }

   
   
}