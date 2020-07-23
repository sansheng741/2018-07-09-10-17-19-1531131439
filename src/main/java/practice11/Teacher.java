package practice11;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).addTeacher(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void update_join(Student student){
        System.out.print("I am "+this.name+". I know "+student.name+" has joined Class "+student.getKlass().getNumber()+".\n");
    }

    public void update_leader(Student student){
        System.out.print("I am "+this.name+". I know "+student.name+" become Leader of Class "+student.getKlass().getNumber()+".\n");
    }

    @Override
    public String introduce() {
        if(classes == null || classes.size() == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        StringBuilder sb = new StringBuilder(super.introduce() + " I am a Teacher. I teach Class ");
        for(int i = 0; i < classes.size() - 1; i++){
            //2, 3
            sb.append(classes.get(i).getNumber() + ", ");
        }
        sb.append(classes.get(classes.size() - 1).getNumber()+".");
        return sb.toString();
    }

    public String introduceWith(Student student){
        for(int i = 0; i < classes.size(); i++){
            if(classes.get(i).getNumber() == student.getKlass().getNumber()){
                return super.introduce() + " I am a Teacher. I teach "+student.name+".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach Jerry.";
    }

    public boolean isTeaching(Student student){
        for(int i = 0; i < classes.size(); i++){
            if(classes.get(i).isIn(student,classes.get(i).getNumber())){
                return true;
            }
        }
        return false;
    }



}
