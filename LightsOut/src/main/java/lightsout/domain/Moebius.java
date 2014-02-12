package lightsout.domain;
/**
 * Board consisting of bulbs shaped like
 * Möbius band bottle given as a quotient space
 * of square.
 * @see StandardBoard
 * @author Tuomas
 */
public class Moebius extends StandardBoard {
/**
 * Constructor
 * @see StandardBoard
 */
    public Moebius(int size) {
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
            if (y == 0) {
                toggle(this.board.length - x - 1, this.board[x].length - 1);
            }
            if (y == this.board[x].length - 1) {
                toggle(this.board.length - x - 1, 0);
            }
        }
    }
}
