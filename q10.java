 
class Main {
    static int num1 = 10;
    static int num2;

    static {
        System.out.println("Static block is initialized.");
        num2 = num1 * 2;
    }

    static void staticMethod(){
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}