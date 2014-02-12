/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.domain;

/**
 *
 * @author Tuomas
 */
public interface Board {

    boolean isLit(int x, int y);

    boolean isSolved();

    void reset();

    void randomize();

    void makeMove(int x, int y);

    int size();
}
