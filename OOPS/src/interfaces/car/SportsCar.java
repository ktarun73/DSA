package interfaces.car;

public class SportsCar implements Engine , Brake{
    @Override
    public void brake() {
        System.out.println("Brake like sports car");
    }

    @Override
    public void start() {
        System.out.println("Start like sports car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like sports car");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate like sports car");
    }
}
