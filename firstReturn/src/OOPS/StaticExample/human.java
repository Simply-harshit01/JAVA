package OOPS.StaticExample;

public class human {
    int age;
    String name;
    int salary;
    Boolean married;
    static long population; // not depend on object ,same for each object like for
                       // every human population is same so use 'static'

    public human(int age,String name,int salary,Boolean married) {
        this.age = age;
    this.name = name;
    this.salary = salary;
    this.married = married;
    human.population += 1;  // to access the static varibles we use class name in place of 'this'
    }




}
