import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {



        int [] num={2,3,3,3,3,3,3,5,5,6};
        int target=3;
        //System.out.println(BS(num,target));

        //System.out.println(firstOccuranceBS(num,target));

        System.out.println(majority(num));

    }

    static int BS(int[] num,int target){
        int start=0;
        int end= num.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if (target<num[mid]){
                end=mid-1;
            } else if (target>num[mid]) {
                start=mid+1;

            }
            else return mid;
        }

     return -1;
    }

    // first occurance of target in sorted array

    static int firstOccuranceBS(int[] num,int target) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;

            } else if (num[mid-1]==num[mid]) {
                end=mid-1;
            }
                else return mid;

        }
        return -1;
    }

    // Majority is present in sorted arr or not  (element which occurs more than half no of times) >floor of n/2.
    //middle element will be candidate for majority element
    static boolean majority(int[] num){
        int start=0;
        int cond= num.length/2;
        int end= num.length-1;
        int candidate=num[start+(end-start)/2];
        int firstoccur=firstOccuranceBS(num,candidate);
        if (num[firstoccur+cond]==candidate){
            return true;
        }
        else return false;
    }




}