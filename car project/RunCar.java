public class RunCar{
   public static void main(String[]args){
      //Car minBil = new Car("Ferrari","Testestorosa", 2018,"Ferrari",500,400);
      Engine motor = new Engine("Ferrari", 500, 400);
      //Tire d�k = new Tire("What ever",38);
      Tire d�k[] = new Tire[4];
      for ( int i = 0; i<d�k.length; i++){
         d�k[i] = new Tire("Pirrelli",38);
      }   
      Car minBil = new Car("Ferrari","Testestorosa", 2018, motor, d�k);
      minBil.print();   
   }
}