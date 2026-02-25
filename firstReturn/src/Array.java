import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int []array_name =new int[5];

//        System.out.println("enter the elements in array");
        Scanner in=new Scanner(System.in);
//        for (int i=0;i<5;i++){
//            array_name[i]=in.nextInt();
//        }
        //System.out.println(array_name.length);
//        System.out.println(Arrays.toString(array_name));


        //2d array
//        int[][]array2d=new int[2][3];
//        for (int i=0;i<2;i++){
//            for (int j=0;j<3;j++){
//                array2d[i][j]=in.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(array2d));
//
//        for (int row=0;row< array2d.length;row++){
//            System.out.println(Arrays.toString(array2d[row]));
//        }



        //arraylist
        ArrayList<Integer> list=new ArrayList<Integer>(5);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println(list);
        //operations
        list.add(2,9);
        list.remove(1);
        System.out.println(list);
        boolean present=list.contains(4);
        System.out.println(present);
        System.out.println(list.size());
        list.set(4,99);
        list.getFirst();
        System.out.println(list);
        System.out.println(list.reversed());



    }
}
