package lightsout.domain;

public class Moebius extends Board {

    public Moebius() {
        super();
    }

    @Override
    public void move(int x, int y) {
        if (super.properIndices(x, y)) {
            super.move(x, y);
            if (y == 0) {
                super.toggle(this.board.length - x - 1, this.board[x].length - 1);
            }
            if (y == this.board[x].length - 1) {
                super.toggle(this.board.length - x - 1, 0);
            }
        }
    }
}
