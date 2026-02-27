package Basics;

import java.util.Scanner;
public class checkUpparCaseLowerCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter letter");
        char ch=in.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("is lower case");
        } else if (ch >= 'A' && ch<='Z') {
            System.out.println("is upper case");
        }else {
            System.out.println("not an alphabet");
        }
    }
}
