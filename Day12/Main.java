class Animal {
    // Public method: 可以從任何地方存取
    public void publicMethod() {
        System.out.println("Public method: Can be accessed from anywhere.");
    }

    // Private method: 只能在同一個類別內存取
    private void privateMethod() {
        System.out.println("Private method: Can only be accessed within this class.");
    }

    // Protected method: 可以在同一個包內存取，也可以在子類別中存取
    protected void protectedMethod() {
        System.out.println("Protected method: Can be accessed in the same package or by subclasses.");
    }

    // Package-private method (沒有指定修飾符，屬於預設): 只能在同一個包內存取
    void defaultMethod() {
        System.out.println("Default method: Can be accessed only in the same package.");
    }

    // 示範如何在類別內存取 private 方法
    public void accessPrivateMethod() {
        privateMethod();
    }
}

class Dog extends Animal {
    public void demoProtected() {
        // 可以存取 protected 方法，因為 Dog 是 Animal 的子類別
        protectedMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // Public method 可以直接存取
        animal.publicMethod();

        // Default method 在同一個包內可以存取
        animal.defaultMethod();

        // Private method 無法從這裡存取，會編譯錯誤
        // animal.privateMethod(); // Un-commenting this will cause a compilation error

        // 可以透過公有方法來存取 private 方法
        animal.accessPrivateMethod();

        Dog dog = new Dog();
        // Dog 可以存取繼承自 Animal 的 protected 方法
        dog.demoProtected();
    }
}

