package org.prac0618_14_hw;

// 아래의 코드가 실행되도록 해주세요

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "진";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        //출력 : 진이 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        //출력 : 진이 칼로 공격합니다.
    }
}

class 전사 {
    //인스턴스 변수
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        String 공격방식 = this.a무기.attack();
        System.out.println(this.이름 + "이(가) " + 공격방식);
    }
}

abstract class 무기 {
    //추상메서드를 가지고 있으면 추상 클래스여야함 (이때는 하나 추상, 하나 구상이라 반쪽짜리 추상클래스)
    abstract String attack(); // 추상메서드 : 이때는 오버라이드 필수
    void 방어() {} // 구상메서드 : 이때는 오버라이드 선택
}

interface 예시 {
    //아예 추상메서드만 가지고 있다면, abstract class 부분을 interface라고 써줄 수 있다
    //interface : 이 안에 들어있는 건 모두 추상메서드라는 것을 알려준다

    void 작동(String 공격자이름);
    //void 방어() {}; : 이 안에 바디를 구현하려고 하면 오류뜬다.
}

interface 예시2 {
    void 방어();
}

class example implements 예시, 예시2 { //implements는 여러개 상속 받을 수 있다. 어차피 전부 오버라이드 할 것이라 헷갈리지 않기 때문
    public void 작동(String 공격자이름) {//인터페이스한테서 받아오면 public 해줘야됨
        System.out.println(공격자이름 + "예시");
    }
    public void 방어() {
        System.out.println("implements 상속 예시");
    }
}

class 칼 extends 무기 {
    String attack() { return "칼로 공격합니다."; }
}

class 활 extends 무기 {
    String attack() { return "활로 공격합니다."; }
}
