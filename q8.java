 
class Rectangle {
    double length;
    double breadth;
    double area;

    Rectangle(){
        length = 0;
        breadth = 0;
    }

    Rectangle(double side){
        length = side;
        breadth = side;
    }

    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    void CalcArea(){
        area = length * breadth;
    }

    void Output(){
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.CalcArea();
        rectangle1.Output();

        Rectangle rectangle2 = new Rectangle(5);
        rectangle2.CalcArea();
        rectangle2.Output();

        Rectangle rectangle3 = new Rectangle(3, 4);
        rectangle3.CalcArea();
        rectangle3.Output();
    }
}