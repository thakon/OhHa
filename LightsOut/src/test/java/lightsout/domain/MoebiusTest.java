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
        moebius = new Moebius(5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toggleTestLeftSide() {
        moebius.makeMove(1, 0);
        assertFalse(moebius.isLit(1,0));
        assertFalse(moebius.isLit(0,0));
        assertFalse(moebius.isLit(2,0));
        assertFalse(moebius.isLit(1,1));
        assertFalse(moebius.isLit(3,4));
    }

    @Test
    public void toggleTestRightSide() {
        moebius.makeMove(3, 4);
        assertFalse(moebius.isLit(3,4));
        assertFalse(moebius.isLit(4,4));
        assertFalse(moebius.isLit(3,3));
        assertFalse(moebius.isLit(2,4));
        assertFalse(moebius.isLit(1,0));
    }
}