
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton enter,exit;
    JTextField ti;
    public static void main(String args[])
    {
        new Login();
        
    }
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(0,0,500,500);
        add(image);
        JLabel heading=new JLabel("Simple minds");
        heading.setBounds(650,30,250,50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,34));
        heading.setForeground(Color.blue);
        add(heading);
        
        JLabel heading1=new JLabel("Enter Your Name");
        heading1.setBounds(685,150,250,35);
        heading1.setFont(new Font("SnasSerif",Font.BOLD,20));
        heading1.setForeground(Color.blue);
        add(heading1);
      
        ti=new JTextField();
        ti.setBounds(620,180,300,25);
        ti.setFont(new Font("SnasSerif",Font.PLAIN,22));
        add(ti);
        
        enter=new JButton("Enter Quiz");
        enter.setBounds(620,220,120,25);
        enter.setBackground(Color.blue);
        enter.setForeground(Color.white);
        enter.addActionListener(this);
        add(enter);
        
        exit=new JButton("Exit");
        exit.setBounds(800,220,120,25);
        exit.setBackground(Color.blue);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);
        
        
        
        setVisible(true);
        setSize(1000,500);
        setLocation(250,200);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==enter)
        {
            String name=ti.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==exit)
        {
          setVisible(false);
        }
    }
}
