 
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called.");
    }
}

class SuperDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        System.out.println("Dog name is " + dog.name);
    }
}