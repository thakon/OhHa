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
    public void toggleTest() {
        moebius.toggle(1, 0);
        assertFalse(moebius.board[1][0].isLit());
        assertFalse(moebius.board[0][0].isLit());
        assertFalse(moebius.board[2][0].isLit());
        assertFalse(moebius.board[1][1].isLit());
        assertFalse(moebius.board[3][4].isLit());
    }
}