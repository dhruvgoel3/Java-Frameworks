import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class MyFrame extends Frame implements KeyListener
{
      Label l1,l2,l3,l4;

      MyFrame()
      {
          super("KeyEvent Demo");

          l1 = new Label("");
          l1 = new Label("");
          l1 = new Label("");
          l1 = new Label("");

          setLayout(null);

          l1.setBounds(30,20,100,20);
          l2.setBounds(30,50,100,20);
          l2.setBounds(30,80,100,20);
          l2.setBounds(30,110,200,20);

          add(l1);
          add(l2);
          add(l3);
          add(l4);
      }

    @Override
    public void keyTyped(KeyEvent ke) {
      l3.setText("Key typed");
      l4.setText(new Date(ke.getWhen())+"");
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
      l1.setText("Key Pressed");
      l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
         l2.setText("Key Released");
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