package prac_0621.p10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        long sum = 0;
//        for(int i = 0; i < inputs.length; i++) {
//            sum += Long.parseLong(inputs[i]);
//        }
        //향상된 for문 : 배열 등, (뭔가가 나열되어있는) 자료구조 객체의 데이터값을 쭉 돌아준다(=데이터 순회)
        for(String inputData : inputs) { //inputData에는 inputs[0] ~ 마지막 데이터가 한번씩 들어간다, 자료구조의 데이터 수만큼 반복해줌
            sum += Long.parseLong(inputData);
        }
        System.out.println(sum);
    }
}
