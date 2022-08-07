package ExceptionHandling.Custom;

public class Main {
    public static void main(String[] args) {
        try{
            String name="Tarun";
            if(name.equals("Tarun")){
                throw new MyException("Name is Tarun");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
