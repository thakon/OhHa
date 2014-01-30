
package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BulbTest {
    
    Bulb bulb;

    public BulbTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        bulb = new Bulb();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorWorksProperly() {
        assertTrue(bulb.isLit());
    }
    
    @Test
    public void lightGoesOut() {
        bulb.toggle();
        assertFalse(bulb.isLit());
    }
    
    @Test
    public void lightGoesOn() {
        bulb.setIsLit(false);
        bulb.toggle();
        assertTrue(bulb.isLit());
    }
}