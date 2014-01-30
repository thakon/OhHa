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
        for (boolean[] row : board.board) {
            for (boolean b : row) {
                assertTrue(b);
            }
        }
    }

    @Test
    public void solvedCheckerWorksProperly() {
        for (int i = 0; i < board.board.length; i++) {
            for (int j = 0; j < board.board[i].length; j++) {
                board.toggle(i, j);
            }
        }
        assertTrue(board.isSolved());
    }
    
    @Test
    public void toggleTest() {
        assertTrue(board.isLit(0, 0));
        board.toggle(0, 0);
        assertFalse(board.isLit(0, 0));
    }

    @Test
    public void moveTest() {
        board.move(1, 1);
        assertFalse(board.isLit(1, 1));
        assertFalse(board.isLit(0, 1));
        assertFalse(board.isLit(1, 0));
        assertFalse(board.isLit(2, 1));
        assertFalse(board.isLit(1, 2));
    }
}