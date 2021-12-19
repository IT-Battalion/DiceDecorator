package pelias.dices;

import pelias.Dice;
import pelias.DiceDecorator;

/**
 * The Additional Bonus Dice.
 *
 * @author Patrick Elias
 * @version 2021-12-09
 */
public class BonusDice extends DiceDecorator {
    private final int number;
    private final String text;

    public BonusDice(Dice dice, int number, String text) {
        super(dice);
        this.number = number;
        this.text = text;
    }

    @Override
    public int getNumber() {
        return this.number + super.getNumber();
    }

    @Override
    public String toString() {
        return super.toString() + " + " + this.number + "(" + this.text + ")";
    }
}
