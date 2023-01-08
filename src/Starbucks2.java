import java.util.HashMap;

public class Starbucks2 {


    public static void main(String[] args) {

        int[] arr = {51, 71, 17, 42};
        int[] arr2 = {42,33,60};
        int[] arr3 = {51,32,43};

        System.out.println(findMax(arr));;
        System.out.println(findMax(arr2));;
        System.out.println(findMax(arr3));;

    }


    // Function to find maximum sum pair
// having the same sum of digits
    static int findMax(int[] arr) {

        // Map to store the sum of digits
        // in a number as the key and
        // the maximum number having
        // that sum of digits as the value
        int n = arr.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = -1, pairi = 0, pairj = 0;
        for (int i = 0; i < n; i++) {

            // Store the current sum of digits
            // of the number in temp
            int temp = 0;
            int tempArr = arr[i];

            while (tempArr > 0) {
                temp += (tempArr % 10);
                tempArr /= 10;
            }


            // If temp is already present
            // in the map then update
            // ans if the sum is greater
            // than the existing value
            if (mp.containsKey(temp)) {
                if (arr[i] + mp.get(temp) > ans) {
                    pairi = arr[i];
                    pairj = mp.get(temp);
                    ans = pairi + pairj;
                }
                mp.put(temp, Math.max(arr[i], mp.get(temp)));
            } else
                // Change the value in the map
                mp.put(temp, arr[i]);

        }

        return ans;
    }


}
