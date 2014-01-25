/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tuomas
 */
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
        assert(bulb.isLit());
    }
    
    @Test
    public void lightGoesOut() {
        bulb.toggle();
        assert(!bulb.isLit());
    }
}