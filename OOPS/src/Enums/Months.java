package Enums;
enum Month{
    January(1), February(2), March(3),April(4),May(5), June(6),
    July(7),August(8), September(9),October(10),November(11),December(12);
    int value;
    Month(int value) {
        this.value=value;
    }
}
public class Months {
    public static void main(String[] args) {
        for(Month m:Month.values()){
            System.out.println(m+" "+m.value);
        }
    }
}
