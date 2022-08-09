package Enums;
interface Test{
    void disp();
}

enum Week implements Test{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    // these are called enum statement
    // every constant is public, static, final
    // since it final you cant create child enums


    Week() {
        System.out.println("Constructor called for "+ this);
    }

    void display(){
        System.out.println("Function inside enum "+this);
    }

    @Override
    public void disp() {
        System.out.println("Display function of Test Interface");
    }
}
public class Main {

    public static void main(String[] args) {
        Week week,week2;
        week=Week.Monday;
        week2=Week.Tuesday;
        System.out.println(Week.valueOf("Monday"));
        week.display();
        week.disp();


        System.out.println(week);
        for(Week day: Week.values()){
            System.out.println(day);
            System.out.println(day.ordinal());
        }

        switch (week){
            case Monday: {
                System.out.println("Monday");
            }
        }
    }
}
