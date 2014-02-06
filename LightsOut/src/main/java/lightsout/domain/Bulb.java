
package lightsout.domain;
/**
 * Simple class representing a bulb that can be
 * either on or off.
 * @author Tuomas
 */
public class Bulb {
/**
 * Tells whether the bulb is lit or not.
 * true=lit, false=notlit
 */
    private boolean isLit;
/**
 * New bulb is set lit.
 */
    public Bulb() {
        this.isLit = true;
    }
 /**
  * Simple getter.
  * @return Returns the value of variable isLit
  */   
    public boolean isLit() {
        return this.isLit;
    }
    /**
     * Changes isLit to its negation.
     */
    public void toggle() {
        this.isLit = !this.isLit;
    }
    
    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
    }
    
    
}
