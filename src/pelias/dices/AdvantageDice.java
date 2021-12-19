package pelias.dices;

import pelias.Dice;
import pelias.DiceDecorator;

/**
 * The Additional Advantage Dice.
 *
 * @author Patrick Elias
 * @version 2021-12-19
 */
public class AdvantageDice extends DiceDecorator {
    private final Dice additionalDice;

    public AdvantageDice(Dice dice, Dice additionalDice) {
        super(dice);
        this.additionalDice = additionalDice;
    }

    @Override
    public void dice() {
        super.dice();
        this.additionalDice.dice();
    }

    @Override
    public int getNumber() {
        return Math.max(super.getNumber(), this.additionalDice.getNumber());
    }

    @Override
    public String toString() {
        return "AdvantageDice(" + super.toString() + ", " + this.additionalDice.toString() + ")";
    }
}
