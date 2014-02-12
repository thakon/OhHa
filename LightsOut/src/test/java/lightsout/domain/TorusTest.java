
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
        torus = new Torus(5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toggleTestLowerLeftCorner() {
        torus.makeMove(0, 0);
        assertFalse(torus.isLit(0,0));
        assertFalse(torus.isLit(1,0));
        assertFalse(torus.isLit(0,1));
        assertFalse(torus.isLit(0,4));
        assertFalse(torus.isLit(4,0));
    }
    
    @Test
    public void toggleTestUpperRightCorner() {
        torus.makeMove(4, 4);
        assertFalse(torus.isLit(4,4));
        assertFalse(torus.isLit(3,4));
        assertFalse(torus.isLit(4,3));
        assertFalse(torus.isLit(0,4));
        assertFalse(torus.isLit(4,0));
    }
}