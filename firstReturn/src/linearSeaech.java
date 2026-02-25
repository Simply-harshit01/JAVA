import java.util.Arrays;

public class linearSeaech {
    public static void main(String[] args) {
        int [] arr={3,2,333,2,5021};
        int target=4;

        int [][] arr2d={{2,3,4},{5,7,8},{9,9,8}};
        int targeet=4;

        //System.out.println(lsearch1(arr,target));
        //System.out.println(lsearch2(arr,target));
        //System.out.println(lsearch3(arr,target));
        //System.out.println(CountEven(arr));
        //System.out.println(welatheistMan(arr2d));
        //System.out.println(max(arr2d));
        System.out.println(Arrays.toString(search2d(arr2d,targeet)));
        System.out.println(search2d1(arr2d,targeet));
        System.out.println(search2d2(arr2d,targeet));

    }
      //if present or not
    static boolean lsearch1(int []arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int element:arr){
            if (element==target)
                return true;

        }
      return false;
    }

    //return the target else -1
    static int lsearch2(int []arr,int target){
        if (arr.length==0)
            return -1;
        for (int elements:arr){
            if (elements==target)
                return target;
        }
        return -1;
    }

    //return the index
    static int lsearch3(int []arr,int target){
        if (arr.length==0)
            return -1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==target)
                return i;
        }
        return -1;
    }

    //search in 2d array

    //1-return {i,j}location where element is present

    static int[] search2d(int[][]ars,int target) {
        int[] ans;
        for (int i = 0; i < ars.length; i++) {
            for (int j = 0; j < ars[i].length; j++) {
                if (ars[i][j] == target) {
                   return ans= new int[]{i, j};
                }
            }

        }
return ans=new int[]{-1,-1};
    }
    //2-return target if  element is present

    static int search2d1(int[][]ars,int target) {

        for (int i = 0; i < ars.length; i++) {
            for (int j = 0; j < ars[i].length; j++) {
                if (ars[i][j] == target) {
                   return target;
                }
            }

        }
return -1;
    }
    //3-return true false

    static boolean search2d2(int[][]ars,int target) {

        for (int i = 0; i < ars.length; i++) {
            for (int j = 0; j < ars[i].length; j++) {
                if (ars[i][j] == target) {
                   return true;
                }
            }

        }
return false;
    }

     //max element in 2d array
    static int max(int[][] arrs){
        int max=Integer.MIN_VALUE;
        for (int[]ar:arrs){
            for (int ele:ar){
                if (ele>max)
                    max=ele;
            }

        }
        return max;
    }


             //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    static int CountEven(int []nums){

        int count=0;
        for (int i=0;i< nums.length;i++){
            int digit=0;
            int n=nums[i];
            while (n!=0){
                n=n/10;
                digit++;
            }
            if (digit%2==0)
                count++;
        }
        return count;
    }

    //
    static int welatheistMan(int[][] accounts){
       int ans=Integer.MIN_VALUE;
       for (int []person:accounts){
           int sum=0;
           for (int acc:person){
               sum=sum+acc;
           }
           if (sum>ans)
               ans=sum;
       }
       return ans;
    }

}
