class VariableDemo {
    // Instance variable
    private int instanceVar;

    // Static variable
    private static int staticVar = 0;

    // Constructor to initialize the instance variable
    public VariableDemo(int value) {
        this.instanceVar = value;
        staticVar++; // Increment static variable
    }

    // Method demonstrating local variable
    public void display() {
        // Local variable
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}

public class practical3{
    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo(5);
        obj1.display(); // Displays values of local, instance, and static variables
        
        VariableDemo obj2 = new VariableDemo(10);
        obj2.display(); // Display values again for another instance
    }
}
// write a java program to demonstrate the decleration and scope of local, instance and static variables
