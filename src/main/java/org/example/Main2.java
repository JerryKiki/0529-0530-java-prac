package org.example;
import java.util.Scanner;

// 문제 : `안녕하세요.`를 10번 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        //ver.1
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        System.out.println("안녕하세요.");
//        //ver.2
//        for (int i = 0; i < 10; i++) {
//            System.out.println("안녕하세요.");
//        }
//    }

// 문제 : `안녕하세요.`를 10번 출력해주세요.
// 조건 : System.out.println은 딱 한번만 사용 가능

//class Main {
//    public static void main(String[] args) {
//        System.out.println("안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.");
//    }

// 문제 : `안녕하세요.`를 10번 출력해주세요.
// 조건 : System.out.println은 딱 한번만 사용 가능
// 조건 : \를 활용해서 줄바꿈 해주세요.
// 힌트 : \n 은 줄바꿈을 의미합니다.

//class Main {
//    public static void main(String[] args) {
//        // `\` <= 백스페이스 좌측 키
//        System.out.println("안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n");
//    }
//}

// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

//class Main {
//    public static void main(String[] args) {
//        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
//        // `int` => a라는 공간에는 정수만 담을 수 있다.
//        // `;` => 문장이 끝남을 알린다.
//        int a;
//        a = 5;
//
//        System.out.println(a);
//        System.out.println(a + 10);
//
//        int b = 10;
//
//        // `+` => 문장과 문자을 합친다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        // 여기서 부터
//        a = 10;
//        b = 5;
//        // 여기까지 수정 가능
//
//        System.out.println("a : " + a);
//        // 출력 : a : 10
//        System.out.println("b : " + b);
//        // 출력 :  b : 5
//    }
//}

// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지

//class Main {
//    public static void main(String[] args) {
//        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
//        // `int` => a라는 공간에는 정수만 담을 수 있다.
//        // `;` => 문장이 끝남을 알린다.
//        int a;
//        a = 5;
//
//        System.out.println(a);
//        System.out.println(a + 10);
//
//        int b = 10;
//
//        // `+` => 문장과 문자을 합친다.
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//
//        // 여기서 부터
//        int c = a;
//        a = b;
//        b = c;
//        // 여기까지 수정 가능
//        // 밸류스왑의 가장 간단한 방식 : 밸류스왑에 대해 혼자 공부해보기
//        // a = 5, b = 10, c = 15, d = 20일때, 한칸씩 미뤄보기
//
//        System.out.println("a : " + a);
//        // 출력 : a : 10
//        System.out.println("b : " + b);
//        // 출력 :  b : 5
//    }
//}

//class Main{
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        int c = 15;
//        int d = 20;
//
//        System.out.println("a : " + a);
//        System.out.println("b : " + b);
//        System.out.println("c : " + c);
//        System.out.println("d : " + d + "\n");
//
//        int i = a; //i=5
//        int j = b; //j=10
//        int k = c; //k=15
//        int l = d; //l=20
//
//        a = l;
//        b = i;
//        c = j;
//        d = k;
//
//        System.out.println("a : " + a); // 20
//        System.out.println("b : " + b); // 5
//        System.out.println("c : " + c); // 10
//        System.out.println("d : " + d); // 15
//    }
//}

// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

//class Main {
//    public static void main(String[] args) {
//        if ( true ) {
//            System.out.println("참");
//        }
//
//        if ( false ) {
//            System.out.println("거짓");
//        }
//
//        int a = 10;
//
//        // `==` => 같다.
//        if ( a == 10 ) {
//            System.out.println("참");
//        }
//
//        // `!=` => 같지 않다.
//        if ( a != 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( a > 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( a >= 10 ) {
//            System.out.println("참");
//        }
//
//        int b = 10;
//
//        if ( a == b ) {
//            System.out.println("참");
//        }
//
//        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
//        boolean c = a != b;
//
//        if ( c ) {
//            System.out.println("거짓");
//        }
//
//        if ( c == false ) {
//            System.out.println("참");
//        }
//
//        // `!` => 반전
//        if ( !c ) {
//            System.out.println("참");
//        }
//
//        // `!` => 반전
//        if ( !(!c) ) {
//            System.out.println("거짓");
//        }
//
//        boolean d = true;
//
//        if ( c != d ) {
//            System.out.println("참");
//        }
//
//        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( 10 != 10 || 10 < 2 ) {
//            System.out.println("거짓");
//        }
//
//    }
//}

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

//class Main {
//    public static void main(String[] args) {
//        int age = 59; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//        // 구현시작
//        //1.
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.1");
//        } else {
//            System.out.println("할인 대상이 아닙니다.1");
//        }
//
//        //2.
//        if (age < 60) {
//            if (age <= 19) {
//                System.out.println("할인 대상입니다.2");
//            } else {
//                System.out.println("할인 대상이 아닙니다.2");
//            }
//        } else {
//            System.out.println("할인 대상입니다.2");
//        }
//
//
//        //3.
//        if (age > 19) {
//            if (age < 60) {
//                System.out.println("할인 대상이 아닙니다.3");
//            } else {
//                System.out.println("할인 대상입니다.3");
//            }
//        } else {
//            System.out.println("할인 대상입니다.3");
//        }
//
//        //4.
//        if (age < 60 && age > 19) {
//            System.out.println("할인 대상이 아닙니다.4");
//        }
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.4");
//        }
//
//        //5.
//        if (age < 60 && age > 19) {
//            System.out.println("할인 대상이 아닙니다.5");
//        } else {
//            System.out.println("할인 대상입니다.5");
//        }
//
//        //6.
//        if (age < 60 && age > 19) {
//            System.out.println("할인 대상이 아닙니다.6");
//        } else if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.6");
//        }
//
//        //7.
//        if (age <= 19 || age >= 60) {
//            System.out.println("할인 대상입니다.7");
//        } else if (age < 60 && age > 19) {
//            System.out.println("할인 대상이 아닙니다.7");
//        }
//
//        //8.
//        if (age >= 60 || age <= 19) {
//            System.out.println("할인 대상입니다.8");
//        } else if (age > 19) {
//            if (age < 60) {
//                System.out.println("할인 대상이 아닙니다.8");
//            } else {
//                System.out.println("할인 대상입니다.8");
//            }
//        }
//
//        //9.
//        if (age < 60) {
//            if (age <= 19) {
//                System.out.println("할인 대상입니다.9");
//            } else if (age > 19) {
//                System.out.println("할인 대상이 아닙니다.9");
//            }
//        } else {
//            System.out.println("할인 대상입니다.9");
//        }
//
//        //10.
//        if (age <= 19) {
//            System.out.println("할인 대상입니다.10");
//        } else if (age >= 60) {
//            System.out.println("할인 대상입니다.10");
//        } else {
//            System.out.println("할인 대상이 아닙니다.10");
//        }
//
//        //짧을수록 좋다.
//
//        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
//    }
//}

// 문제 : 아래와 같이 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        int i = 8;
//        System.out.println("8 * 1 = " + i);
//        i += 8;
//        System.out.println("8 * 2 = " + i);
//        i += 8;
//        System.out.println("8 * 3 = " + i);
//        i += 8;
//        System.out.println("8 * 4 = " + i);
//        i += 8;
//        System.out.println("8 * 5 = " + i);
//        i += 8;
//        System.out.println("8 * 6 = " + i);
//        i += 8;
//        System.out.println("8 * 7 = " + i);
//        i += 8;
//        System.out.println("8 * 8 = " + i);
//        i += 8;
//        System.out.println("8 * 9 = " + i);
//
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 첫번째로 곱하는 수가 변하게 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        System.out.println(dan + " * 1 = 8");
//        System.out.println(dan + " * 2 = 16");
//        System.out.println(dan + " * 3 = 24");
//        System.out.println(dan + " * 4 = 32");
//        System.out.println(dan + " * 5 = 40");
//        System.out.println(dan + " * 6 = 48");
//        System.out.println(dan + " * 7 = 56");
//        System.out.println(dan + " * 8 = 64");
//        System.out.println(dan + " * 9 = 72");
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 그에 해당하는 구구단이 출력 되도록 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        System.out.println(dan + " * 1 = " + dan);
//        System.out.println(dan + " * 2 = " + dan*2);
//        System.out.println(dan + " * 3 = " + dan*3);
//        System.out.println(dan + " * 4 = " + dan*4);
//        System.out.println(dan + " * 5 = " + dan*5);
//        System.out.println(dan + " * 6 = " + dan*6);
//        System.out.println(dan + " * 7 = " + dan*7);
//        System.out.println(dan + " * 8 = " + dan*8);
//        System.out.println(dan + " * 9 = " + dan*9);
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        i++;
//        System.out.println(dan + " * " + i + " = " + dan * i);
//        // 수정가능지역 끝
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        // 수정가능지역 시작
//        int i = 1;
//
//        while (i >= 1 && i <= 1000) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }
//
//        // 수정가능지역 끝
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        //문제1. 단을 * 1000까지 출력해주세요.
//        System.out.println("===문제1===");
//        int dan = 8;
//
//        int i = 1;
//
//        while (i <= 1000) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i++;
//        }
//
//        //문제2. 1부터 5까지 출력해주세요.
//        System.out.println("\n===문제2===");
//        int j = 1;
//
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        //문제3. -100부터 25까지 출력해주세요.
//        System.out.println("\n===문제3===");
//        int k = -100;
//
//        while (k <= 25)
//        {
//            System.out.println(k);
//            k++;
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        //문제4. 구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.
//        System.out.println("===문제4===");
//        int dan = 8;
//
//        int i = 1000;
//
//        while (i >= 1) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//            i--;
//        }
//
//        //문제5. 단을 `* 1000`부터 `* -500`까지 출력해주세요.
//        System.out.println("\n===문제5===");
//        int j = 1000;
//
//        while (j >= -500) {
//            System.out.println(dan + " * " + j + " = " + dan * j);
//            j--;
//        }
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        // 문제6. 1부터 5까지의 합을 더한 결과를 출력해주세요.
//        System.out.println("===문제6===");
//        int i = 1;
//        int j = 0;
//
//        while (i <= 5) {
//            j = j + i;
//            i++;
//        }
//        System.out.println(j);
//
//        //문제7. -100부터 25까지의 합을 출력해주세요.
//        System.out.println("\n===문제7===");
//        int k = -100;
//        int l = 0;
//
//        while (k <= 25) {
//            l = l + k;
//            k++;
//        }
//        System.out.println(l);
//
//        //문제8. 1부터 3까지 출력하는 작업을 10번 해주세요.
//        //조건 : 이중 while문 사용
//        System.out.println("\n===문제8===");
//        int m = 1;
//        //int n = 1;
//
//        while(m <= 10)
//        {
//            int n = 1;
//            while(n <= 3) {
//                System.out.println(n);
//                n++;
//            }
//            System.out.printf("%d번째 출력\n", m);
//            m++;
//        }
//    }
//}

//for문으로 다시 풀기

//class Main {
//    public static void main(String[] args) {
//
//        //문제1. 단을 * 1000까지 출력해주세요.
//        System.out.println("===문제1===");
//        int dan = 8;
//
//        for(int i = 1; i <=1000; i++) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        //문제2. 1부터 5까지 출력해주세요.
//        System.out.println("\n===문제2===");
//
//        for(int i = 1; i <=5; i++){
//            System.out.println(i);
//        }
//
//        //문제3. -100부터 25까지 출력해주세요.
//        System.out.println("\n===문제3===");
//        int k = -100;
//
//        for(int i = -100; i <=25; i++) {
//            System.out.println(i);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        //문제4. 구구단 8단을 출력해주세요. 1000부터 1까지 곱해주세요.
//        System.out.println("===문제4===");
//        int dan = 8;
//
//        for (int i = 1000; i >= 1; i--) {
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        //문제5. 단을 `* 1000`부터 `* -500`까지 출력해주세요.
//        System.out.println("\n===문제5===");
//
//        for (int i = 1000; i >= -500; i--) {
//            System.out.println(dan + " * " + i + "=" + dan * i);
//        }
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        // 문제6. 1부터 5까지의 합을 더한 결과를 출력해주세요.
//        System.out.println("===문제6===");
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        //문제7. -100부터 25까지의 합을 출력해주세요.
//        System.out.println("\n===문제7===");
//
//        sum = 0;
//        for (int i = -100; i <= 25; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        //문제8. 1부터 3까지 출력하는 작업을 10번 해주세요.
//        //조건 : 이중 for문 사용
//        System.out.println("\n===문제8===");
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(j);
//            }
//            System.out.printf("%d번째 출력\n", i);
//        }
//
//        System.out.println("\n===문제9===");
//        //문제9. 아래의 코드의 결과가 왜 콘솔과 같이 표시되는지 순차적으로, 한글로 서술하시오.
//        int rows = 5; // 큰 반복문에서 종료조건으로 기능한다.
//
//        for (int i = 1; i <= rows; i++) { // 큰 반복문 : i가 rows의 값이 5 이하인지 여부가 참이라면 i를 1씩 증가해가면서 반복한다.
//            //즉, 1회차 : 1번, 2회차 : 2번, 3회차 : 3번, 4회차 : 4번, 5회차 : 5번, 6회차 : 반복문을 빠져나간다.
//            for (int k = 1; k <= i; k++) { // 작은 반복문 : k가 현재 i의 값을 초과할 때까지 k를 1씩 증가해가면서 반복한다.
//                //즉, 1회차 : i의 값이 1(큰 반복문의 실행 회차가 1)이므로 실행과 k값 증가를 1번 반복 후 k값이 2가 되어 반복문 탈출, i의 값이 2이므로 2번...,
//                //i의 값이 5이므로 실행과 k값 증가를 5번 반복 후 k값이 6이 되어 반복문 탈출
//                //큰 반복문이 5번 반복된 후, i의 값이 6이 되었을 때는 큰 반복문 자체가 실행되지 않으므로 실행되지 않는다.
//                System.out.print("* "); // 위에서 적은 회차별로, 작은 반복문이 반복되는 횟수만큼 이 줄을 실행한다.
//                //'print'를 사용하였으므로 줄바꿈 없이 반복되는 횟수만큼 한 줄에 출력된다.
//            }
//            System.out.println(); // 큰 반복문이 반복되는 횟수만큼 이 줄을 실행한다.
//            //작은 반복문의 실행 후, println으로 엔터값을 출력해 줄을 바꿔준다.
//            //이때 출력되는 엔터값은 작은 반복문에서 반복된 마지막 * 옆에 붙어서 출력되므로 끝에서 줄바꿈이 된다.
//        }
//    }
//}

//스캐너 사용하기

class Main2 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in); // Scanner는 참조타입 변수이므로 클래스를 참조해와야한다.
        Scanner inputLine = new Scanner(System.in);
        //JDK = Java Development Kit = 자바 개발 도구 (개발할 때 도움을 주는 애들) - 라이브러리 안에 들어있다.

        int num = inputNum.nextInt();
        System.out.println(num);

        String line = inputLine.nextLine();
        System.out.println(line);
        //사용자가 입력한 값을 받아서 변수값으로 사용한다.
    }
}




