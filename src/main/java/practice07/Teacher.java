package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(null == this.klass){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class "+this.klass.getNumber()+".";
    }

    public String introduceWith(Student student){
        if(this.klass.getNumber() == student.getKlass().getNumber()){
            //My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
            return super.introduce() + " I am a Teacher. I teach "+student.name+".";
        }
        return super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }
}
