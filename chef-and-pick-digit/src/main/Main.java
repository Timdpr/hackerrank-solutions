package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {

            int N = in.nextInt();

            printList(checkNsPerms(N));
        }
    }

    public static char[] checkNsPerms(int N) {
        char[] results = new char[N*N];
        int i = 0;

        if (N < 17) {
            return results;
        }

        int[] NPerms = getNPerms(N); // TODO: create method of enumerating all permutations of N etc...if they are all unique, good!

        for (int n : NPerms) {
            if (n >= 65 && n <= 90) { // if n in A-Z range
                results[i] = ((char) n);
                i++;
            }
            Arrays.sort(results);
            return results;
        }
    }

    private static int[] getNPerms(int N) {
        HashSet<Integer> result = new HashSet<>();
        String NString = Integer.toString(N);
        int i = 0;
        for (char c : NString) {

        }
    }

    public static void printList(char[] list) {
        for (char c : list) {
            System.out.print(c);
        }
        System.out.println();
    }
}
