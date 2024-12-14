import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Bob","Bill", "Alice", "Alex", "Kim"};

        // 使用 Stream API 對名字進行排序並限制輸出數量
        Stream.of(names).sorted().limit(4).forEach(e -> System.out.println(e));

        int[] values = {1,2,3,4,5,6};

        // 使用 IntStream API 進行數值加總
        int result = IntStream.of(values).reduce(0,(a, b) -> a + b);
        System.out.println(result);

        String word = "Banana";
        long ans = word.chars().filter(c -> c == 'a') .count(); 

        System.out.println(ans);


        String sentence = "This is a test sentence, and this is a test sentence.";
        // Use Stream to count the occurrences of each word
        // 使用 Stream 計算每個單詞出現的次數
        Map<String, Long> wordCount = Arrays.stream(sentence.split("\\W+"))
        .map(String::toLowerCase)
        .collect(Collectors.groupingBy(w -> w, TreeMap::new, Collectors.counting())); // 使用 TreeMap 儲存結果

        // 輸出結果
        wordCount.forEach((w, count) -> System.out.println(w + ": " + count));
    }
}
