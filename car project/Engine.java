public class Engine{
   private String brand;
   private int cubic;
   private int hk;
   
   public Engine(){
      String brand = "Toyota";
      int cubic = 17;
      int hk = 98;
   }
   
   public Engine(String brand, int cubic, int hk){
      this.brand = brand;
      this.cubic = cubic;
      this.hk = hk;
   }
   
   public void print(){
      System.out.println("Motor:");
      System.out.println("Motor brand: "+brand);
      System.out.println("Motor cubic: "+cubic);
      System.out.println("Motor HK: "+hk);
   }
}