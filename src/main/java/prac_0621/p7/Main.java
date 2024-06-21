package prac_0621.p7;

import java.util.Scanner;

//split 사용해보기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        //스트링 배열로 만들어줘야한다 -> 여러개로 쪼개질것이기 때문
        //쪼개지는 기준은? .split() << 괄호 안의 문자! (위 코드의 경우 " "(공백))
        //숫자가 입력될 경우 : 사람이 보기엔 숫자가 입력되었어도, 문장으로 취급한다는 것에 주의.\
        //숫자로 쓰려면 형변환 해줘야한다.

        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);

        System.out.println(input[0]);
        System.out.println(input[1]);
        System.out.println(n1 + n2);

        sc.close();
    }
}
