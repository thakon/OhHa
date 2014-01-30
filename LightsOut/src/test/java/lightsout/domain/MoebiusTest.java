package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoebiusTest {

    Moebius moebius;

    public MoebiusTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        moebius = new Moebius();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toggleTestLeftSide() {
        moebius.toggle(1, 0);
        assertFalse(moebius.board[1][0].isLit());
        assertFalse(moebius.board[0][0].isLit());
        assertFalse(moebius.board[2][0].isLit());
        assertFalse(moebius.board[1][1].isLit());
        assertFalse(moebius.board[3][4].isLit());
    }

    @Test
    public void toggleTestRightSide() {
        moebius.toggle(3, 4);
        assertFalse(moebius.board[3][4].isLit());
        assertFalse(moebius.board[4][4].isLit());
        assertFalse(moebius.board[3][3].isLit());
        assertFalse(moebius.board[2][4].isLit());
        assertFalse(moebius.board[1][0].isLit());
    }
}