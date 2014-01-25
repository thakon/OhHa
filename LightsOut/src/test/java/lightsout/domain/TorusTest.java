
package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TorusTest {
    
    Torus torus;

    public TorusTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        torus = new Torus();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toggleTest() {
        torus.toggle(0, 0);
        assert (!torus.board[0][0].isLit());
        assert (!torus.board[1][0].isLit());
        assert (!torus.board[0][1].isLit());
        assert (!torus.board[0][4].isLit());
        assert (!torus.board[4][0].isLit());
    }
}