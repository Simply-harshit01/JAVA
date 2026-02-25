import java.util.Scanner;
public class ReverseNO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        int rev =0;
        while (num>0){
            int rem=num%10;
            rev = rev *10+rem;
            num=num/10;
        }
        System.out.println(rev);

    }
}
