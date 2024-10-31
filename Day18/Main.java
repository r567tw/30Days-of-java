// 定義一個名為 Animal 的介面 (interface)
interface Animal {
    // 定義動物的叫聲
    void makeSound();
    // 定義動物的移動方式
    void move();
}

// 實作 Animal 介面的 Dog 類別
class Dog implements Animal {
    // 實作 makeSound 方法
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    // 實作 move 方法
    @Override
    public void move() {
        System.out.println("Dog runs on four legs.");
    }
}

// 實作 Animal 介面的 Bird 類別
class Bird implements Animal {
    // 實作 makeSound 方法
    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet!");
    }

    // 實作 move 方法
    @Override
    public void move() {
        System.out.println("Bird flies in the sky.");
    }
}

// 主程式
public class Main {
    public static void main(String[] args) {
        // 使用多型呼叫
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();
    }
}
