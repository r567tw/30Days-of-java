public class Person{
    private String name;
    private int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.printf("Hi My name is %s, I'm %s years old\n",this.name, this.age);
    }
}
