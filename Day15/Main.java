public class Main{
    public static void main(String[] args){
        Person bob = new Person("Bob", 30);
        Teacher jimmy = new Teacher("Jimmy",55,"Java");
        
        bob.sayHello();

        jimmy.sayHello();
        jimmy.teach();
    }
}

