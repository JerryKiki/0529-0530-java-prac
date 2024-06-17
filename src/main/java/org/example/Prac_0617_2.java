package org.example;

public class Prac_0617_2 {
    public static void main(String[] args) {
        //문제1 : 일반변수에 값 할당과정 설명
        // 정수 값만을 가질 수 있는 int 타입의 변수 x를 선언한다.
        int x;
        //변수 x에 20이라는 값을 넣겠다.
        x = 20;

        //문제2 : 소수인지를 판별하는 함수를 만들어주세요.
        boolean rs = Math2.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(7);
        System.out.println("7은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(13);
        System.out.println("13은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(15);
        System.out.println("15은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(23);
        System.out.println("23은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(31);
        System.out.println("31은(는) 소수인가? : " + rs);
        rs = Math2.isPrimeNumber(44);
        System.out.println("44은(는) 소수인가? : " + rs);

        //문제3 : 1부터 n까지 소수의 갯수를 출력하는 함수를 만들어주세요.
        int result = one_to_n_numbers_count(10); //4
        System.out.println("rs : " + result);

        result = one_to_n_numbers_count(13); //6
        System.out.println("rs : " + result);

        result = one_to_n_numbers_count(21); //8
        System.out.println("rs : " + result);

        result = one_to_n_numbers_count(23); //9
        System.out.println("rs : " + result);

        result = one_to_n_numbers_count(30); //10
        System.out.println("rs : " + result);

        result = one_to_n_numbers_count(100); //25
        System.out.println("rs : " + result);

        //문제4 : 1부터 n까지 소수끼리의 합
        result = one_to_n_numbers_sum(10); //17
        System.out.println("rs : " + result);
    }

    //소수 개수 구하기
    static int one_to_n_numbers_count(int n) {
        //방법 1. 약수 직접 찾아서 넣어주기
//        int rsCount = 0;
//
//        for (int i = 2; i <= n; i++) {
//            int divisor = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    divisor++;
//                }
//            }
//            if (divisor == 2) {
//                rsCount++;
//            }
//        }
//        return rsCount;

        //방법2. 아래 만든거 써먹기! 함수 안에서 함수 호출.
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (Math2.isPrimeNumber(i)) {
                count++;
            }
        }
        return count;
    }

    //소수끼리의 합 구하기
    static int one_to_n_numbers_sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (Math2.isPrimeNumber(i)) {
                sum+=i;
            }
        }
        return sum;
    }
}


class Math2 {
    public static boolean isPrimeNumber(int n) {

        //약수가 2개인지 체크
        //boolean isPrime;
        int divisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor++;
            }
        }
        // 밑에 리턴부분 코드 줄이기
        return divisor == 2;
    }
}

//기존꺼
//        if (divisor == 2) {
//            isPrime = true;
//        }
//
//        return isPrime;
//        }
//    }

//프로그램이 더 간단해지는 버전 - 1과 n을 제외하고, 2 ~ n-1 중에 약수가 하나라도 있으면 false
//        if (n <= 1) {
//        return false;
//        }
//
//        for (int i = 2; i < n; i++) {
//        if (n % i == 0) {
//        return false;
//        }
//        }
//
//        return true;
//        }
//        }

//약수의 합이 n+1일때 true해줘도 됨.

