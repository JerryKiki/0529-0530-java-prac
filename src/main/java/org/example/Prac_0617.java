package org.example;

import java.awt.*;
import java.util.Arrays;

public class Prac_0617 {
    public static void main(String[] args) {

        //String(문자열) 참조타입 변수 msg에 greet 함수 실행 결과를 넣는다.
        //이때, greet함수의 실행 결과는 아래 작성된 greet 함수의 매개변수 name에 인자 "Jin"을 넣어준 리턴 값 "Hello, Jin!"이다.
        String msg = greet("Jin");
        //msg 변수의 값인 문자열 "Hello, Jin!"을 출력한다.
        System.out.println(msg);

        //Point 참조타입 변수 point에 creatPoint 함수 실행 결과를 넣는다.
        //Point는 자바에서 제공하는 Point 클래스이다.
        //이때, creatPoint 함수 실행 결과는 아래 작성된 creatPoint 함수의 매개변수 x, y에 인자 5, 10을 각각 넣어준 리턴값 Point(5, 10)이다.
        //Point(5, 10)은 객체이므로 결과적으로는 이 객체를 컨트롤할 수 있는 리모콘이 들어간다.
        Point point = creatPoint(5, 10);
        //"Point creat at (" + point.x + ", " + point.y + ")" 문자열을 출력한다.
        //이때, point.x와 point.y는 Point 타입의 변수 point의 x값 5와, y값 10이다. (온점으로 연결되었으므로)
        //최종적인 출력은 "Point create at (5, 10)"이 된다.
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        //int[] 참조타입 변수 (정수의 배열 형태) evens에 firstNEvenNumbers 함수 실행 결과를 넣는다.
        //이때, firstNEvenNumbers 함수 실행 결과는 아래 작성된 firstNEvenNumbers 함수의 매개변수 n에 인자 5를 넣어준 리턴값 evennumbers 배열이다.
        //결과로 받은 evennumbers 배열의 값은 {2, 4, 6, 8, 10}이다. (다른 인자로 실행하면 달라질 것이다.)
        //evennumbers는 객체이므로 결과적으로는 이 객체를 컨트롤할 수 있는 리모콘이 들어간다.
        int[] evens = firstNEvenNumbers(5);
        //"first 5 even numbers : " + Arrays.toString(evens) 문자열을 출력한다.
        //Arrays.toString은 자바에서 제공하는 Arrays 클래스의 static 함수 toString에 int배열타입 인자 even을 넣어 실행한 결과다.
        //최종적인 출력은 "first 5 even numbers : [2, 4, 6, 8, 10]"이다.
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
    }

    //아래 함수는 class Main 내에서 바로 참조할 수 있는 함수이다.
    //정적 함수(=객체화(==인스턴스화) 없이 바로 참조할 수 있는 함수)이자 String 타입으로 리턴값을 갖는 함수 greet를 만든다.
    //이 함수는 String 타입의 매개변수 name을 하나 받는다.
    public static String greet(String name) {
        //"Hello, " + name + "!"를 리턴하여 함수가 실행된 후의 값으로 남겨준다.
        //이때 name은 인자로 주어지는 값에 따라 달라진다.
        return "Hello, " + name + "!";
    }

    //정적함수이자 Point 타입으로 리턴값을 갖는 함수 creatPoint를 만들고 int 타입의 매개변수 x와 int 타입의 매개변수 y를 받겠다.
    public static Point creatPoint(int x, int y) {
        //new Point(x, y)를 리턴하여 함수가 실행된 후의 값으로 남겨준다.
        //Point(x, y)는 객체이다. new로 만들어주었기 때문.
        //이때 x, y는 인자로 주어지는 값에 따라 달라진다.
        return new Point(x, y);
    }

    //정적함수이자 int[] 타입으로 리턴값을 갖는 함수 firstNEvenNumbers를 만들고 int 타입의 매개변수 n을 받겠다.
    public static int[] firstNEvenNumbers(int n) {
        //int[] 참조타입 변수 evenNumbers에 int[n] 객체를 컨트롤 할 수 있는 리모콘을 연결하겠다.
        int[] evenNumbers = new int[n];

        //반복문 : 반복문의 재료가 되는 변수 i와 num을 선언하여 각각 초기값 0과 2를 넣어준다.
        //이 i와 num은 반복문이 실행되는 동안에만 살아있다.
        //i가 0일때부터 i가 n에 주어진 인자의 값 미만이라면 계속해서 반복하며, 한번 반복할 때마다 i를 1 증가시키고 num을 2 증가시킨다.
        for(int i = 0, num = 2; i < n; i++, num+=2) {
            //evenNumbers 배열의 이번 i값에 해당되는 공간에 이번 num값을 넣는 동작을 반복문이 끝날 때까지 반복한다.
            evenNumbers[i] = num;
        }
        //반복문이 끝난 뒤의 evenNumbers 배열을 리턴하여 함수가 실행된 후의 값으로 남겨준다.
        return evenNumbers;
    }
}

