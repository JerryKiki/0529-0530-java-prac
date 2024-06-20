package prac_0620.p1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        v3();
    }

    //개선 2번
    static void v3() {
        System.out.println("==v3~v4==");
        //ArrayList<Article> articles = new ArrayList<Article>(); //저장소를 만들 때 Article의 리모콘만 넣겠다고 제약사항을 설정해줌 : <> == 제네릭
        //위는 공부용(v3), 실제로 쓰는 방식
        List<Article> articles = new ArrayList<>(); //ArrayList는 List에게서 상속을 받기에 가능한 문법.

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        //함수에 컨트롤 클릭하면 타고 들어가서 내용과 주석을 볼 수 있다. 공부할 때 참고!
        for (int i = 0; i < articles.size(); i++) { //size()는 ArrayList 클래스의, 현 리스트객체의 요소가 몇개인지 리턴해주는 함수다. (int타입 리턴)
            Article article = articles.get(i);
            //공간을 만들 때 Article만 넣을거라고 알려줬기에 이제는 의심하지 않는다.
            System.out.println(article.id);
        }
    }

    //개선 1번
    static void v2() {
        System.out.println("==v2==");
        ArrayList articles = new ArrayList(); //저장소 만들기 : 배열의 정적할당방식을 개선한 동적할당방식, 공간 크기가 가변적이다.

        //공간 안에 아티클 객체 리모콘을 넣는 행위를 메소드에게 대체시킴, 자동으로 끝에다가 계속 이어붙여 *추가*해준다.
        //ArrayList 타입 객체와 연결된 변수 articles에서 ArrayList 클래스의 함수 add(E e)를 호출, E는 매개변수로, E는 자바에서의 최상위 타입이다.
        //매개변수가 최상위 타입이라 함은, 모든 오브젝트가 함수 add의 인자가 될 수 있음을 의미한다.
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        //함수에 컨트롤 클릭하면 타고 들어가서 내용과 주석을 볼 수 있다. 공부할 때 참고!
        for (int i = 0; i < articles.size(); i++) { //size()는 ArrayList 클래스의, 현 리스트객체의 요소가 몇개인지 리턴해주는 함수다. (int타입 리턴)
            Article article = (Article) articles.get(i);
            //ArrayList articles = new ArrayList();로 했을 경우 articles ArrayList에 Article만 넣겠다고 명시해주지 않았기에,
            //articles ArrayList의 객체 리모콘에 연결된 객체의 타입은 최상위 class인 Object로 간주한다. 실제로도 다른 모든 타입이 들어갈 수 있다.
            //그래서, Article이 아닐 수도 있기에 강제 형변환(캐스팅)을 시켜주는 (Article)을 붙여주지 않으면 실행되지 않는다.
            System.out.println(article.id);
        }
    }

    //개선 전
    static void v1() {
        System.out.println("==v1==");
        Article[] articles = new Article[100]; //저장소만들기 : 정적할당
        int articlesSize = 0;

        articles[0] = new Article();
        articlesSize++;
        articles[1] = new Article();
        articlesSize++;
        articles[2] = new Article();
        articlesSize++;

        for (int i = 0; i < articlesSize; i++) {
            System.out.println(articles[i].id);
        }

        //아래 코드는 오류난다 : articles.length는 현 시점에서 100임 : 게시글이 다 차있지 않으면 null인 공간에도 접근해버린다.
        /*  for (int i = 0; i < articles.length; i++) {
            System.out.println(articles[i].id);
        }*/
    }
}

class Article {
    static int lastId; //스태틱 변수 : 클래스 내에 존재하며 같은 클래스의 모든 객체가 접근할 수 있다.
    int id;
    String regData;

    static { //클래스 내의 스태틱변수를 초기화해줄 수 있는 생성자, 근데 그냥 필드에서 초기화해줘도 됨
        //*프로그램이 실행되면* 실행된다.
        lastId = 0;
    }

    //생성자 1번 (기본 생성자를 오버라이드 해서 쓰는 것이라고 이해하자.)
    Article() {
        this(lastId + 1, "2024-12-12 12:12:12"); //생성자 2번 호출
        //생성자 안에서 생성자를 또 호출해줄 수 있는데, 첫줄에서 해줘야한다. (연쇄 생성자 호출)
        lastId++; //'클래스 안의' lastId의 값이 늘어난다. 따라서 다음 객체도 이 값을 가지고 시작하게 된다. (객체가 생성될 때마다 자동증가)
        this.id = lastId;
    }

    //생성자 2번
    Article(int id, String regData) {
        this.id = id;
        this.regData = regData;
    }
    //생성자 1번, 2번끼리는 메소드 오버로딩.
}

