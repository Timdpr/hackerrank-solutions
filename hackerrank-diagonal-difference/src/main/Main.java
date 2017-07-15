package main;

import java.util.Scanner;

/** 
 * @author Timdpr
 * 
 * Computes 'diagonal difference' as per 
 * hackerrank.com/challenges/diagonal-difference/problem
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rightD = 0;
        int leftD = 0;
        
        /* 
        Uses arrays, inefficient to store data you only access once!
        
        in.nextLine();
        for (int i=n; i>0; i--) {
            String[] lineList = in.nextLine().split(" ");
            rightDiag += Integer.parseInt(lineList[n-i]);
            leftDiag += Integer.parseInt(lineList[i-1]);
        }
        */
        
        // Much better, uses clever conditional checks as elements are scanned:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int curInput = in.nextInt();
                if(i == j) { // Finds 00, 11, 22
                    rightD += curInput;
                }
                if ((i+j) == (n-1)) { // Finds 22, 11, 00
                    leftD += curInput;
                }
            }
        }
        in.close();
        System.out.println(Math.abs(rightD - leftD));    
    }
}