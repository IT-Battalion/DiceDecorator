package pelias;

/**
 * Interface for the Dices.
 * @author Patrick Elias
 * @version 2021-12-19
 */
public interface Dice {
    /**
     * Method for dicing.
     */
    void dice();

    /**
     * Getter for Dice number.
     * @return int the number.
     */
    int getNumber();

    /**
     * Setter for Dice number.
     * @param number int the number.
     */
    void setNumber(int number);

    /**
     * Prints out the Dice result to a String.
     * @return String with the textual dice result.
     */
    String toString();
}
