import java.util.Scanner;
public class StringBasic {
    public static void main(String[] args) {
        //greeting();
        String name= "harshit";
        String name2=new String("harshit mishra");
        System .out.println(name);
        System.out.println(name.length());
        String fullname= name.concat(" "+name);
        String fulln=name+" misra";
        System.out.println(fulln);
        System.out.println(fullname);
        System.out.println(name.toUpperCase());
        System.out.println(name2);
    }
    static void greeting(){
        System.out.println("hii what is your name");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        System.out.println("hello!"+ name);
    }
}
