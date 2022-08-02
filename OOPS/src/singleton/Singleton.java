package singleton;

public class Singleton {
    int test=100;


    private Singleton(){
    }



    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
