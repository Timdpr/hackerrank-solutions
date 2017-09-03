package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int t = 0; t < testCases; t++) {

            int n = in.nextInt();

            int[] array = new int[n];
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    array[i-1] = i+1;
                } else {
                    array[i-1] = i-1;
                }
            }

            if (n % 2 != 0) {
                int temp = array[n - 1];
                array[n - 1] = array[n - 2];
                array[n - 2] = temp - 1;
            }

            System.out.println(Arrays.toString(array)
                    .replace("[","")
                    .replace("]","")
                    .replace(",","")
            );
        }
    }
}
