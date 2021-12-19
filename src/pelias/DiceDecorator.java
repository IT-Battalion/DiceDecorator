package pelias;

/**
 * The Dice Decorator for additional implementations.
 * @author Patrick Elias
 * @version 2021-12-19
 */
public abstract class DiceDecorator implements Dice {
    private final Dice dice;

    public DiceDecorator(Dice dice) {
        this.dice = dice;
    }

    public void dice() {
        this.dice.dice();
        ;
    }

    @Override
    public int getNumber() {
        return this.dice.getNumber();
    }

    @Override
    public void setNumber(int number) {
        this.dice.setNumber(number);
    }

    @Override
    public String toString() {
        return this.dice.toString();
    }
}
