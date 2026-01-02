package Arrays.Basic;

import java.util.ArrayList;

public class LeadersInArray {
    /*
    Given an array arr[] of size n, the task is to find all the Leaders in the array. 
    An element is a Leader if it is greater than or equal to all the elements to its right side.

    Note: The rightmost element is always a leader.  
    Example:
            Input: arr[] = [16, 17, 4, 3, 5, 2]
            Output: [17 5 2]
    */

    // Method to find leaders in the array
    static ArrayList<Integer> getLeaders(int [] arr) {

        ArrayList<Integer> res = new ArrayList<>();

        // // outer loop: pick each element one by one
        for (int i = 0; i < arr.length; i++) {
            int j;
              // Inner loop: compare arr[i] with all elements to its right
            for (j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) 
                    break;
            }
            // If j reached the end of the array,
            //  no element to the right was greater
            if (j == arr.length) {
                res.add(arr[i]);
            }
        }
            return res;
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res = getLeaders(arr);
        for(int x : res) {
            System.out.println(x);
        }
    }

}
