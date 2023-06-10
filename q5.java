 
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Numbers in ascending order: ");
        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    

}
