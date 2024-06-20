package prac_0620.p4;

//객체의 비교를 더 파보자
public class Main {
    public static void main(String[] args) {
        String s1 = "하";
        char c = '하';
        //위의 두개는 완전히 다른 것이다.
        //String은 사실 객체이다.
        String s2 = new String("하하"); //모든 스트링은 new String();이 생략된 것.
        s1 += "하"; //이것은 뒤로 이어붙여주는 것.
        //String 타입의 변수는 실제로는 String 객체의 주소값(리모콘)을 저장하는 변수이다!
        System.out.println("s1==s2 : " + (s1==s2)); //이 코드의 출력은 false이다. 두 string 객체의 '주소값'을 담은 변수를 비교했기 때문.
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //이렇게 해야, 주소값 안의 내용물이 동등한지를 확인해준다. ==> 이때는 true

        //이제 String말고 다른 객체도 써보자.
        Person p1 = new Person(13);
        Person p2 = new Person(13);
        System.out.println("p1==p2 : " + (p1==p2)); //객체의 주소값끼리 비교는 당연히 false.
        System.out.println("p1.equals(p2) : " + p1.equals(p2)); //이때도 false : 어떤 내용이 같아야 같은 취급을 해줄지 말 안해줬기 때문.

        //그렇다면 처음부터 "하하"를 넣어준 String 끼리는 같은 취급을 할까?
        String s3 = "하하";
        String s4 = "하하";
        System.out.println("s3==s4 : " + (s3==s4)); //이건 왜 true? : 어? 아까 같은 거 있었는데? 라고 생각하고 바로 연결하기 때문.
        //메모리값이 s3은 4고 s4는 0이 된다. s3의 메모리 공간을 같이 쓰기 때문. 가리키는 메모리공간이 중요하다는 것을 알 수 있다.
        //이렇게 되는 이유는 메모리공간을 자동으로 아끼려고 하기 때문
        //new String으로 추가해준 s2는 '재활용모드'가 꺼진 상태이기에 s3이 "하하"여도 재활용하지 못하고 s3에 연결될 놈을 새로 만든다. 따라서 다르다고 나온다.
        //만약 s4가 "하하하"였다면, s3의 "하하"를 재활용하지 않고 아예 새로 만든다는 점에도 유의.
        System.out.println("s2==s3 : " + (s2==s3));
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); //이건 true가 나오겠지만...

        // 여기서 또 하나 생각해보자... 그렇다면 메모리 공간을 왜 아끼려고 할까? : 주로 하드웨어 경량화 때문이고, 웹개발에서는 그것보다 덜하지만...
        // 메모리를 아껴줘야 '속도'가 빨라지기 때문! : 웹에서는 이것도 꽤 중요한 수치다.
        // 반복문, 조건문 등 할때 최대한 깔끔한 상태를 유지하고 횟수를 줄이려 하는 것이 모두 경량화 과정이다. : 최대한 깔끔한 상태를 유지하고자 함.
        // 소수 찾기 시간초과로 고생했던거 생각해보면 이해가 잘된다...ㅎ;
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}