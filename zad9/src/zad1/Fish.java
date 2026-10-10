package zad1;
public class Fish extends Pet {

    public Fish() {
        super("");
        setPawsCount(0);
    }


    @Override
    public void giveVoice() {
        System.out.println("Бульк");
    }
}