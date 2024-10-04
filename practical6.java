class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class practical6{
    public static void main(String args[])
    {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog(); // Animal reference but Dog object
        
        myAnimal.sound(); // Calls Animal's sound method
        myDog.sound();    // Calls Dog's overridden sound method
    }
}
