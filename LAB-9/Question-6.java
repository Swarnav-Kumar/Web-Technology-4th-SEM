//Design an applet to display a house

import java.awt.*;
import javax.swing.*;

public class program10_6 extends JApplet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.blue);
        g.fillRect(50, 50, 300, 50);
        g.setColor(Color.green);
        g.fillOval(150, 150, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Applet");
        program10_6 houseApplet = new program10_6();
        frame.add(houseApplet);
        frame.setSize(400, 400);
        frame.setVisible(true);
        houseApplet.init();
        houseApplet.start();
    }
}
