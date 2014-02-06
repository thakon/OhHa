package lightsout.domain;
/**
 * Board consisting of bulbs shaped like
 * Möbius band bottle given as a quotient space
 * of square.
 * @see Bulb
 * @see Board
 * @author Tuomas
 */
public class Moebius extends Board {
/**
 * Constructor
 * @see Board
 */
    public Moebius() {
        super();
    }
/**
 * Toggles bulb on row x, column y and its
 * neighbours.
 * @param x row
 * @param y column
 * @see Board
 * @see Bulb
 */
    @Override
    public void toggle(int x, int y) {
        if (super.properIndices(x, y)) {
            super.toggle(x, y);
            if (y == 0) {
                this.board[this.board.length - x - 1][this.board[x].length - 1].toggle();
            }
            if (y == this.board[x].length - 1) {
                this.board[this.board.length - x - 1][0].toggle();
            }
        }
    }
}
