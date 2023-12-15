/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author fa20-bse-061
 */
import java.awt.Color;
import java.awt.Graphics;

public class FruitTreeDecorater implements ITree {

    TreeType tree;
    Color color = Color.BLUE;

    public FruitTreeDecorater(TreeType tree) {

        this.tree = tree;

    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        tree.draw(g, x, y);
    }

}