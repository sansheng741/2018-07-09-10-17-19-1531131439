package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass{
    private int number;
    private Student leader;
    private List<Teacher> teacherList = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        if(student.getKlass() != this){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
            for (int i = 0; i < teacherList.size(); i++) {
                teacherList.get(i).update_leader(student);
            }
        }
    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public Student appendMember(Student student){
        student.setKlass(this);
        for (int i = 0; i < teacherList.size(); i++) {
            teacherList.get(i).update_join(student);
        }
        return student;
    }

    public boolean isIn(Student student,int number){
        if(student.getKlass().number == number){
            return true;
        }
        return false;
    }

}
