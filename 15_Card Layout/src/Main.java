import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    Button b1,b2,b3;

    TextField t1,t2,t3;

    Panel p1;
    Panel p2;
    Panel cp;

    Panel mainPanel;

    Checkbox c1,c2;

    CardLayout cl;

    public MyFrame()
    {
        super("CardLayout Demo");

        CheckboxGroup cg = new CheckboxGroup();

        c1 = new Checkbox("One",true,cg);
        c2 = new Checkbox("Two",false,cg);

        c1.addItemListener(this);
        c2.addItemListener(this);

        c1 = new Checkbox("One");
        c2 = new Checkbox("Two");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        cl = new CardLayout();
        mainPanel = new Panel();
        mainPanel.setLayout(new CardLayout());

        mainPanel.add("One",p1);
        mainPanel.add("Two",p2);

        add(cp,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.getState())
            cl.first(mainPanel);
        else {
            cl.last(mainPanel);

        }
    }
}

public class Main {
    public static void main(String[] args)
    {
       MyFrame f = new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
    }
}