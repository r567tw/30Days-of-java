import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Runnable r2 = () -> System.out.println("Hello, world!");

        r2.run();

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // 使用 lambda 遍歷列表
        names.forEach(name -> System.out.println(name));

        // 使用 lambda 過濾和排序
        names.stream()
             .filter(name -> name.startsWith("A"))
             .sorted((a, b) -> a.compareTo(b))
             .forEach(name -> System.out.println("Filtered: " + name));
    }
}
