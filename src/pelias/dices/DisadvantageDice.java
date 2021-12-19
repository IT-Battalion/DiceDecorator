package pelias.dices;

import pelias.Dice;
import pelias.DiceDecorator;

/**
 * The Additional Disadvantage Dice.
 *
 * @author Patrick Elias
 * @version 2021-12-19
 */
public class DisadvantageDice extends DiceDecorator {
    private final Dice additionalDice;

    public DisadvantageDice(Dice dice, Dice additionalDice) {
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
        return Math.min(super.getNumber(), this.additionalDice.getNumber());
    }

    @Override
    public String toString() {
        return "DisadvantageDice(" + super.toString() + ", " + this.additionalDice.toString() + ")";
    }
}
