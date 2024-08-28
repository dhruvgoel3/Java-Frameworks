//isA means inheritance and has a means containment , having an object

import java.awt.*;

class MyFrame extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public MyFrame()
    {
        super("My App");
        setLayout(new FlowLayout());

        l = new Label("Namw");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);

    }

}

public class Main extends Frame {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}