package lightsout.domain;
/**
 * Board consisting of bulbs shaped like
 * Torus or doughnut given as a quotient space
 * of square
 * @see StandardBoard
 * @author Tuomas
 */
public class Torus extends StandardBoard {
/**
 * Constructor
 * @see StandardBoard
 */
    public Torus(int size) {
        super(size);
    }
/**
 * Toggles bulb on row x, column y and its
 * neighbours.
 * @param x row
 * @param y column
 * @see StandardBoard
 */
    @Override
    public void makeMove(int x, int y) {
        if (super.properIndices(x, y)) {
            super.makeMove(x, y);
            if (x == 0) {
                toggle(this.board.length - 1, y);
            }
            if (y == 0) {
                toggle(x, this.board[x].length - 1);
            }
            if (x == this.board.length - 1) {
                toggle(0, y);
            }
            if (y == this.board[x].length - 1) {
                toggle(x, 0);
            }
        }
    }
}
