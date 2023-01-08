import java.util.*;
import java.util.stream.Collectors;

public class Starbucks {

    public static void main(String[] args) {

        int[] arr = {1,1,3,4,4,4};
        int[] arr2 = {1,2,2,2,5,5,5,8};
        int[] arr3 = {1,1,1,1,3,3,4,4,4,4,4};
        int[] arr4 = {10,10,10};


//        System.out.println(solution(arr));
//        System.out.println(solution2(arr));
        System.out.println(solution3(arr));
        System.out.println(solution3(arr2));
        System.out.println(solution3(arr3));
        System.out.println(solution3(arr4));

    }

    static public int solution(int[] A) {

        // check corner cases
        if (A == null || A.length == 0) {
            return 1;
        }

        // Each element of array A is an integer within the range [−1,000,000..1,000,000].
        // We are going to keep track only of positive numbers we have visited
        boolean[] visitedPositives = new boolean[1000000 + 1]; // initialized by the JVM with false

        // traverse all target array and keep track of positive integers
        for (int i = 0, c = A.length; i < c; ++i) {

            // get current number
            int current = A[i];

            // keep track of visited positive numbers
            if (current > 0) {
                visitedPositives[current] = true;
            }
        }

        // traverse visited positive numbers array and keep the index > 0 of the first position marked as false
        for (int i = 1, c = visitedPositives.length; i < c; i++) {
            if (!visitedPositives[i]) {
                return i + 1;
            }
        }

        // fallback: all positive numbers exist in the A array
        return 10000001;
    }
    static public int solution2(int[] data) {

        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (dataMap.containsKey(data[i])) {
                dataMap.put(data[i], dataMap.get(data[i]) + 1);
            } else {
                dataMap.put(data[i], 1);
            }
        }

        System.out.println("Map - " + dataMap);

        int[] minOperations = {0};
        dataMap.forEach((digit, frequency) -> {
            if (digit != frequency) {
                if (digit < frequency) {
                    minOperations[0] += (frequency - digit);
                } else if (digit > frequency && (digit - frequency) <= minOperations[0]) {
                    minOperations[0] += digit - frequency;
                } else {
                    minOperations[0] += frequency;
                }
            }
            System.out.println(digit + "  " + frequency + "  " + minOperations[0]);
        });
        return minOperations[0];
    }
        static public int solution3(int[] data) {
            int numberOfMoves = 0;
            List<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < data.length; i++) {
                arrayList.add(data[i]);
            }
            HashSet<Integer> uniques = new HashSet<>();
            for (int i = 0; i < data.length; i++) {
                uniques.add(data[i]);
            }
//            List<Integer> uniques = arrayList.stream().distinct().collect(Collectors.toList());

            for (Integer e : uniques) {
                int ocurrences = (int) arrayList.stream().filter(o -> o == e).count();
                numberOfMoves += Integer.min(Math.abs(e - ocurrences), ocurrences);
            }
            return numberOfMoves;
    }
}