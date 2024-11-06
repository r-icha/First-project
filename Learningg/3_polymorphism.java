// -----------Compile time Polymorphism------------


// class Student{
//     public void read(){
//         System.out.println("Student is reading");
//     }
//     public void read(String bookName){
//         System.out.println("Student is Reading : " +a);
//     }
// }


// public class Main{
//     public static void main(String args[]){
//       Student s1 = new Student();
//       s1.read();
//       s1.read("Python");
//     }
// }

//--------------------- Run time polymorshim--------------------

class Person{
    public void showDetail(){
        System.out.println("Basic Details of person");
    }
}
class Emp extends Person{
     public void showDetail(){
        System.out.println("Showing Details of Employee");
    }
}


public class Main{
    public static void main(String args[]){
       Person p1 = new Emp();
       p1.showDetail();
    }
}
