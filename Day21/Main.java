import java.io.FileWriter;   // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors


class Main{

    public static void main(String[] args){
        // System.out.println("Hello World");

        try (FileWriter hello = new FileWriter("./hello.txt")){
            hello.write("Hello World");
        } catch (IOException ex){
            System.out.println("error");
        }

    }
}