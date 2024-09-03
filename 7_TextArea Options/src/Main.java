import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
       TextArea ta;
       TextField tf;
       Label l;
       Button b;

       MyFrame()
       {
           super("TextArea Demo");
           l = new Label("No text Entered");
           ta = new TextArea(10,30);
           tf = new TextField(20);
           b = new Button("Click");

           setLayout(new FlowLayout());

           add(ta);
           add(l);
           add(tf);
           add(b);
           b.addActionListener(this);
       }
       public void actionPerformed(ActionEvent ae)
       {
           l.setText(ta.getSelectedText());
       }
}

public class Main {
    public static void main(String[] args)
    {
        Frame f = new Frame();
        System.out.println("Main running1");

        f.setSize(400,400);
        System.out.println("Main running2");
        f.setVisible(true);
        System.out.println("Main running3");

    }
}