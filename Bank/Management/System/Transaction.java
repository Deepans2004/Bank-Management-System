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
            text.setBounds(235,300,700,35);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("System",Font.BOLD,16));
            image.add(text);

            setSize(900,900);
            setLocation(300,0);
            setVisible(true);
        }

        public static void main(String args[]){
            new Transaction();
        }
}
