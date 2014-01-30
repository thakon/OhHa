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
    public void moveTest() {
        klein.move(0, 0);
        assertFalse(klein.isLit(0, 0));
        assertFalse(klein.isLit(0, 1));
        assertFalse(klein.isLit(1, 0));
        assertFalse(klein.isLit(4, 0));
        assertFalse(klein.isLit(4, 4));
    }
}