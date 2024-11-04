import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main{

    public static void main(String[] args){
        // System.out.println("Hello World");

        String path = "./main.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}