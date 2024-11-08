import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // 定義正規表達式樣式
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String input = "example@test.com";

        // 編譯正規表達式
        Pattern pattern = Pattern.compile(regex);
        
        // 建立匹配器
        Matcher matcher = pattern.matcher(input);

        // 檢查是否匹配
        if (matcher.matches()) {
            System.out.println("這是一個有效的Email格式");
        } else {
            System.out.println("無效的Email格式");
        }
    }
}
