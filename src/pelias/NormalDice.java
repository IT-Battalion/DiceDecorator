package pelias;

/**
 * The Normal Dice implementation.
 * @author Patrick Elias
 * @version 2021-12-19
 */
public class NormalDice implements Dice {
    private final int sites;
    private int number;

    public NormalDice(int sites) {
        this.sites = sites;
    }

    /**
     * Method for dicing.
     */
    @Override
    public void dice() {
        this.number = (int) Math.round(1 + Math.random() * this.sites);
    }

    /**
     * Getter for Dice number.
     *
     * @return int the number.
     */
    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * Setter for Dice number.
     *
     * @param number int the number.
     */
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "d" + sites + "=" + number;
    }
}
