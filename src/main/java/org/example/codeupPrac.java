package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

class Main {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(s[i]);
            if (a%2==0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}