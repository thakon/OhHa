package lightsout.domain;

import java.util.Random;

public class Board {

    protected Bulb[][] board;
    private Random random;

    public Board() {
        this.board = new Bulb[5][5];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = new Bulb();
            }
        }
        this.random = new Random();
    }

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

    public boolean properIndices(int x, int y) {
        if (x >= 0 && y >= 0 && x < this.board.length && y < this.board[x].length) {
            return true;
        }
        return false;
    }

    public void shuffle() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (random.nextDouble() < 0.5) {
                    this.board[i][j].setIsLit(true);
                } else {
                    this.board[i][j].setIsLit(false);
                }
            }
        }
    }

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
