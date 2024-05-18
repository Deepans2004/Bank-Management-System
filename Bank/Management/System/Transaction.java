package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit,withdrawl,fastcash,mini,pinchange,balancewnuiry,exit;
    String pinnumber;

        Transaction(String pinnumber) {
            this.pinnumber=pinnumber;

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

            deposit=new JButton("Deposit");
            deposit.setBounds(170,415,150,30);
            deposit.addActionListener(this);
            image.add(deposit);

            withdrawl=new JButton("Withdrawl");
            withdrawl.setBounds(355,415,150,30);
            withdrawl.addActionListener(this);
            image.add(withdrawl);

            fastcash=new JButton("Fast cash");
            fastcash.setBounds(170,450,150,30);
            fastcash.addActionListener(this);
            image.add(fastcash);

            mini=new JButton("Mini Statement");
            mini.setBounds(355,450,150,30);
            mini.addActionListener(this);
            image.add(mini);

            pinchange=new JButton("Pin Change");
            pinchange.setBounds(170,485,150,30);
            pinchange.addActionListener(this);
            image.add(pinchange);

            balancewnuiry=new JButton("Balance Enquiry");
            balancewnuiry.setBounds(355,485,150,30);
            balancewnuiry.addActionListener(this);
            image.add(balancewnuiry);

            exit=new JButton("Exit");
            exit.setBounds(355,520,150,30);
            exit.addActionListener(this);
            image.add(exit);

            setSize(900,900);
            setLocation(300,0);
            setUndecorated(true);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==exit){
                System.exit(0);
            }
        }

        public static void main(String args[]){
            new Transaction("");
        }
}
