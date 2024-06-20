package prac_0620.p5;

public class Main {
    public static void main(String[] args) {
        String s = "*";
        String k = "*"; //이때 s와 k는 같은 곳을 바라본다
        s += "*"; //이때 s는 메모리에 추가된 "**"를 본다
        s += "*"; //또 메모리에 "***"를 추가한다
        s += "*"; //반복
        s += "*"; //...
        System.out.println(s); // *****
        System.out.println(k); // *

        StringBuilder s2 = new StringBuilder("*"); //공간 하나를 만들고 계속 이어붙인다.
        s2.append("*");
        s2.append("*");
        s2.append("*");
        s2.append("*");
        System.out.println(s2); // ***** => 출력결과는 s와 같지만 메모리 사용이 훨씬 경량화된다.
    }
}
