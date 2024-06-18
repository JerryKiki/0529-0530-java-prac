package org.prac0618_5;



class Main {
    public static void main(String[] args) {

        // 문제 1 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
        System.out.println("===문제1===");
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크이(가) 지팡이(으)로 공격합니다.

        // 문제 2 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
        System.out.println("===문제2===");
        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

    }
}

class 전사 {
    String thisName;
    String thisWeapon;
    void 공격(String name, String weapon) {
        System.out.println(name + "이(가) " + weapon + "(으)로 공격합니다.");
        this.thisName = name;
        this.thisWeapon = weapon;
    }
    void 재공격() {
        System.out.println(this.thisName + "이(가) " + this.thisWeapon + "(으)로 공격합니다.");
    }
}

