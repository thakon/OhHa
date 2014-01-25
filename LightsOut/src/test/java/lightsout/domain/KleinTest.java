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
    public void toggleTest() {
        klein.toggle(0, 0);
        assert (!klein.board[0][0].isLit());
        assert (!klein.board[0][1].isLit());
        assert (!klein.board[1][0].isLit());
        assert (!klein.board[4][0].isLit());
        assert (!klein.board[4][4].isLit());
    }
}