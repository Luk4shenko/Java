package figures;

import java.awt.*;
import java.util.Random;
import lab5.Shape;
public class Rectangle extends Shape {

    @Override
    protected int FirstParameters() {
        return 10 + (int) (Math.random() * 50);
    }

    @Override
    protected int SecondParameters() { return 10 + (int) (Math.random() * 50); }

    @Override
    protected Color setColor() { return getColor(); }
}
