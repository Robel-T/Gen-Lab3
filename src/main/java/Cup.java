public class Cup {
    Die dice1 = new Die();
    Die dice2 = new Die();

    public void roll() {
        dice1.roll();
        dice2.roll();
    }

    public int getTotal() {
        return dice1.getFaceValue() + dice2.getFaceValue();
    }
}
