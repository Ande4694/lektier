public class RunCar{
   public static void main(String[]args){
      //Car minBil = new Car("Ferrari","Testestorosa", 2018,"Ferrari",500,400);
      Engine motor = new Engine("Ferrari", 500, 400);
      //Tire dæk = new Tire("What ever",38);
      Tire dæk[] = new Tire[4];
      for ( int i = 0; i<dæk.length; i++){
         dæk[i] = new Tire("Pirrelli",38);
      }   
      Car minBil = new Car("Ferrari","Testestorosa", 2018, motor, dæk);
      minBil.print();   
   }
}