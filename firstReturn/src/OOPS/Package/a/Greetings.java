package OOPS.Package.a;

import static OOPS.Package.b.message.message;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("hello world!");
        message();   // bcz method 'message' is of public type and we can acces it through import
    }
}
