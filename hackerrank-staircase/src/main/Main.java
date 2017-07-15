package main;

import java.util.Collections;
import java.util.Scanner;

/** 
 * @author Timdpr
 * 
 * Creates a staircase as per hackerrank.com/challenges/staircase
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        
        for (int i = 1; i <= size; i++) {
            String whites = String.join("", Collections.nCopies(size-i, " "));
            String hashes = String.join("", Collections.nCopies(i, "#"));
            System.out.println(whites + hashes);
        }
    }
}