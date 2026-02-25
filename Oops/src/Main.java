//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Student student1= new Student();
        student1.rno=26;
        student1.name="harshit";
        student1.marks=98.34f;
        System.out.println(student1.name);

    }
}

class Student{
    int rno;
    String name;
    float marks;
}