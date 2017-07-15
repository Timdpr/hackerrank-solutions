package main;

import java.util.Scanner;

/** 
 * @author Timdpr
 * 
 * Converts times as per hackerrank.com/challenges/time-conversion
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if (s.contains("PM")) {
            String hour = Integer.parseInt(s.substring(0,2))+12 + "";
            String result = hour + s.substring(2,8);
            if (result.startsWith("24")) {
                System.out.println("12" + result.substring(2));
            } else {
                System.out.println(result);
            }

        } else if (s.startsWith("12")) {
            System.out.println("00" + s.substring(2,8));

        } else {
            System.out.println(s.substring(0, 8));        
        }
        in.close();
    }
}
