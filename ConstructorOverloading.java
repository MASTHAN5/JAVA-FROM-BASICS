public class Student{
  int marks;
  String name;
Student (int a,String b){
marks = a;
  name = b;
}
public static void main(String [] args){
  Student obj1 = new Student(45,"raj");
  Student obj2 = new Student(82,"jam");
  System.out.println(obj2.marks);
  System.out.println(obj1.name);
}
}
