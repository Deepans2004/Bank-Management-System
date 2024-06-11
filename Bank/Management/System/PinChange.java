package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JTextField pin,repin;
    JButton change,back;


    PinChange(String pinchange){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("CHANE YOUR PIN?");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);

        JLabel pintext=new JLabel("New PIN: ");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);

        pin=new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);

        JLabel repintext=new JLabel("re-enter PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);

        repin=new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(330,360,180,25);
        image.add(repin);

        change=new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);

        back=new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);


        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();

            if(!npin.equals(repin)){
                JOptionPane.showMessageDialog(null,"Entered pin does not match");
                return;
            }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter new PIN");
                return;
            }

            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Reenter new pin");
                return;
            }

            conn c=new conn();

        }catch(Exception e){
            System.out.println(e);
        }

        }else{
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }

    }

    public static void main(String[]args){
        new PinChange("").setVisible(true);
    }
}
