package properties.inheritance;
class SolarSystem{

}
class Earth extends SolarSystem{

}

class Mars extends SolarSystem{

}

class Moon extends Earth{

}
public class InstanceOf {
    public static void main(String[] args) {
        SolarSystem s=new Earth();
        Earth e=new Earth();
        Mars m=new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof Mars);
        System.out.println(s instanceof Earth);
    }
}
