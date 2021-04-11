import javax.swing.*;
public class TextAreaExample
{
    TextAreaExample()
    {
    JFrame f=new JFrame();
    JTextArea area=new JTextArea("welcome to java");
    area.setBounds(10,30,200,200);
    f.add(area);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
}
public static void main(String ar[])
{
    new TextAreaExample();
}
}