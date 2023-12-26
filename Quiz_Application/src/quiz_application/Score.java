
package quiz_application;
import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;

public class Score extends JFrame{// implements ActionListener{
    
    Score(String name,int score)
    {
       setSize(750,550);
       setLocation(400,150);
       
       getContentPane().setBackground(Color.white);
       setLayout(null);
       ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
       Image i2=i.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,200,300,250);
       add(image);
       
       JLabel heading=new JLabel("ThankYou "+name);
       heading.setBounds(45,30,700,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,34));
       add(heading);
       
       JLabel heading1=new JLabel("Your score is: "+score);
       heading1.setBounds(350,200,300,30);
       heading1.setFont(new Font("Tahoma",Font.PLAIN,34));
       add(heading1);
       
       /* JButton next=new JButton("");
        next.setBounds(1100,630,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(Color.blue);
        next.setForeground(Color.white);
        next.setEnabled(false);
        next.addActionListener(this);*/
       
       setVisible(true);
    }
    
 //   public void actionPerformed(ActionEvent ae){
        
  //  }
    
    
    public static void main(String args[])
    {
        new Score("User",0);
    }
}
