package ua.samosfator.gmm.tools.shapes;

import ua.samosfator.gmm.tools.gui.ActionPicker;
import ua.samosfator.gmm.tools.gui.RectSizeSetter;

import java.awt.*;
import java.awt.event.InputEvent;

public class Rectangle {
    public void draw(final int[][] points) throws Exception {
        Robot bot = new Robot();
        for (int[] p : points) {
            bot.mouseMove(p[0], p[1]);
            bot.mousePress(InputEvent.BUTTON1_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_MASK);
            bot.delay(500);
        }
        ActionPicker.show();
    }

    public void set() {
        RectSizeSetter rectSizeSetter = new RectSizeSetter();
    }
}
