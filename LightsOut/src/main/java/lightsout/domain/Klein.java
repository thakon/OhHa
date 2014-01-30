package lightsout.domain;

public class Klein extends Board {

    public Klein() {
        super();
    }

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
