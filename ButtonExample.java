import java.awt.event.*;
import javax.swing.*;
public class ButtonExample
{
    public static void main(String ar[])
    {
        JFrame f=new JFrame("ButtonExample");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b=new JButton("click here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("welcome to luv kumar");
            }
            });
            f.add(b);
            f.add(tf);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);

            }
        }

    
