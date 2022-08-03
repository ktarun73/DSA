package properties.inheritance.box;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //parent class constructor
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }
}
