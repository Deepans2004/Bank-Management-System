package Bank.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    JButton login,Signup,Clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;

    Login() {

        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text= new JLabel("Welcome to TAP ATM");
        text.setFont(new Font("Osward",Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel Cardno= new JLabel("Card No:");
        Cardno.setFont(new Font("Raleway",Font.BOLD, 28));
        Cardno.setBounds(120, 150  ,150,30);
        add(Cardno);

        cardtextfield = new JTextField();
        cardtextfield.setBounds(300,150,230,30);
        cardtextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardtextfield);

        JLabel pin= new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD, 28));
        pin.setBounds(120,220,250,30);
        add(pin);

        pintextfield = new JPasswordField();
        pintextfield.setBounds(300,220,230,30);
        pintextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(pintextfield);

        login=new JButton("Sign in");
        login.setBounds(300, 300, 100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        Clear=new JButton("Clear");
        Clear.setBounds(430, 300, 100,30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.white);
        Clear.addActionListener(this);
        add(Clear);

        Signup=new JButton("Sign up");
        Signup.setBounds(300, 350, 230,30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.white);
        Signup.addActionListener(this);
        add(Signup);

        getContentPane().setBackground(Color.white);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
         if( ae.getSource() == Clear){
             cardtextfield.setText("");
             pintextfield.setText("");
        }
        else if(ae.getSource() == login){

         }
        else if(ae.getSource() == Signup){

         }
    }
    public static void main(String[]args){
        new Login();

    }
}
