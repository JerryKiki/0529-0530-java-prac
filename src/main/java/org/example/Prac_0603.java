package org.example;

public class Prac_0603 {
    public static void main(String[] args){
        //문제2. 자동차 객체와 연결될 변수를 만들어주세요.
        CarMake car1;
        CarMake car2;
        //문제3. 자동차 객체를 만들고 변수와 연결해주세요.
        car1 = new CarMake();
        car2 = new CarMake();

        //문제4. : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
        System.out.println("===문제4===");
        car1.name = "1번";
        car1.maxSpeed = 200.0;
        car2.name = "2번";
        car2.maxSpeed = 300.0;

        System.out.println("car1의 최고속력은 " +  car1.maxSpeed + "km 입니다.");
        System.out.println("car2의 최고속력은 " +  car2.maxSpeed + "km 입니다.");

        //문제5. : 1개의 자동차가 3번 달리게 해주세요.
        System.out.println("===문제5===");
        car1.run();
        car1.run();
        car1.run();

        //문제6 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.
        System.out.println("===문제6===");
        Player player1 = new Player();
        player1.age = 20;
        player1.name = "홍길동";
        player1.job = "의적";

        int player2_age = 30;
        String player2_name = "전우치";
        String player2_job = "도사";

        System.out.println("플레이어1의 나이는 " + player1.age + "세 입니다.");
        System.out.println("플레이어1의 이름은 " + player1.name + "입니다.");
        System.out.println("플레이어1의 직업은 " + player1.job + "입니다.");
        System.out.println("플레이어2의 나이는 " + player2_age + "세 입니다.");
        System.out.println("플레이어2의 이름은 " + player2_name + "입니다.");
        System.out.println("플레이어2의 직업은 " + player2_job + "입니다.");


        //문제7. 3개의 자동차가 각각 1번씩 달리게 해주세요.
        //문제8. 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
        //문제9. 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
        System.out.println("===문제7, 8, 9===");
        CarMake car3 = new CarMake();
        car3.name = "3번";
        car3.maxSpeed = 250;
        car1.run();
        car2.run();
        car3.run();
    }
}

//문제1. 자동차 설계도를 만들어주세요.
class CarMake {
    //문제4 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.
    String name;
    double maxSpeed;
    //문제5. 1개의 자동차가 3번 달리게 해주세요.
    //문제8. 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
    //문제9. 번호가 다른 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
    void run()
    {
        System.out.printf("%s 자동차가 최고속력 %.0fkm로 달립니다.\n", this.name, this.maxSpeed);
    }
}

// 문제6 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.
class Player {
    int age;
    String name;
    String job;
}
