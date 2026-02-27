package OOPS.Singleton;

public class main {
    public static void main(String[] args) {
        //singleton obj=new singleton(); //here we cant call the constructor of singleton call bcz its private and can only be used in that file only
        singleton obj1 = singleton.getInstance();

        singleton obj2 = singleton.getInstance();

        singleton obj3 = singleton.getInstance();

        //all 3 ref varibales are pointing to just one obj hence only one object is created
    }

}
