package staticExample;


public class Main {
    public static void main(String[] args) {

        Human tarun=new Human(22,"Tarun",50000,false);
        System.out.println(Human.population);
        Human mehak=new Human(21,"Mehak",90000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }

}
