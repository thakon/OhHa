package lightsout.domain;
/**
 * Board consisting of bulbs shaped like
 * Torus or doughnut given as a quotient space
 * of square
 * @see Bulb
 * @see Board
 * @author Tuomas
 */
public class Torus extends Board {
/**
 * Constructor
 * @see Board
 */
    public Torus() {
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
                this.board[x][this.board[x].length - 1].toggle();
            }
            if (x == this.board.length - 1) {
                this.board[0][y].toggle();
            }
            if (y == this.board[x].length - 1) {
                this.board[x][0].toggle();
            }
        }
    }
}
