import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        swap(a,b);
        System.out.println(a+"  "+b);   // no changes
    }
    static void swap(int num1,int num2){
        int temp=num2;
        num2=num1;
        num1=temp;
//        System.out.println(num1);
//        System.out.println(num2);

    }
}
