 
import java.text.DecimalFormat;

class Main {
    static void print(double num){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(num));
    }

    static void print(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        print(3.14159);
        print("Hello, world!");
    }
}