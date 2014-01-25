package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    Board board;

    public BoardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        board = new Board();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorWorksProperly() {
        for (Bulb[] row : board.board) {
            for (Bulb b : row) {
                assert (b.isLit());
            }
        }
    }

    @Test
    public void solvedCheckerWorksProperly() {
        for (Bulb[] row : board.board) {
            for (Bulb b : row) {
                b.toggle();
            }
        }
        assert (board.isSolved());
    }

    @Test
    public void toggleTest() {
        board.toggle(1, 1);
        assert (!board.board[1][1].isLit());
        assert (!board.board[0][1].isLit());
        assert (!board.board[1][0].isLit());
        assert (!board.board[2][1].isLit());
        assert (!board.board[1][2].isLit());
    }

    @Test
    public void wrongIndicesDontMessThingsUp() {
        board.toggle(5, 7);
    }
}