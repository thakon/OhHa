package lightsout.domain;

import java.util.Random;

public class Board {

    protected boolean[][] board;
    private Random random;

    public Board() {
        this.board = new boolean[5][5];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = true;
            }
        }
        this.random = new Random();
    }

    public boolean isLit(int x, int y) {
        return this.board[x][y];
    }

    public boolean isSolved() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (isLit(i, j)) {
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
                    this.board[i][j] = true;
                } else {
                    this.board[i][j] = false;
                }
            }
        }
    }

    public void toggle(int x, int y) {
        this.board[x][y] = !this.board[x][y];
    }

    public void move(int x, int y) {
        if (this.properIndices(x, y)) {
            toggle(x, y);
            if (x > 0) {
                toggle(x - 1, y);
            }
            if (y > 0) {
                toggle(x, y - 1);
            }
            if (x < this.board.length - 1) {
                toggle(x + 1, y);
            }
            if (y < this.board[x].length - 1) {
                toggle(x, y + 1);
            }
        }
    }
}
