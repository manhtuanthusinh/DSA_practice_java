package Arrays.Basic;

public class CheckIfSorted {
    /*
    Given an array arr[], check if it is sorted in ascending order or not. 
    Equal values are allowed in an array and two consecutive equal values are considered sorted. 
    */

    // check if array is sorted
    public static boolean isSorted(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (arr[i+1] < arr[i])
                return false;  
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {4 , 6, 8, 10};
        System.out.println(isSorted(arr)); 
    }
}
