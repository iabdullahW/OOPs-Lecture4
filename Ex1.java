// This class demonstrates how to create a constructor in Java
class ExConstructor {
    // Constructor for the ExConstructor class
    ExConstructor() {
        // This line will execute when an object of ExConstructor is created
        System.out.println("I am a Constructor");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        // Creating an object of ExConstructor class
        // This will automatically call the constructor
        ExConstructor obj = new ExConstructor();
    }
}
