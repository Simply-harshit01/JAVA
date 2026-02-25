import javax.swing.*;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        String s="NAMAN";
        reverseStr(s);
        checkPelindromeStr(s);
        countOccurance(s);

        System.out.println("give the string");
      Scanner in= new Scanner(System.in);
      String ss=in.next();
        checkPalinTwoPointer(ss);

    }
         // to reverse the string
    static void reverseStr(String str){
        int size= str.length();
        String revs="";
        for (int i=size-1;i>=0;i--){
           revs=revs+ str.charAt(i);
        }
        System.out.println(revs);
    }

    //to check pelindrome
    //1) using reverse and extra string
    static void checkPelindromeStr(String str){
        int size= str.length();
        String revs="";
        for (int i=size-1;i>=0;i--){
            revs=revs+ str.charAt(i);
        }

        if(str.equals(revs)){
            System.out.println("given string is palindrome");
        }else System.out.println("not a palindrome");
    }
   //2) using two pointer approach,fast nd space efficient

    static void checkPalinTwoPointer(String str){
        Boolean  isPelinDrome= true;
        int start= 0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!= str.charAt(end)){
                isPelinDrome=false;
                break;
            }
            start++;
            end--;
    }
        if (isPelinDrome){
            System.out.println("this is pelindrome");
        }else{
            System.out.println("not a pelindrome");
        }
    }

    //count occurence of each charcter

    static void  countOccurance(String s){

        for (int i=0;i<s.length();i++){
            int count =0;
            for (int j=0;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println("count of "+s.charAt(i)+" is "+ count);
        }

    }
}