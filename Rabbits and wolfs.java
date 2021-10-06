package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int rabbits = 11;
        int wolfs = 2;
        int dead_rabbits = 0;
        for (int i = 1; i < n+1; i++)
        {
            if (rabbits < 0)
                rabbits = 0;
            if (rabbits > 19000000)
                rabbits = 19000000;
            if (i%2 == 0)
            {
                rabbits = rabbits - (10 * wolfs);
                dead_rabbits = dead_rabbits + (10 * wolfs);
            }
            else
            {
                rabbits = rabbits * 3;
            }
            while(dead_rabbits >= 70)
            {
                dead_rabbits = dead_rabbits - 70;
                wolfs += 1;
            }
        }
        System.out.println(rabbits);
        System.out.println(wolfs);
    }
}