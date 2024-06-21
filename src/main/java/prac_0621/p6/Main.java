package prac_0621.p6;

import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //객체가 생성

        int a = 0;

        while(true) {
            System.out.printf("숫자 : ");
            try {
                a = sc.nextInt(); //생성된 객체 불러내서 입력받기
                sc.nextLine(); //외워야한다. 현재의 사용 목적은 버퍼(==a가 프로세서에 전달된 흔적)를 비운다는 뜻 -> 여기서 한번,
                //이쪽은, 없어도 이렇게 한번만 입력받을 땐 문제가 없다. 하지만, 받고나서 이렇게 비워줘야 다음에 쓸 때 문제가 없다.
                break;
            } catch (InputMismatchException e) {
                sc.nextLine(); //외워야한다. 현재의 사용 목적은 버퍼를 비운다는 뜻 -> 여기도 한번 써줘야됨.
                //입력받은 잘못된 값을 계속해서 가지고 있다. 스스로 비우지를 못하기에 비우라는 명령어를 입력해준다고 생각하면 됨.
                System.out.println("숫자를 입력해주세요.");
            }
        }

        System.out.printf("입력된 숫자 : %d\n", a);
        sc.close(); //직접 꺼줘야하는 몇가지 객체 중의 하나다.
    }
}
