package OOPS.Introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Student student1= new Student(26,"harshit",98.34f);
//        student1.rno=26;
//        student1.name="harshit";
//        student1.marks=98.34f;
        System.out.println(student1.name);
        Student student2=new Student("mishra",87.4f);
        System.out.println(student2.name);
        Student  student3=new Student();
        System.out.println(student3.name);


    }
}

class Student{
    int rno;
    String name;
    float marks;
    Student(int rollno,String sname,float smarks){
        this.rno=rollno;
        this.name=sname;
        this.marks=smarks;
    }
    Student(String sname,float smarks){
        this.rno=1;
        this.name=sname;
        this.marks=smarks;
    }
    Student(){
        this.rno=00;
        this.name="NA";
        this.marks=00.0F;
    }


}