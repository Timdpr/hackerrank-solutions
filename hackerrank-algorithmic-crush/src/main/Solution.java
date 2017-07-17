package main;

import java.util.Scanner;

/**
 * Completes hackerrank.com/challenges/crush in O(n+m) time
 * rather than O(nm) time by using an endpoint array!
 * 
 * @author Timdpr
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int listSize = in.nextInt();
        int operations = in.nextInt();
        long[] endpointArray = new long[listSize+1];
        // indexes are inclusive so 2nd endpoint needs to be right of index

        for (int i=0; i<operations; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            endpointArray[a-1] += k;
            endpointArray[b] -= k;
        }        
        long total = 0;
        long max = 0;
        for (int i=0; i<listSize+1; i++) {
            total += endpointArray[i];
            if (total > max) {
                max = total;
            }
        }
        System.out.println(max);
        in.close();
    }
}
