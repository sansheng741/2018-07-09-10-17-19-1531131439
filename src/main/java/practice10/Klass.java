package practice10;

public class Klass {

    private int number;
    private Student leader;

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
        }
    }

    public Student appendMember(Student student){
        student.setKlass(this);
        return student;
    }

    public boolean isIn(Student student,int number){
        if(student.getKlass().number == number){
            return true;
        }
        return false;
    }
}
