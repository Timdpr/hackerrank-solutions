package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 
 * Prints # of occurrences of query strings in collection of n strings
 * as per hackerrank.com/challenges/sparse-arrays
 * 
 * @author Timdpr
 */

public class Solution {
    private static Map<String, Integer> stringMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        for (int i=0; i<n; i++) {
            String temp = in.nextLine();
            if (stringMap.containsKey(temp)) {
                stringMap.put(temp, stringMap.get(temp)+1);
            } else {
                stringMap.put(temp, 1);
            }
        }
        int q = Integer.parseInt(in.nextLine());
        for (int i=0; i<q; i++) {
            String temp = in.nextLine();
            if (stringMap.get(temp) == null) {
                System.out.println(0);
            } else {
                System.out.println(stringMap.get(temp));
            }
        }
        in.close();
    }
}
