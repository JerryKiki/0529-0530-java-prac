package org.example;

//import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        //0604 함수의 형태, 매개변수, return의 이해 - 함수의 기본 사용법
        int rs = Calculator.합(10, 20);
        System.out.println(rs);

        boolean rs2 = Calculator.is_a_bigger_than_b(10, 20);
        System.out.println(rs2);
        rs2 = Calculator.is_a_bigger_than_b(240, 20);
        System.out.println(rs2);
        rs2 = Calculator.is_a_bigger_than_b(20, 20);
        System.out.println(rs2);
    }
}
class Calculator {
    static int 합(int a, int b) {
        return a+b;
    }
    static boolean is_a_bigger_than_b(int a, int b) {
//        if (a > b) {
//            return true;
//        }
//        return false;
        return a > b;
    }
}
        /*계산기.합(10, 20);
        계산기.합(20, 50);
        계산기.합(40, 40);
        계산기.합(9);
        int a = 계산기.합리턴(90, 10);
        System.out.println(a);
        int b = 계산기.고정값리턴();
        System.out.println(b);
    }
}

class 계산기 {
    static int 합리턴(int c, int d) {
        return c;
    }
    static int 고정값리턴(){
        return 10;
    }
    static void 합(int c) {
        System.out.println(c);
    }
    static void 합(int a, int b) {
        System.out.println(a + b);
    }
}*/
// 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.
//        자동차.달리다();
//    }
//}
//
//class 자동차 {
//    static void 달리다() {
//        System.out.println("자동차가 달립니다.");
//    }
//}

        /*//0603
        myObject a = new myObject();
        a.num1 = 100;
        a.num2 = 200;
        a.b = true;
        a.d = 170.3;
        a.s = "출력 끝";

        System.out.println(a.num1);
        System.out.println(a.num2);
        System.out.println(a.b);
        System.out.println(a.d);
        System.out.println(a.s);*/

/* class myObject {
    int num1;
    int num2;
    boolean b;
    double d;
    String s;
}*/





        /*boolean[] arr1 = new boolean[]{true, false, true};
        double[] arr2 = new double[]{3.14, 7.77, 11.11};
        int[] arr3 = new int[10];

        //i를 여러번 쓸 수 있는 이유 : for문 안에서 생성되어 for문이 끝나면 삭제되기 때문에
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr1[%d]의 값 : %s\n", i, arr1[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("arr2[%d]의 값 : %.2f\n", i, arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.printf("arr3[%d]의 값 : %d\n", i, arr3[i]);
        }*/



        /*
        //선언방식 추가    int[] arr = new int[]{10, 20, 30};
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += arr[i];
        }
        System.out.println("sum : " + sum);
        */


//        /* 0531 필기
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
