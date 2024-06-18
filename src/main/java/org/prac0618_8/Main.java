package org.prac0618_8;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        double d = i; // 여기선 자동형변환 허용
        System.out.println(d);
        i = (int) d; // 여기선 자동형변환 불가능
        System.out.println(i);
    }
}