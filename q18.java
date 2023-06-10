class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Animal is making a sound.

        animal = new Dog();
        animal.makeSound(); // Dog is barking.

        animal = new Cat();
        animal.makeSound(); // Cat is meowing.
    }
}