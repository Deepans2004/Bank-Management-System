package Bank.Management.System;
import javax.swing.*;

public class Login extends JFrame {

    Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label= new JLabel(il);
        add(label);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[]args){
        new Login();

    }
}
