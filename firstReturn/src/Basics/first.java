package Basics;

import java.util.Scanner;
public class first {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        String name= input.nextLine();
        System.out.println("hello " + name + " what is your age ?");
        int age=input.nextInt();
        System.out.println("your age is " + age);

    }
}
