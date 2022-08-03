package properties.inheritance.bicycle;

class Bicycle{

    public int gear;
    public int speed;


    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(){
        speed--;
    }

    public void speedUp(){
        speed++;
    }

    public String toString(){
        return ("No of gears are " + gear + "\n"
                + "Speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed,int seatHeight) {
        super(gear, speed);
        this.seatHeight=seatHeight;
    }

    public void setSeatHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSeat height is "+seatHeight;
    }

}

public class Test {
    public static void main(String[] args) {


        MountainBike bike=new MountainBike(5,30,1);
        System.out.println(bike);
        bike.setSeatHeight(2);
        bike.applyBrake();
        bike.speedUp();
        System.out.println(bike.speed);
        System.out.println(bike.seatHeight);
    }
}
