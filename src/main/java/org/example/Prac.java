package org.example;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        //코드업 문제 푸는 중... 계속 수정됨
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int hex = Integer.parseInt(input, 16);
        System.out.printf("%o", hex);


//        /* 필기
//        //int[] arr = new 설계도;
//        int[] arr = new int[3];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        // arr[3] = 40; : 설계도를 통해 만들어준 공간이 3칸이므로 4번째 정수는 들어가지 않는다.
//        */
//
//        //문제1. 배열 안의 값의 총 합, 평균 출력
//        int a = 10;
//
//        int[] arr = new int[4];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//
//       // int sum = arr[0] + arr[1] + arr[2];
//
//        //합, 평균 단순출력
//        //System.out.println("총합 : " + sum);
//        //System.out.printf("총합 : %d\n", sum);
//        //System.out.println("평균 : " + sum / 3);
//        //System.out.printf("평균 : %d\n", sum / 3);
//
//        //for문 활용
//        int arrSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arrSum = arrSum + arr[i];
//        }
//
//        int arrAvg = arrSum / arr.length;
//        System.out.println("합 : " + arrSum);
//        System.out.printf("합 : %d\n", arrSum );
//        System.out.println("평균 : " + arrAvg);
//        System.out.printf("평균 : %d\n", arrAvg );
    }
}
