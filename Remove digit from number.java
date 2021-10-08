package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int a = 0;
        for (int i = 10; i <= n*i; i *= 10)
        {
            if (n % 10 != b) {
                a = a + (n%10)*i;
            }
            else i /=10;
            n /= 10;
        }
        a /= 10;
        System.out.println(a);
    }
}
