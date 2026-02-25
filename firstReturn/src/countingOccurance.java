import java.util.Scanner;

public class countingOccurance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        System.out.println("enter number and digit");
        int number=in.nextInt();
        int digit=in.nextInt();
        if (number<0){
            number=0-number;
        }
        while (number>0){
            int rem=number%10;
            if (rem==digit){
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }
}
