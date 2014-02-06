package lightsout.domain;

import java.util.Random;
/**
 * Board consisting of bulbs shaped like
 * a square.
 * @see Bulb
 * @author Tuomas
 */
public class Board {
/**
 * Matrix of bulb representing the board.
 */
    protected Bulb[][] board;
    private Random random;
/**
 * Constructor makes a 5x5 matrix of
 * bulbs with all lights on.
 */
    public Board() {
        this.board = new Bulb[5][5];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = new Bulb();
            }
        }
        this.random = new Random();
    }
/**
 * Checks whether the board is solved.
 * That is whether all lights are off.
 * @return true iff board is solved
 */
    public boolean isSolved() {
        for (Bulb[] row : this.board) {
            for (Bulb bulb : row) {
                if (bulb.isLit()) {
                    return false;
                }
            }
        }
        return true;
    }
/**
 * Checks whether given row and column are
 * within limits.
 * @param x row
 * @param y column
 * @return true iff row and column are between 0 and 4.
 */
    public boolean properIndices(int x, int y) {
        if (x >= 0 && y >= 0
                && x < this.board.length && y < this.board[x].length) {
            return true;
        }
        return false;
    }
/**
 * For each bulb on the board randomly
 * chooses whether it is lit or not.
 */
    public void randomize() {
        for (Bulb[] row : this.board) {
            for (Bulb b : row) {
                b.setIsLit(random.nextBoolean());
            }
        }
    }
/**
 * Resets the board so that all lights are on.
 */
    public void reset() {
        for (Bulb[] row : this.board) {
            for (Bulb bulb : row) {
                bulb.setIsLit(true);
            }
        }
    }
/**
 * Given row and column, toggles the bulb on
 * their intersection and also the bulb's
 * neighbours.
 * @param x Represents row.
 * @param y Represents
 * @see Bulb
 */
    public void toggle(int x, int y) {
        if (this.properIndices(x, y)) {
            this.board[x][y].toggle();
            if (x > 0) {
                this.board[x - 1][y].toggle();
            }
            if (y > 0) {
                this.board[x][y - 1].toggle();
            }
            if (x < this.board.length - 1) {
                this.board[x + 1][y].toggle();
            }
            if (y < this.board[x].length - 1) {
                this.board[x][y + 1].toggle();
            }
        }
    }
}
