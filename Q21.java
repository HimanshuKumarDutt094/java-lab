import java.io.FileReader;
import java.io.IOException;

class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
