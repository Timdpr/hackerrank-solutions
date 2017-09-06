package main;

import java.util.ArrayList;
import java.util.Arrays;
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

        int n = 0; // TODO: create method of enumerating all permutations of N etc...if they are all unique, good!

        if (n >= 65 && n <= 90) { // if n in A-Z range
            results[i] = ((char) n);
            i++;
        }
        Arrays.sort(results);
        return results;
    }

    public static void printList(char[] list) {
        for (char c : list) {
            System.out.print(c);
        }
        System.out.println();
    }
}