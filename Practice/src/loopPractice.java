import java.util.Scanner;
public class loopPractice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int num=in.nextInt();
        //System.out.println("sum of " + num +" number is "+ printsumNnumbers(num));
       // System.out.println("sum of " + num +" even number is "+ sumNevenNo(num));

        System.out.println("table of number "+num +" is");mulTable(num);
        //System.out.println("factorial of number "+num+" is " + factorial(num));
    }
//    static int printsumNnumbers(int n){
//        int sum=0;
//        for loop
//        for (int i=1;i<=n;i++){
//            sum=i+sum;
//        }
//        int i=1;
//        while (i<=n){
//            sum=i+sum;
//            i++;
//        }
//        return sum;
//    }
//
    static int sumNevenNo(int n){
        int sum=0;
        for (int i=1;i<=n;i++){

            sum=sum+2*i;
        }
        return sum;
    }

    static void mulTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    static int factorial(int n){
        if (n==1 || n==0)
            return n;
        int fact=1;
//        for (int i=n;i>=1;i--){
//            fact=fact*i;
//        }
//        return fact;

        //using while loop
        int i=n;
        while (i>=1){
            fact=fact*i;
            i--;
        }
        return fact;

    }
}
