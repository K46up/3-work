package z2;

public class Trumpet implements Ins{
    int size ;
    Trumpet( int size ) {
        this.size = size;
    }
    public void play() {
        System.out.println("Играет труба с размером "+ size);
    }
}
