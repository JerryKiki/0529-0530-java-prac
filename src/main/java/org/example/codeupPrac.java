package org.example;
import java.util.Scanner;

class codeupPrac {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        int first = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        int third = Integer.parseInt(arr[2]);
        double avg = (double) (first+second+third)/3;
        System.out.printf("%d\n", first + second + third);
        System.out.printf("%.1f\n", avg);
    }
}
