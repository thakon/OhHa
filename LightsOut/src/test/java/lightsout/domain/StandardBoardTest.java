package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StandardBoardTest {

    StandardBoard board;

    public StandardBoardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        board = new StandardBoard(5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorWorksProperly() {
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                assertTrue(board.isLit(i, j));
            }
        }
    }

    @Test
    public void solveCheckerWorksProperly() {
        assertFalse(board.isSolved());
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                board.toggle(i, j);
            }
        }
        assertTrue(board.isSolved());
    }

    @Test
    public void resetTest() {
        board.randomize();
        board.reset();
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                assertTrue(board.isLit(i, j));
            }
        }
    }

    @Test
    public void toggleTest() {
        board.makeMove(1, 1);
        assertFalse(board.isLit(1, 1));
        assertFalse(board.isLit(0, 1));
        assertFalse(board.isLit(1, 0));
        assertFalse(board.isLit(2, 1));
        assertFalse(board.isLit(1, 2));
    }

    @Test
    public void toggleTestCorner() {
        board.makeMove(4, 4);
        assertFalse(board.isLit(4, 4));
        assertFalse(board.isLit(3, 4));
        assertFalse(board.isLit(4, 3));
    }

    @Test
    public void toggleTestWrongInput() {
        board.makeMove(5, 4);
        board.makeMove(4, 5);
        assertTrue(board.isLit(4, 4));
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