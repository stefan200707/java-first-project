package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        for (int i = 0; i < 4; i++){
            if (a >= b && a >= c && a >= d) {
                System.out.println(a);
                break;
            }
            if (b >= a && b >= c && b >= d) {
                System.out.println(b);
                break;
            }
            if (c >= a && c >= b && c >= d) {
                System.out.println(c);
                break;
            }
            if (d >= a && d >= b && d >= c) {
                System.out.println(d);
                break;
            }
        }
    }
}