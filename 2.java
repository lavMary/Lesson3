package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for (int i=1; i <= n; i++) {
            c += i;
        }
        System.out.println(c);
    }
}
