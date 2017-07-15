package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0, count = 0;
        
        for (int i=0; i<n; i++) {
            int temp = in.nextInt();
            if (temp > max) {
                max = temp;
                count = 1;
            } else if (temp == max) {
                count++;
            }
        }
        System.out.println(count);
        
        
        
        in.close();
    }
}
