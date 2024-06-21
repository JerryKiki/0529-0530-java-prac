package prac_0620.p3;

//예외처리 관련 필기
public class Main {
    public static void main(String[] args) {
        System.out.println("==문제 발생 케이스==");
        int rs = 계산기.나누다1(15, 0);
        System.out.println(rs);

        System.out.println("==문제 미발생 케이스==");
        int rs2 = 계산기.나누다2(15, 3);
        System.out.println(rs2);

        System.out.println("==문제 발생시 finally를 통해 처리해준 케이스==");
        int rs3 = 계산기.나누다3(15, 30);
        System.out.println(rs3);

        System.out.println("==예외처리 다른 방식(throws)=="); //아래 나누기4 함수에 throws를 사용해준다.
        try {
            int rs4 = 계산기.나누다4(15, 0); //예외가 발생하는 순간 호출한 쪽(메인함수)에서 처리하도록 던져주기에,
            System.out.println(rs4); // 위에서 리턴값도 발생하지 않고, try 내에서 나가기에 이 코드 출력 안됨
        } catch (ArithmeticException e) {
            System.out.println("0으로 못 나눠"); // 여기서 catch하기에 이것만 출력됨
        } catch (Exception e) { //참고 : 캐치를 이렇게 써서 알 수 없는 예외상황을 감지할 수 있다. Exception은 모든 예외를 의미하는 상위개념
            System.out.println("알 수 없는 예외 발생");
        }
    }
}

class 계산기 {
    static int 나누다1(int a, int b) {
        int rs = 0;

        try {
            rs = a / b; //예외 발생 가능성 코드
        } catch (ArithmeticException e) { //0으로 나누러 한 에러가 발생하면, (=예외상황exception이 발생했을때)
            System.out.println("문제발생...");

        }
        return rs;
    }

    static int 나누다2(int a, int b) {
        int rs = 0;

        try {
            rs = a / b; //예외 발생 가능성 코드
        } catch (ArithmeticException e) { //0으로 나누러 한 에러가 발생하면, (=예외상황exception이 발생했을때)
            System.out.println("문제발생... 0으로 못나눠");
        }
        return rs;
    }

    static int 나누다3(int a, int b) {
        int rs = 0;

        try {
            rs = a / b; //예외 발생 가능성 코드
        } catch (ArithmeticException e) { //0으로 나누러 한 에러가 발생하면, (=예외상황exception이 발생했을때)
            System.out.println("문제발생... 0으로 못나눠");
        } catch (Exception e) {
            System.out.println("알 수 없는 문제 발생");
        } finally {
            System.out.println("일단 1 리턴해");
            rs = 1;
        }
        return rs;
    }

    static int 나누다4(int a, int b) throws ArithmeticException { //메인에서 트라이캐치할 때 유의해야할 점 써주기.
        //예외가 발생하면 호출한 쪽에서 처리하도록 던져주는 것. ex) 메인함수에서 실행했다면 메인함수에서 try, catch 해줘야 한다.
        int rs = 0;
        rs = a / b; //예외 발생 가능성 코드
        return rs;
    }
}

//참고 : if(b==0) { throw new illegalargumentexception("0으로 나눌 수 없습니다.") }와 같이 try catch문이 아니라 강제 오류 발생을 시켜줄 수도 있다.
//올바른 인자값이 주어지지 않았을 때 쓰는 것.
//이때는 내 예외 클래스를 만들어줘야함.
//아래는 예외 클래스를 만들때의 규칙.
//모 예외 클래스가 Exception 클래스를 상속받은 경우 Checked exception이 됩니다.
//이 경우, 반드시 해당 예외를 처리해야 하며 만약 예외를 처리 하지 않으면 컴파일 오류를 발생시킵니다.
//RuntimeException 클래스를 상속받은 경우 Unchecked exception이 됩니다.
//이 경우에는 해당 예외를 처리하지 않아도 컴파일시에 오류를 발생시키지 않습니다.

//프로그래머스 참고
//public class ExceptionExam{
//    public static void main(String[] args){
//        ExceptionExam exam = new ExceptionExam();
//        int[] array = new int[10]; //10칸짜리 배열 생성
//        try {
//            exam.get50thItem(array); //배열의 50번째 칸을 확인하는 함수를 실행시도
//        } catch (MyCheckedException e) { //MyCheckedException이 발생하면,
//            System.out.println("50번째 공간이 없습니다."); //출력
//        }
//    }
//
//    public int get50thItem(int []array) throws MyCheckedException{ //배열의 50번째 칸을 확인하는 함수로, MyCheckedException이라는 오류가 발생하면 호출한 쪽으로 넘긴다.
//    알수 있는 것 : 원래 있는 예외명이 아니라도, 강제로 발생시켜주는 방식으로 throws 할 수 있다.
//        if(array.length < 50){ //배열의 크기가 50미만이라면,
//            throw new MyCheckedException(); //MyCheckedException이라는 Exception을 강제로 발생시킨다.
//        }
//        return  array[49]; //50보다 크다면 50번째 값을 리턴
//    }
//}
