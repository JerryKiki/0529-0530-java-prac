package org.prac0618_13;

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.이름 = "철수";
        a전사.공격();
        // 출력 : 철수가 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        this.a무기.attack(this.이름);
    }
}

abstract class 무기 {
    //추상메서드를 가지고 있으면 추상 클래스여야함 (이때는 하나 추상, 하나 구상이라 반쪽짜리 추상클래스)
    abstract void attack(String userName); // 추상메서드 : 이때는 오버라이드 필수

    void 방어() {
    } // 구상메서드 : 이때는 오버라이드 선택
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

class 칼 extends 무기 {
    public void attack(String userName) {
        System.out.println(userName + "(이)가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    public void attack(String userName) {
        System.out.println(userName + "(이)가 활로 공격합니다.");
    }

    ;
}

