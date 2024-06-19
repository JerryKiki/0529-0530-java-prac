package org.prac0618_10;


//올바른 리턴타입으로 메서드를 만들어주세요
public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123,false);
        로봇.get사람6(123,false);
    }
}

class 사람 {
    int 나이;
    boolean 기혼여부;
}

class 로봇 {
    public static int get정수() {
        return 0;
    }
    public static boolean get논리() {
        return true;
    }
    
    //다양한 방식을 확인해보자
    public static 사람 get사람() {
        return null;
    }
    public static 사람 get사람2() {
        return new 사람();
    }
    public static 사람 get사람3() {
        사람 a사람 = null;
        return a사람;
    }
    public static 사람 get사람4() {
        사람 a사람 = new 사람();
        return a사람;
    }
    //중요!
    public static 사람 get사람5(int age, boolean marriage) {
        사람 a사람 = new 사람();
        a사람.나이 = age;
        a사람.기혼여부 = marriage;
        return a사람;
    }
    public static void get사람6(int a, boolean b) {
        //얘는 보내줄 필요가 없음
        사람 a사람 = new 사람();
        return; // 리턴 스테이트먼트만 씀 == 리턴 안할거야, 명시하기 위해 써준다 (가독성용)
        //안 써도 실행에는 문제없음
    }
}
