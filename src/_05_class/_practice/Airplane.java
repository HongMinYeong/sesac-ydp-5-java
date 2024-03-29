package _05_class._practice;
//import _05_class._practice.Vehicle;

interface Flyable {
    public void fly();
}

public class Airplane extends Vehicle implements Flyable {
    @Override
    public void fly() {
        System.out.println("고도 10,000 피트에서 비행 중");
    }

    @Override
    void move() {
        System.out.println("하늘을 날아가는 중~~");
    }
}
