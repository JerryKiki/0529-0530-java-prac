package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

class Main {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        System.out.println(Math.min(Math.min(a, b), c));
    }
}