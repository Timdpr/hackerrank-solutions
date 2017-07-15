package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long result, max, min;
        result = max = min = in.nextLong();
        
        for (int i = 1; i < 5; i++) {
            long newLong = in.nextLong();
            if (newLong < min) {
                min = newLong;
            }
            if (newLong > max) {
                max = newLong;
            }
            result += newLong;
        }
        in.close();
        System.out.println((result - max) + " " + (result - min)); 
    }
}
