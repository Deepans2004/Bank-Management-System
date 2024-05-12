package Bank.Management.System;
import javax.swing.*;
import java.awt.*;

public class SignupOne extends JFrame {

    SignupOne(){
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main(String[]args){
        new SignupOne();
    }
}
