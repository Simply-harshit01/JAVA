package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {                              //IMP
                                                            // we can use static methods or static variables of a class before even creating a object of that classlike Main class
        human harshit=new human(21,"hasrhit",50000,false);
        human rahul=new human(21,"rahul",40000,false);

//        System.out.println(harshit.population);  //we use class name to refer the static variables in place of refrence variable
// System.out.println(rahul.population);          // or object name bcz it does not depend on it. although we can use no error bt it is advisable.

        System.out.println(human.population);
        System.out.println(human.population);

        greeting();    // cant use here bcz its in main and main is static that is not depend on object and greeting is not static
                        // we cant use non static in static
        //so either make greeting static or create obj then access
        Main obj=new Main();
        obj.greeting();

    }

    // cant use greeting here bcz its in fun and fun is static that is not depend on object and greeting is not static that depend on object/instance
  static  void fun()
  {
      greeting();
  }
    void greeting(){// we know that if something is not static then it depend on object
       fun();  // can use static in non static
        System.out.println("hlww im not staic");
    }
}
