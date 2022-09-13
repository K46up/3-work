package z2;

public class Drum implements Ins{
    int diameter;
    Drum( int diameter ) {
        this.diameter= diameter;
    }
    public void play() {
        System.out.println("Играет барабан с диаметром "+ diameter);
    }
}
