package practice08;

public class Person {
    protected int id;
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(int id,String name,int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
