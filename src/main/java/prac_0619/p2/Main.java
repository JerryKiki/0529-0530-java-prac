package prac_0619.p2;

public class Main {
    public static void main(String[] args) {
        //아래는 참고만
        //int arr[] new int[3];
        //Article[] articles = new Article[3]; //Article 3개 들어갈 수 있는 객체라고 이해하자

        Article[] articles = new Article[10];

        //1번 방식의 리모콘 전달 (변수에 한번 새로 만들어진 객체의 리모콘을 전달 후 그 변수에서 다시 배열에 리모콘을 전달)
        Article article1 = new Article(); //생성자 1번 호출
        articles[0] = article1;
        System.out.println(article1.id);
        //2번 방식의 리모콘 전달 (배열에 바로 새로 만들어진 객체의 리모콘을 전달)
        articles[1] = new Article();
        System.out.println(articles[1].id);
        //1, 2번 방식의 전달방식 차이 숙지(오늘 그린 이미지 참고)
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
