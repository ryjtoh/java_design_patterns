package structural_patterns.proxy.some_cool_media_library.flyweight.trees;

import java.awt.*;

public class Tree {
    int x;
    int y;
    TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
