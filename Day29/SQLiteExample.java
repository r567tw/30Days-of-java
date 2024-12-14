import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteExample {
    public static void main(String[] args) {
        // 資料庫會自動在專案目錄下建立
        // java -cp ".:sqlite-jdbc-3.42.0.0.jar" SQLiteExample.java
        String url = "jdbc:sqlite:test.db";

        try {
            // 明確載入 SQLite JDBC 驅動程式
            Class.forName("org.sqlite.JDBC");
            
            try (Connection conn = DriverManager.getConnection(url)) {
                System.out.println("資料庫連接成功！");

                // 建立資料表
                createTable(conn);

                // 插入資料
                insertData(conn, "hello2", "helloworld2@example.com");

                // 查詢資料
                queryData(conn);

                cleanData(conn);

                queryData(conn);

            } catch (SQLException e) {
                System.out.println("資料庫操作錯誤: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("找不到 SQLite JDBC 驅動程式");
            System.out.println("請確認是否已經在 pom.xml 中加入 sqlite-jdbc 依賴");
            e.printStackTrace();
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "username TEXT NOT NULL," +
                    "email TEXT NOT NULL)";
        
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("資料表建立成功！");
        }
    }

    private static void insertData(Connection conn, String username, String email) throws SQLException {
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("資料插入成功！");
        }
    }

    private static void queryData(Connection conn) throws SQLException {
        String sql = "SELECT * FROM users";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("使用者名稱: " + rs.getString("username"));
                System.out.println("電子郵件: " + rs.getString("email"));
                System.out.println("----------------");
            }
        }
    }

    private static void cleanData(Connection conn) throws SQLException {
        String sql = "Delete FROM users";
        
        try (Statement stmt = conn.createStatement();) {
            stmt.execute(sql);
            System.out.println("已清除資料");
        }
    }
}