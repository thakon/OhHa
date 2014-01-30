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
                assertTrue(b.isLit());
            }
        }
    }

    @Test
    public void solveCheckerWorksProperly() {
        assertFalse(board.isSolved());
        for (Bulb[] row : board.board) {
            for (Bulb b : row) {
                b.setIsLit(false);
            }
        }
        assertTrue(board.isSolved());
    }

    @Test
    public void toggleTest() {
        board.toggle(1, 1);
        assertFalse(board.board[1][1].isLit());
        assertFalse(board.board[0][1].isLit());
        assertFalse(board.board[1][0].isLit());
        assertFalse(board.board[2][1].isLit());
        assertFalse(board.board[1][2].isLit());
    }
    
    @Test
    public void toggleTestCorner() {
        board.toggle(4, 4);
        assertFalse(board.board[4][4].isLit());
        assertFalse(board.board[3][4].isLit());
        assertFalse(board.board[4][3].isLit());
    }
    
    @Test
    public void toggleTestWrongInput(){
        board.toggle(5, 4);
        board.toggle(4, 5);
        assertTrue(board.board[4][4].isLit());
    }

    @Test
    public void indicesTest() {
        assertFalse(board.properIndices(4, 5));
        assertFalse(board.properIndices(-1, 0));
        assertTrue(board.properIndices(0, 0));
        assertTrue(board.properIndices(4, 4));
        assertTrue(board.properIndices(1, 1));
    }
}