
package lightsout.domain;

public class Bulb {
    private boolean isLit;

    public Bulb() {
        this.isLit = true;
    }
    
    public boolean isLit() {
        return this.isLit;
    }
    
    public void toggle() {
        this.isLit = !this.isLit;
    }

    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
    }
    
    
}
