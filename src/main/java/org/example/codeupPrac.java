package org.example;

import java.util.Scanner;

import static java.lang.Integer.*;

class Main {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("minus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("plus");
            if (a % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}