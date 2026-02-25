import java.util.Scanner;
public class primeNoCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter num");
        int num=in.nextInt();
        boolean ans= Isprime(num);
        System.out.println(ans);
    }
    static boolean Isprime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c <= n){
            if (n%c==0){
                return false;
            }
                c++;
        }
        return true;
    }
}
