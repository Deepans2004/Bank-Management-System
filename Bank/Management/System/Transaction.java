package Bank.Management.System;

import javax.swing.*;
import java.awt.*;

public class Transaction extends JFrame {

        Transaction() {

            setLayout(null);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
            ImageIcon i3= new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(0,0,900,900);
            add(image);

            JLabel text=new JLabel("Please Select your Transactions");
            text.setBounds(210,300,700,35);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("System",Font.BOLD,16));
            image.add(text);

            JButton deposit=new JButton("Deposit");
            deposit.setBounds(170,415,150,30);
            image.add(deposit);

            JButton withdrawl=new JButton("Withdrawl");
            withdrawl.setBounds(355,415,150,30);
            image.add(withdrawl);

            JButton fastcash=new JButton("Fast cash");
            fastcash.setBounds(170,450,150,30);
            image.add(fastcash);

            JButton mini=new JButton("Mini Statement");
            mini.setBounds(355,450,150,30);
            image.add(mini);

            JButton pinchange=new JButton("Pin Change");
            pinchange.setBounds(170,485,150,30);
            image.add(pinchange);

            JButton balancewnuiry=new JButton("Balance Enquiry");
            balancewnuiry.setBounds(355,485,150,30);
            image.add(balancewnuiry);

            JButton exit=new JButton("Exit");
            exit.setBounds(355,520,150,30); 
            image.add(exit);

            setSize(900,900);
            setLocation(300,0);
//            setUndecorated(true);
            setVisible(true);
        }

        public static void main(String args[]){
            new Transaction();
        }
}
