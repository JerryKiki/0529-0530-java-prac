package prac_0620.p2;

//getter, setter 개념
public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        //a사람.id = 20;
        //id가 프라이빗일 때, 위 코드와 같은 행위를 하고 싶다면, setId 메소드를 만든 후 실행한다.
        a사람.setId(20);
        a사람.setAge(24);

        //System.out.println("번호 : " + a사람.id);
        //id가 프라이빗일 때, 위 코드와 같은 행위를 하고 싶다면, getId 메소드를 만든 후 실행한다.
        System.out.println("번호 : " + a사람.getId());
        System.out.println("나이 : " + a사람.getAge());
    }
}

class 사람 {
    //기본적으로 생성하고 나면 public이다(=생략되었을 뿐). private으로 유지해주는게 낫다. *(관례)*
    //이렇게 해두면 외부에서는 접근이 불가능해짐.
    private int id;
    private int age;

    //private 변수에 클래스로 만들어진 객체 내부에서 접근해서 행동해주는 메소드
    public int getId() { //getter라고 한다
        return id;
    }

    //private 변수에 클래스로 만들어진 객체 내부에서 접근해서 행동해주는 메소드
    public void setId(int id) { //setter라고 한다
        this.id = id;
    }

    //getter와 setter는 우클릭해서 자동으로 만들어달라고 할 수 있다. (Generate -> getter and setter)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
