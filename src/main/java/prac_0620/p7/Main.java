package prac_0620.p7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //철수나이 20, 영희나이 22, 영수나이 33을 저장하고 싶다.

        //1. ArrayList
        System.out.println("===ArrayList===");
        List<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(22);
        ages.add(33);

        System.out.println("철수 나이 : " + ages.get(0));
        System.out.println("영희 나이 : " + ages.get(1));
        System.out.println("영수 나이 : " + ages.get(2)); // 이 순서로 출력하고 싶다면 인덱스에 순서대로 넣어줘야 한다...
        //인덱스가 순서대로 0, 1, 2로 붙어서 영수껀지 철수껀지 영희껀지 판별하기가 힘들다.
        //게다가, 중간값이 하나 지워지거나 끼워넣어지면 인덱스가 하나씩 다 줄어들거나 밀린다. 데이터가 커질수록 문제가 커진다.
        //순서를 상관하지 않아도 되는 경우에는 관련없지만, 순서와 자리가 필요한 경우라면 다른 방식이 필요해진다.
        //변수명도 변수명[인덱스]로만 다룰 수 있어서 매칭되어야 하는 경우 불편하다.
        //List는 넣을 때 좋고 가져올 때 귀찮다

        //2. HashMap
        System.out.println("===HashMap===");
        Map<String, Integer> agesMap = new HashMap<>(); //Map이 HashMap의 상위클래스임도 참고
        //<Key값, Value값> => *쌍으로 이루어진 데이터* : 1:1대응, 묶음관계를 다룰 수 있음.
        //김철수, 001231-1235013 => String, String / 1, 123 => Integer, Integer / 김철수, 20 => String, Integer
        //위처럼 짝지어진 타입을 <> 안에서 알려줄 수 있다

        agesMap.put("영수", 33); //넣는 순서가 바뀌어도 밑에서 알맞게 출력된다.
        agesMap.put("철수", 20); //앞이 key과 뒤가 value인 걸 얘도 알고 있다. 내가 지정해주었기 때문.
        agesMap.put("영희", 22); //이때 들어가는 데이터의 key는 영희, value는 22. key가 index처럼 기능한다고 생각하면 이해하기 쉽다.

        System.out.println("철수 나이 : " + agesMap.get("철수")); //이렇게 key값으로 찾아주면 나온다!
        System.out.println("영희 나이 : " + agesMap.get("영희"));
        System.out.println("영수 나이 : " + agesMap.get("영수"));
        //Map은 넣을 때 귀찮지만 가져올 때 좋다
    }
}
