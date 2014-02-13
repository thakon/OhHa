/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.domain;

/**
 * Board interface to be used by UI.
 * Board is a square of bulbs.
 * @author Tuomas
 */
public interface Board {

    /**
     * Tells whether given bulb on row x and column y is lit
     * or not.
     * @param x row
     * @param y column
     * @return true iff bulb is lit
     */
    boolean isLit(int x, int y);

    /**
     * Tells whether the puzzle has been solved.
     * @return true iff all lights off
     */
    boolean isSolved();

    /**
     * Resets the board so that all lights are on.
     */
    void reset();

    /**
     * Randomizes the gameboard. That is randomly chooses for all
     * bulbs whether a bulb is lit or not.
     */
    void randomize();

    /**
     * Toggles a bulb on row x, column y and it's four neighbours. 
     * @param x row
     * @param y column
     */
    void makeMove(int x, int y);

    /**
     * Gives the length of the side of the board.
     * @return length of one side
     */
    int size();
}
