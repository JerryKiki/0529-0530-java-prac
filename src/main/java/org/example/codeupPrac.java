package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

class codeupPrac {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int time = input/60;
        int sec = input%60;
        System.out.printf("%d %d\n", time, sec);
    }
}
