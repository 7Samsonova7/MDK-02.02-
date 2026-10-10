package zad1;
public abstract class Pet {
    private String voice;
    private int pawsCount;

    public Pet(String voice) {
        this.voice = voice;
        this.pawsCount = 4;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public void giveVoice() {
        System.out.println(voice);
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}