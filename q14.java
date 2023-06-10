 
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }
    final void display() {
        System.out.println("Name: " + name);
    }
    abstract void move();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called.");
    }
    void move() {
        System.out.println("Dog moves on its legs.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.display();
        dog.move();
    }
}