import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 8000);
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {

            double radius = 3.0;
            output.writeDouble(radius); // 傳送半徑至伺服器

            double result = input.readDouble(); // 從伺服器接收計算結果
            System.out.println("伺服器返回的面積: " + result);

        } catch (IOException e) {
            System.out.println("客戶端發生錯誤: " + e.getMessage());
        }
    }
}
