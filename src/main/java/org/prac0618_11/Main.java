package org.prac0618_11;

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔(); //사람 안의 a왼팔 변수에 팔 객체의 리모콘을 연결.
        a사람.a왼팔.길이 = 100; //연결-연결이 가능하다.
    }
}

class 사람 {
    // 클래스안에 변수를 정의 할 수 있다.
    int 나이;
    팔 a왼팔; //팔 객체와 *연결될* 인스턴스 변수를 사람 클래스 안에 만들 수 있다.
}

class 팔 {
    int 길이;
}