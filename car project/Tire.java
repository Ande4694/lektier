public class Tire{
   private String brand;
   private int tommer;
   
   public Tire(String brand, int tommer){
      this.brand = brand;
      this.tommer = tommer;
   }
   public void print(){
      System.out.println("Tire:");
      System.out.println("Tire brand: "+brand);
      System.out.println("Tire inches: "+tommer+" tommer");
   }

}