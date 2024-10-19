public class Teacher extends Person{
    private String course;
    
    public Teacher(String name,int age,String course){
        super(name,age);
        this.course = course;
    }

    public void teach(){
        System.out.printf("%s teach %s\n",this.name,this.course);
    }
}
