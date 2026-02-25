import java.util.*;

class Solution {

    public int[] sortByBits(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if (bitsA == bitsB)
                return a - b;        
            else
                return bitsA - bitsB; 
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}