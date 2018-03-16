public class Car{
   private String brand;
   private String model;
   private int year;
   private Engine motor;
   
   public Car(){
      String brand = "Toyota";
      String model = "Yaris";
      int year = 1990;      
   }
   /*
   public Car(String brand, String model, int year, String engineBrand, int engineCubic, int engineHk){
      this.brand = brand;
      this.model = model;
      this.year = year;
      motor = new Engine(engineBrand, engineCubic, engineHk);     
   }
   */
   public Car(String brand, String model, int year, Engine motor){
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.motor = motor;     
   }
   
   public void print(){
      System.out.println("Car:");
      System.out.println("Car brand: "+brand);
      System.out.println("Car model: "+model);
      System.out.println("Car year: "+year);
      motor.print();
   }
}