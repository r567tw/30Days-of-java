public class Person{
    protected String name;
    protected int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.printf("Hi My name is %s, I'm %s years old\n",this.name, this.age);
    }
}
