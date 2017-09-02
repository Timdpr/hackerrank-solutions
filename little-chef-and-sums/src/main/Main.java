package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            int arraySize = in.nextInt();

            // Create array:
            int[] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                array[i] += in.nextInt();
            }

            // Calculate minimum sum and minimum index:
            int minimumSum = prefixSum(array, 1) + suffixSum(array, 1);
            int leastIndex = 1;
            for (int i = 1; i <= arraySize; i++) {
                int sum = prefixSum(array, i) + suffixSum(array, i);
                if (sum < minimumSum) {
                    leastIndex = i;
                    minimumSum = sum;
                }
            }
            System.out.println(leastIndex);
        }
    }

    private static int prefixSum(int[] array, int i) {
        int answer = 0;
        for (int j = 0; j < i; j++) {
            answer += array[j];
        }
        return answer;
    }

    private static int suffixSum(int[] array, int i) {
        int answer = 0;
        for (int j = i-1; j < array.length; j++) {
            answer += array[j];
        }
        return answer;
    }

    /* This is slower dammit!
    private static int doSums(int[] array, int i) {
        int answer = 0;

        for (int j = 1; j <= array.length; j++) {
            if (j < i) {
                answer += array[j - 1];
            } else if (j > i) {
                answer += array[j - 1];
            } else {
                answer += (array[j - 1] * 2);
            }
        }
        return answer;
    }
    */
}
