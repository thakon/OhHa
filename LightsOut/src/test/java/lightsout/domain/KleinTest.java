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
        klein = new Klein(5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void moveTestLowerLeftCorner() {
        klein.makeMove(0, 0);
        assertFalse(klein.isLit(0, 0));
        assertFalse(klein.isLit(1, 0));
        assertFalse(klein.isLit(0, 1));
        assertFalse(klein.isLit(4, 0));
        assertFalse(klein.isLit(4, 4));
    }

    @Test
    public void moveTestUpperRightCorner() {
        klein.makeMove(4, 4);
        assertFalse(klein.isLit(4, 4));
        assertFalse(klein.isLit(4, 3));
        assertFalse(klein.isLit(3, 4));
        assertFalse(klein.isLit(0, 0));
        assertFalse(klein.isLit(0, 4));
    }

    @Test
    public void moveTestSide() {
        klein.makeMove(1, 0);
        assertFalse(klein.isLit(1, 0));
        assertFalse(klein.isLit(2, 0));
        assertFalse(klein.isLit(1, 1));
        assertFalse(klein.isLit(0, 0));
        assertFalse(klein.isLit(3, 4));
    }
}