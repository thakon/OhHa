package lightsout.domain;
/**
 * Board consisting of bulbs shaped like
 * Klein's bottle given as a quotient space
 * of square
 * @see Board
 * @see Bulb
 * @author Tuomas
 */
public class Klein extends Board {
/**
 * Constructor
 * @see Board
 */
    public Klein() {
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
            if (x == 0) {
                this.board[this.board.length - 1][y].toggle();
            }
            if (y == 0) {
                this.board[this.board.length - x - 1][this.board[x].length - 1].toggle();
            }
            if (x == this.board.length - 1) {
                this.board[0][y].toggle();
            }
            if (y == this.board[x].length - 1) {
                this.board[this.board.length - x - 1][0].toggle();
            }
        }
    }
}
