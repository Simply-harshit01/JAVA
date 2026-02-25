public class CeilingInBiinarySearch {
    public static void main(String[] args) {
        int []num={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(Ceiling(num,target));
    }
    static int Ceiling(int[] num,int target){
        int start=0;
        int end= num.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if (target<num[mid]){
                end=mid-1;
            } else if (target>num[mid]) {
                start=mid+1;

            }
            else return num[mid];
        }

        return num[start];
    }

}
