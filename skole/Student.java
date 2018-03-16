public class Student{
   private String name;
   private double grade;
   private int age;

   public Student(){
      name = "Møgunge";
      grade = -3.0;
      age = 0;
   }
   
   
   public Student(String name, double grade, int age){
   
      this.name = name;
      this.grade = grade;
      this.age = age;
   }

   public void setName(String name){
      this.name = name;
   }
   
   public void setGrade(double grade){
      this.grade = grade;
   }
   
   public void setAge(int age){
      this.age= age;
   }
   
   public void setStudent(String name, double grade, int age){
      this.name = name;
      this.grade = grade;
      this.age = age;
   }
   
   public String getName(){
      return name;
   }
   public double getGrade(){
      return grade;
   }
   public int getAge(){
      return age;
   }
   
   public String toString(){
      String info = "";
      info = info + ("Student name: \t\t" +name+ "\n");
      info = info + ("Student grade: \t" +grade+"\n");
      info = info + ("Student age: \t\t" +age+ "\n\n"); 
      if (age<16){
      System.out.println(name + " is not entiteled to SU yet, please wait "+(16-age)+" year(s)");
      }else if (age>=16 && age<18){
      System.out.println(name + " is entiteled to small SU");
      }else if (age>=18 && age<65){
      System.out.println(name + " is entiteled to full SU");
      }else if (age>=65 && age<=200){
      System.out.println(name + " is entiteled to retirement aid");
      }
      return info;
   }
}