package _05_class._interface;


import _05_class._access_modifier._pack02.C;

interface Controller {
    void powerOn();


    void powerOff();
}

class Tv implements Controller{
    @Override
    public void powerOn() {
        System.out.println("TV 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV 전원 OFF");
    }
}

class Computer implements Controller{
    @Override
    public void powerOn() {
        System.out.println("컴퓨터 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("컴퓨터 전원 OFF");
    }
}
public class InterfaceEx01 {
    public static void main(String[] args) {
    Tv tv = new Tv();
    Computer computer = new Computer();

    tv.powerOn();
    tv.powerOff();

    computer.powerOn();
    computer.powerOff();
    }
}
