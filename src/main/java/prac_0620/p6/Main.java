package prac_0620.p6;

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("김철수", 22);
        사람 a사람2 = new 사람("홍길동", 23);

        System.out.println(a사람1);
        System.out.println(a사람2);
    }
}

class 사람 extends Object { //최상위 클래스인 Object에게서 상속받는다. Object가 가진 기능을 모두 사용 가능하다.
    //extends Object는 명시하기 위해 쓴 것이지, 명시해주지 않아도 클래스는 Object의 method를 모두 사용할 수 있으니 참고.
    //즉, Object를 지우고 다른 class를 상속받아도 문제는 없다.
    String name;
    int age;

    사람(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //알림용, 주석 - 안써도 상관은 없음
    public String toString() { //객체의 출력방식을 얘가 정해줄 수 있음. 말그대로 '어떤것을 스트링으로'라는 말.
        //우클릭 Generate에서 자동으로도 만들어줄 수 있다. 만약 변수가 변경되면 다시 generate하면 또 만들어줌.
        return "사람 [이름 : " + name + ", 나이 : " + age + "]";
    } //이거 안하면 main의 sout 출력했을 때 주소값만 출력된다.
    //꼭 필요한 건 아니고, 편의성을 위해 만들어두면 좋은 것.
    //객체가 문장으로서 취급되어야 할 때 자바에서 알아서 표출을 해준다.
}
