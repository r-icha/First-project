// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class HelloWorld {
    
    static class Student{
        // instance variable
        int studentId;
        String studentName;
        int studentAge;
        
        // constructor 
        public Student(){
            System.out.println("Creating Constructor");
        }
        // parameterized constructor
        public Student(int a, int b){
            System.out.println("Parameterized Constructor");
            System.out.println(a);
            System.out.println(b);
            int c = a+b;
            System.out.println(c);
        }
        // parameterized constructor
     public Student(int id, String name, int age){
           studentId = id;
           studentName = name;
           studentAge =  age;
     }
        
        // methods
        public void name(){
            System.out.println("Name of the student is:" +studentName);
        }
        public void name(String name){
            System.out.println(name);
        }
        public void allDetails(){
            System.out.println("The ID of the Student is: " +studentId);
            System.out.println("The Name of the Student is: " +studentName);
            System.out.println("The Age of the Student is: " +studentAge);
        }
    }
    public static void main(String[] args) {
        // Creating Object for Student class
        Student str1 = new Student();
        str1.studentId = 1;
        str1.studentName = "Richa Chaudhary";
        str1.studentAge = 24;
        str1.name();
        str1.allDetails();
        
        Student str2 = new Student(2, 3);
        str2.studentId = 2;
        str2.studentName = "Kunal Chaudhary";
        str2.studentAge = 21;
        str2.name("Krishna");
        str2.allDetails();
        
        Student str3 = new Student(3, "Radha Rani", 23);
        str3.name();
        str3.allDetails();
    }
}
