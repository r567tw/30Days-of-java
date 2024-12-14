// 定義一個泛型類別，T 是類別中的泛型參數
// <? extends T>
/*
public static <E> void print(E[] list){
  ...code
}
*/
class Box<T> {
    private T item;

    // 設定值的方法
    public void setItem(T item) {
        this.item = item;
    }

    // 取得值的方法
    public T getItem() {
        return item;
    }
}

public class main {
    public static void main(String[] args) {
        // 建立一個裝 Integer 的 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer Box: " + integerBox.getItem());

        // 建立一個裝 String 的 Box
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println("String Box: " + stringBox.getItem());
    }
}
