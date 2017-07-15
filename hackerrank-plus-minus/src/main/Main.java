package main;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Timdpr
 * 
 * Computes fractions of an integer array's +ve, -ve and '0' elements
 * hackerrank.com/challenges/plus-minus/problem
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos = 0.0;
        double neg = 0.0;
        double zero = 0.0;
        
        for (int i=0; i<n; i++) {
            int curInput = in.nextInt();
            if (curInput > 0) {
                pos++;
            } else if (curInput < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        in.close();
        System.out.println(getPercent(n, pos));
        System.out.println(getPercent(n, neg));
        System.out.println(getPercent(n, zero));
    }
    
    public static String getPercent(int n, double count) {
        DecimalFormat df = new DecimalFormat("#.######");
        return df.format(count/n);
    }
}
