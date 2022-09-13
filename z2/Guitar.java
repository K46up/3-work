package z2;

public class Guitar implements Ins{    int numberOfstrings;
    Guitar( int numberOfstrings ) {
        this.numberOfstrings = numberOfstrings;
    }
    public void play() {
        System.out.println("Играет гитара "+numberOfstrings+" струн");
    }

}
