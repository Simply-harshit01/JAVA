import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
      //pattern1(5);
       // pattern2(6);
        pattern3(7);
    }

    static void pattern1(int n){
        for (int i=1;i<=n;i++){
            int j=1;
            while (j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(n-j+1);
//            }
            //or we can usw While Loop
            int j=1;
            while (j<=i){
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        //space complexity=O(n) ,time coplexity=O(n*n)

      StringBuilder sb= new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int k = 1; k <= 2*n -2*i;k++){
                System.out.print(".");

            }
            for (int l=1;l<=i;l++){
               System.out.print(i-l+1);

            }
            System.out.println(sb);
        }
    }

    //we can use string builder to reduce no of print operations.
    // time coplexity=Same as above=O(n*n)
    //space complexity=O(n)
    // for more info -https://chatgpt.com/c/689b59e5-f168-8329-a7b4-bb6d301a2641

//    static void pattern3(int n) {
//        for (int i = 1; i <= n; i++) {
//            StringBuilder sb = new StringBuilder();
//
//            // First part: numbers from 1 to i
//            for (int j = 1; j <= i; j++) {
//                sb.append(j);
//            }
//
//            // Middle part: dots
//            for (int k = 1; k <= 2 * n - 2 * i; k++) {
//                sb.append('.');
//            }
//
//            // Last part: numbers from i down to 1
//            for (int l = 1; l <= i; l++) {
//                sb.append(i - l + 1);
//            }
//
//            // Print the whole row in one go
//            System.out.println(sb);
//        }
//    }

}
