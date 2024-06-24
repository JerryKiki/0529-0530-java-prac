package prac_0621.p10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        //Stream<String> inputsStream = Arrays.stream(inputs); //stream 사용해보기
        //long sum = LongStream.of(inputsStream.mapToLong(Long::parseLong).toArray()).sum(); //stream에 stream 넣은거
        long sum = Arrays.stream(inputs)
                    .mapToLong(e -> Long.parseLong(e))
                    .sum(); //배열 바로 넣기
        //스트림도 어떤 *연산을 하기에 편한* 형태로 바꾸어주는 '자료구조'
        //mapToLong -> 원래의 inputs(이 경우엔 String)을 Long으로 매핑한다. (1:1대응되게 변환해줌)
        //parseLong 바뀌는 대상은 inputs에서 하나하나 꺼내오는 것

        //일반 for문
        //long sum = 0
//        for(int i = 0; i < inputs.length; i++) {
//            sum += Long.parseLong(inputs[i]);
//        }

        //향상된 for문 : 배열 등, (뭔가가 나열되어있는) 자료구조 객체의 데이터값을 쭉 돌아준다(=데이터 순회)
        //long sum = 0;
//        for(String inputData : inputs) { //inputData에는 inputs[0] ~ 마지막 데이터가 한번씩 들어간다, 자료구조의 데이터 수만큼 반복해줌
//            sum += Long.parseLong(inputData);
//        }

        System.out.println(sum);
    }
}
