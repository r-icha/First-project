// Super Keyword 

public class HelloWorld{

 static class Animal{
     String color = "Blue";
     int x = 12;
     
    //  Method
    public void eating(){
        System.out.println("Animal is Eating");
        
    }
 }
 static class Dog extends Animal{
        int x = 4;
        public void speak(){
        System.out.println(super.x);
        System.out.println(this.x);  
        }
    }
    
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eating();
        d1.speak();
        System.out.println("Animal color is" +d1.color);
    }
    }
