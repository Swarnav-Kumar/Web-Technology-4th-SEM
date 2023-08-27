/*. Create an applet that counts and displays the number of times a button 
has been pressed.*/
import java.awt.*;
import java.awt.event.*;

public class program10_4 extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public program10_4() {
        setLayout(new FlowLayout());
        lblCount = new Label("Counter");
        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        btnCount = new Button("Count");
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++count;
                tfCount.setText(count + "");
            }
        });
        add(lblCount);
        add(tfCount);
        add(btnCount);
        setTitle("AWT Counter");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new program10_4();
    }
}
