package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {

        if(klass.getLeader() != null && klass.getLeader().id == this.id){
            return super.introduce() + " I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        }
        return super.introduce() + " I am a Student. I am at Class "+this.klass.getNumber()+".";
    }
}
