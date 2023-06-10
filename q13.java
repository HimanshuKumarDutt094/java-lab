 
interface Animal {
    int legs = 4;
    void move();
}

interface Bird {
    int wings = 2;
    void fly();
}

class Eagle implements Animal, Bird {
    public void move() {
        System.out.println("Eagle moves on its legs.");
    }
    public void fly() {
        System.out.println("Eagle flies using its wings.");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.move();
        eagle.fly();
        System.out.println("Eagle has " + Animal.legs + " legs and " + Bird.wings + " wings.");
    }
}