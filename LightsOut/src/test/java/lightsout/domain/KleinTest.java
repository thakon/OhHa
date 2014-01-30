package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KleinTest {
    
    Klein klein;

    public KleinTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        klein = new Klein();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toggleTestLowerLeftCorner() {
        klein.toggle(0, 0);
        assertFalse(klein.board[0][0].isLit());
        assertFalse(klein.board[1][0].isLit());
        assertFalse(klein.board[0][1].isLit());
        assertFalse(klein.board[4][0].isLit());
        assertFalse(klein.board[4][4].isLit());
    }
    
    @Test
    public void toggleTestUpperRightCorner() {
        klein.toggle(4, 4);
        assertFalse(klein.board[4][4].isLit());
        assertFalse(klein.board[4][3].isLit());
        assertFalse(klein.board[3][4].isLit());
        assertFalse(klein.board[0][0].isLit());
        assertFalse(klein.board[0][4].isLit());
    }
    
    @Test
    public void toggleTestSide() {
        klein.toggle(1, 0);
        assertFalse(klein.board[1][0].isLit());
        assertFalse(klein.board[2][0].isLit());
        assertFalse(klein.board[1][1].isLit());
        assertFalse(klein.board[0][0].isLit());
        assertFalse(klein.board[3][4].isLit());
    }
    
    
}