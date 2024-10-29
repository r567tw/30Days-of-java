// 抽象類別 Animal
abstract class Animal {

    // 抽象方法 makeSound，沒有方法體，由子類別實作
    public abstract void makeSound();

    // 一般方法
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Dog 類別繼承自 Animal 並實作 makeSound
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Cat 類別繼承自 Animal 並實作 makeSound
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();  // 建立 Dog 類別的實例
        Animal cat = new Cat();  // 建立 Cat 類別的實例

        dog.makeSound(); // 呼叫 Dog 的 makeSound 方法
        cat.makeSound(); // 呼叫 Cat 的 makeSound 方法
        dog.sleep();     // 呼叫 Animal 的 sleep 方法
        cat.sleep();     // 呼叫 Animal 的 sleep 方法
    }
}
