 
class Main {
    static void staticMethod(){
        System.out.println("This is a static method.");
    }

    void nonStaticMethod(){
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        staticMethod();
        Main obj = new Main();
        obj.nonStaticMethod();
    }
}