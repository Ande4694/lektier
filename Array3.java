import java.util.*; /// scanner importeres
public class Array3{
   public static void main(String []args){
   /// scanner oprettes, der scannes efter "input"
   Scanner input = new Scanner(System.in);
   System.out.println("Hvor stort skal dette array vaere?");
      
      /// anti jarl
      while (!input.hasNextInt()){
      input.next();
      System.out.println("Det intastet var ikke en Int, pr�v igen");
      }
  
   //// n�ste input bliver til st�rrelseAfArray
   int st�rrelseAfArray = input.nextInt();
   /// Der oprettes et array, hvor st�rrelsen er hvad vi lige har tastet input til
   int arrayet[] = new int[st�rrelseAfArray];
   
   /// der oprettes en int sum, som skal "huske" hvad den sammenlagte sum er, der bliver tillagt v�rdi til "sum" l�ngere nede
   int sum = 0;
   /// dette "for loop" l�ber lige s� mange gange som vi har sat st�rrelseAfArray til
   /// note < grundet 0 baseret indeks
   for(int i=0;i<st�rrelseAfArray;i++){
      System.out.println("Hvad skal tal # "+(i+1)+"vaere?");
   /// hvert indeks i arrayet bliver givet en v�rdi, l�st fra scanneren
      arrayet[i] = input.nextInt();
   /// hver v�rdi fra scanneren bliver lagt til "sum"
      sum += arrayet[i];
      }
   ///   for hver loop testes der for om det p�g�ldende tal er st�rre end det hidtil st�rste tal
   int max = arrayet[0];
   for (int i = 0; i<st�rrelseAfArray;i++){
   /// hvis det er, bliver det til det nye "max"
      if (arrayet[i] > max){
      max = arrayet[i];
      }
   }
   
   /// samme som f�r, blot med mindst
   int min = arrayet[0];
   for (int i = 0; i<st�rrelseAfArray;i++){
      if (arrayet[i] < min){
      min = arrayet[i];
      }
   }
   System.out.println("De intastet tal er "+Arrays.toString(arrayet));
   System.out.println("Den sammenlagte sum er: "+sum);
   System.out.println("Gennemsnittet er: "+sum/st�rrelseAfArray);
   System.out.println("Det hoejeste tal er: "+max);
   System.out.println("Det leveste tal er: "+min);
   

   
   
   }

   
   
}