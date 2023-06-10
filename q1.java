import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;
    double area;

    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextDouble();
        sc.close();

    }

    void Output(){
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    void CalcArea(){
        area = length * breadth;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.Input();
        rectangle.CalcArea();
        rectangle.Output();

    }
}