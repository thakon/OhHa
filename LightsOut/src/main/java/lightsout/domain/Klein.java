package lightsout.domain;

public class Klein extends Board {

    public Klein() {
        super();
    }

    @Override
    public void move(int x, int y) {
        if (super.properIndices(x, y)) {
            super.move(x, y);
            if (x == 0) {
                super.toggle(this.board.length - 1, y);
            }
            if (y == 0) {
                super.toggle(this.board.length - x - 1, this.board[x].length - 1);
            }
            if (x == this.board.length - 1) {
                super.toggle(0, y);
            }
            if (y == this.board[x].length - 1) {
                super.toggle(this.board.length - x - 1, 0);
            }
        }
    }
}
