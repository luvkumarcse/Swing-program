import javax.swing.*;
public class PasswordFieldExample
{
    public static void main(String ar[])
    {
        JFrame f=new JFrame("password field example");
        JPasswordField value=new JPasswordField();
        JLabel l1=new JLabel("password");
        l1.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        f.add(value);
        f.add(l1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    }
