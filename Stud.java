import java.util.*;
public class Stud{

   private String name;
   private int age;
   private String grade;
   
   String names[]={"Henrik","Torben","Chris","Thomas","Kim","Frederik","Klaus","Peter","Tobias","Rasmus"};
   
public Stud(){
   name = setRandomName();
   age = setRandomAge();
   grade = setRandomGrade();
}

public String setRandomName(){
   String names[]={"Henrik","Torben","Chris","Thomas","Kim","Frederik","Klaus","Peter","Tobias","Rasmus"};
   this.name=names[new Random().nextInt(names.length)];
   return name;
}
public String setRandomGrade(){
   String grades[]={"A+","A","A-","B+","B","B-","c+","C","C-","D+","D","D-","F"};
   this.grade=grades[new Random().nextInt(grades.length)];
   return grade;
}
public int setRandomAge(){
   int ages[]={12,13,14,15};
   this.age=ages[new Random().nextInt(ages.length)];
   return age;
}
public String toString(){
String info = "";
   info = info + ("Student name: "+ name+"\n");
   info = info + ("Student age: "+ age+"\n");
   info = info + ("Student grade: "+ grade+"\n");
   return info;
}
}