package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int b = 0;
        int fid_num1 = 1;
        int fid_num2 = 1;
        int summa = 0;
        while (b < a - 2){
            summa = fid_num1 + fid_num2;
            fid_num1 = fid_num2;
            fid_num2 = summa;
            b++;
        }
        System.out.println(fid_num2);
    }
}