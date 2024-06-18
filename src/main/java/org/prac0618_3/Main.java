package org.prac0618_3;

class Main {
    public static void main(String[] args) {
        // 문제1. : 아래가 실행되도록 해주세요.
        무기 a무기 = new 칼();
        // 문제2. 아래가 실행되도록 해주세요.
        칼 a칼 = new 칼();
        a칼 = new 활();
        // 문제3. 출력 : 칼로 공격합니다.
        a무기.공격();
    }
}

class 무기 {
    void 공격() {

    }
}
class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}
class 활 extends 칼 { //이런 상속은 좋지 않지만, 편의상 같은 페이지에 작성하였을 뿐 1번과 2번 문제는 별개의 문제이므로 예외적으로 작성함.

}