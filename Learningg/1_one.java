
class HelloWorld {
    
    static class Student{
        // ----------instance variable------------
        int studentId;
        String studentName;
        int studentAge;
        
        // ---------Behaviour--------
        public Student(){
            System.out.println("Creating Constructor");
        }
        // ------methods----------
        public void name(){
            System.out.println("Name of the student is:" +studentName);
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
        
        
    }
}