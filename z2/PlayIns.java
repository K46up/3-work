package z2;

public abstract class PlayIns implements Ins {
    public static void main(String[] args) {
        Ins[] musicTools = new Ins[6];
        musicTools[0] = new Guitar(12);
        musicTools[1] = new Trumpet(40);
        musicTools[2] = new Drum(86);
        musicTools[3] = new Drum(54);
        musicTools[4] = new Trumpet(20);
        musicTools[5] = new Guitar(15);

        for (Ins obj : musicTools) {
            obj.play();
        }
    }
}
