package OOPS.StaticExample;
//this is a demo to show initialisation of static variable
public class staticBlock {

    static  int a=4;
    static int b;
    // will only runs once ,when first object created when the class is loaded for the first time
    static {
        System.out.println("im in static block");
        b=a*5;
    }

    public static void main(String[] args) {
    staticBlock obj=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.b+=3;
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock obj2=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }

}
