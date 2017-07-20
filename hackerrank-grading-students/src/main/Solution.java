package main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i=0; i<n; i++) {
            int grade = in.nextInt();
            System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + 5 - (grade % 5));
            
            /* Initial solution, was distilled into above 'one-liner'
             * using ternary operator:
             *  
             *  if (grade >= 38) {
             *      if (grade % 5 > 2) {
             *          grade += (5 - grade % 5);
             *      }
             *  }
             *  System.out.println(grade);
             *  
             */   
        }
        in.close();
    }
}
