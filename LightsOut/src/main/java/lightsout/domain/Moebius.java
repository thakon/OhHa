package lightsout.domain;

public class Moebius extends Board {

    public Moebius() {
        super();
    }

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
