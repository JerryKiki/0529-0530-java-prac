package org.example;

import java.util.Scanner;

class codeupPrac {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if (a == 1 && b == 1){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
