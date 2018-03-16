public class RunCar{
   public static void main(String[]args){
      //Car minBil = new Car("Ferrari","Testestorosa", 2018,"Ferrari",500,400);
      Engine motor = new Engine("Ferrari", 500, 400);
      Car minBil = new Car("Ferrari","Testestorosa", 2018, motor);
      minBil.print();
   
   }
}