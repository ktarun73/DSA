package properties.polymrphism;

class Numbers{
    double sum(double a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Numbers obj=new Numbers();
        System.out.println(obj.sum(0,3));
        System.out.println(obj.sum(1,2,3));
//        System.out.println(obj.sum(1,2,3,4));

    }

}
