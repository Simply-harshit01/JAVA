import java.util.Scanner;
public class armstrongNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int num=in.nextInt();
        boolean ans=isArmstrong(num);
        System.out.println(ans);

    }
    static boolean isArmstrong(int n){
        int sum=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n = n/10;
        }
        return sum==original;
    }
}
