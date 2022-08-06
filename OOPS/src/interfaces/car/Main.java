package interfaces.car;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.start();
//        car.acc();
//        car.brake();
//
//        SportsCar sportsCar=new SportsCar();
//        sportsCar.start();
//        sportsCar.acc();
//        sportsCar.brake();

        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.startMusic();
        niceCar.stop();
        niceCar.startMusic();
        niceCar.upgradeEngine(new ElectricEngine());



    }
}
