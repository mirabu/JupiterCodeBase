package ObjectOriented;


class Box{
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    Box(Box box){
        width=box.width;
        height=box.height;
        depth=box.depth;
    }

    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    Box (double len){
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }
}


class BoxWeight extends Box{

    double Weight;

    BoxWeight(BoxWeight boxWeight){
        super(boxWeight);
        Weight=boxWeight.Weight;
    }

    BoxWeight(){
        super();
        Weight=-1;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        Weight=m;
    }

    BoxWeight(double len, double m) {
        super(len);
        Weight = m;
    }

}

public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // default
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.Weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.Weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.Weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.Weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.Weight);
        System.out.println();

    }
}
