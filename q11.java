class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black in color.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

class Kitten extends Cat {
    void color() {
        System.out.println("Kitten is white in color.");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.color();
        lab.bark();
        lab.eat();
        
        Kitten kit = new Kitten();
        kit.color();
        kit.meow();
        kit.eat();
    }
}
