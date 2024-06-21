package prac_0621.p1;

import java.util.HashMap;
import java.util.Map;

//문제풀이 : Main 함수가 올바르게 실행되도록 만들기
class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
        a사람인력관리소.add사람("박여인", 25);
        a사람인력관리소.add사람("박철수", 5);

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.

        사람 a사람4 = a사람인력관리소.get사람(4);
        a사람4.자기소개();

        사람 a사람5 = a사람인력관리소.get사람(5);
        a사람5.자기소개();

        사람 a사람6 = a사람인력관리소.get사람(6);
        a사람6.자기소개();
    }
}

//HashMap에 예외처리까지 시도해보기... (실패, 현재는 if로 처리한 상태)
class 사람인력관리소 {
    private static int num = 0;

    static Map<Integer, 사람> management = new HashMap<>();

    void add사람(String name, int age) {
        int newNum = num + 1;
        사람 a사람 = new 사람(newNum, name, age);
        management.put(newNum, a사람);
        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", age, newNum, name);
        num++;
    }

    사람 get사람(int num) {
        if (num > this.num) {
            //System.out.printf("%d번째 사람은 없습니다.\n", num);
            return new 사람();
        }
        return management.get(num);
    }

    public static int getNum() {
        return num;
    }
}

class 사람 {
    int num;
    String name;
    int age;

    void 자기소개() throws NoPersonException {
        if(this.name.equals("없음")) {
            System.out.printf("%d번째 사람이 없어 자기소개가 불가능합니다.\n", this.num);
        } else {
            System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.num, this.name, this.age);
        }

    }

    사람(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }

    사람() {
        this.num = 사람인력관리소.getNum() + 1;
        this.name = "없음";
    }
}

class NoPersonException extends RuntimeException {
    NoPersonException(int num) {
        System.out.printf("%d번째 사람은 없습니다.", num);
    }
}
