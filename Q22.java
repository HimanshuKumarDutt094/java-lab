 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedStreamDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            while (!(line = br.readLine()).equals("STOP")) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}