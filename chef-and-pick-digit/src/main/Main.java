package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        for (int testCase = 0; testCase < testCases; testCase++) {
            String N = in.nextLine(); // Use string - actual (often huge) numbers need not be read!
            System.out.println(getLetters(N));
        }
    }

    private static String getLetters(String N) {
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> NPerms = getNPerms(N);

        for (int n : NPerms) {
            if (n >= 65 && n <= 90) { // if n in A-Z range
                result.append((char) n);
            }
        }
        return result.toString();
    }

    private static ArrayList<Integer> getNPerms(String N) {
        ArrayList<Integer> NNumbers = new ArrayList<>();
        ArrayList<Integer> NPerms = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            NNumbers.add(Character.getNumericValue(N.charAt(i)));
        }

        Collections.sort(NNumbers);

        for (int j=0; j<NNumbers.size(); j++) {
            if (NNumbers.get(j) >= 6) {
                for (int k=0; k<NNumbers.size(); k++) {
                    if ( (k != j) && (!NPerms.contains(NNumbers.get(j) * 10 + NNumbers.get(k))) ) {
                        NPerms.add(NNumbers.get(j) * 10 + NNumbers.get(k)); } } }
        }
        return NPerms;
    }
}
