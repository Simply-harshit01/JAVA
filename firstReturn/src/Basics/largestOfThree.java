package Basics;

import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give 3 numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("largest no is "+ max);

      //int maxx=Math.max(a,Math.max(b,c));      // using inbuilt Math class ,
                                                  // in which a max method is present
      //  System.out.println(maxx);

    }

}
