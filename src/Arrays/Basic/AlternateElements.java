package Arrays.Basic;

import java.util.ArrayList;

public class AlternateElements {
    static ArrayList<Integer> getAlternates(int [] arr) {

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,3,13,6,42,6,0,33};
        ArrayList<Integer> res = getAlternates(arr);
        for (int x : res) {
            System.out.println(x + " ");
        }
    }

}
