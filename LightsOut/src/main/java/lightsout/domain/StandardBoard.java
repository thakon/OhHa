package lightsout.domain;

import java.util.Random;

/**
 * Board consisting of bulbs shaped like a square. 
 *
 * @author Tuomas
 */
public class StandardBoard implements Board {

    /**
     * Boolean matrix representing the board. Boolean value
     * true corresponds to a bulb being lit.
     */
    protected boolean[][] board;
    private Random random;

    /**
     * Constructor creates a square board of lights,
     * represented by boolean square matrix, with
     * side of length size
     * @param size length of a side of the board
     */
    public StandardBoard(int size) {
        if (size == 5 || size == 7 || size == 9) {
            this.board = new boolean[size][size];
            for (int i = 0; i < this.board.length; i++) {
                for (int j = 0; j < this.board[i].length; j++) {
                    this.board[i][j] = true;
                }
            }
            this.random = new Random();
        }
    }

    /**
     * Simple getter. Given row and column, tells whether the bulb on their 
     * intersection is lit or not.
     * @param x row
     * @param y colum
     * @return true iff bulb is lit
     */
    @Override
    public boolean isLit(int x, int y) {
        return board[x][y];
    }

    /**
     * Checks whether the board is solved. That is whether all lights are off.
     *
     * @return true iff board is solved
     */
    @Override
    public boolean isSolved() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isLit(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks whether given row and column are within limits.
     *
     * @param x row
     * @param y column
     * @return true iff row and column are between 0 and board.length - 1.
     */
    public boolean properIndices(int x, int y) {
        if (x >= 0 && y >= 0
                && x < this.board.length && y < this.board[x].length) {
            return true;
        }
        return false;
    }

    /**
     * For each bulb on the board randomly chooses whether it is lit or not.
     */
    @Override
    public void randomize() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = random.nextBoolean();
            }
        }
    }

    /**
     * Resets the board so that all lights are on.
     */
    @Override
    public void reset() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = true;
            }
        }
    }
    /**
     * Given row and column, toggles the bulb on their intersection.
     * @param x row
     * @param y colum
     */
    public void toggle(int x, int y) {
        board[x][y] = !board[x][y];
    }

    /**
     * Given row and column, toggles the bulb on their intersection and also the
     * bulb's neighbours.
     *
     * @param x row
     * @param y column
     */
    @Override
    public void makeMove(int x, int y) {
        if (this.properIndices(x, y)) {
            toggle(x, y);
            if (x > 0) {
                toggle(x - 1, y);
            }
            if (y > 0) {
                toggle(x, y - 1);
            }
            if (x < this.board.length - 1) {
                toggle(x + 1, y);
            }
            if (y < this.board[x].length - 1) {
                toggle(x, y + 1);
            }
        }
    }

    /**
     * Gives the length of a side of the board
     *
     * @return length of a side
     */
    @Override
    public int size() {
        return board.length;
    }
}
