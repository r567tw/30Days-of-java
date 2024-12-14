import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8000)) {
            System.out.println("伺服器已啟動，等待客戶端連接...");

            while (true) { // 持續等待客戶端連接
                try (Socket socket = server.accept();
                     DataInputStream input = new DataInputStream(socket.getInputStream());
                     DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {

                    System.out.println("客戶端已連接");

                    // 讀取客戶端傳來的半徑數據
                    double radius = input.readDouble();
                    double area = radius * radius * Math.PI;

                    // 回傳計算結果給客戶端
                    output.writeDouble(area);
                    System.out.println("計算圓面積成功，半徑: " + radius + "，面積: " + area);

                } catch (IOException e) {
                    System.out.println("與客戶端通訊時發生錯誤: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("伺服器啟動失敗: " + e.getMessage());
        }
    }
}
