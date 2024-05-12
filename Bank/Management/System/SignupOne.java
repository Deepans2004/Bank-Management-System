package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nametextfield,fnametextfield,emailtextfield,addtextfield,citytextfield,statetextfield,pincodetextfield;
    JButton next;
    JRadioButton male,female,married,unmarried,Other;
    JDateChooser dateChooser;

    SignupOne(){

        setLayout(null);

        Random ran=new Random();
        long random=(Math.abs((ran.nextLong()%9000L)+1000L));

        JLabel formno= new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel PersonalDetails= new JLabel("Page 1: Personal Details");
        PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);

        JLabel Name= new JLabel("Name:");
        Name.setFont(new Font("Raleway", Font.BOLD, 20));
        Name.setBounds(100,140,100,30);
        add(Name);

        nametextfield=new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nametextfield.setBounds(300,140,400,30);
        add(nametextfield);


        JLabel Fname= new JLabel("Fathers Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20));
        Fname.setBounds(100,190,200,30);
        add(Fname);

        fnametextfield=new JTextField();
        fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fnametextfield.setBounds(300,190,400,30);
        add(fnametextfield);

        JLabel dob= new JLabel("Date of birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel Gen= new JLabel("Gender:");
        Gen.setFont(new Font("Raleway", Font.BOLD, 20));
        Gen.setBounds(100,290,200,30);
        add(Gen);

        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email= new JLabel("E-Mail Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        emailtextfield=new JTextField();
        emailtextfield.setFont(new Font("Raleway",Font.BOLD,14));
        emailtextfield.setBounds(300,340,400,30);
        add(emailtextfield);

        JLabel Mstatus= new JLabel("Marital Status:");
        Mstatus.setFont(new Font("Raleway", Font.BOLD, 20));
        Mstatus.setBounds(100,390,200,30);
        add(Mstatus);

        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        Other=new JRadioButton("Other");
        Other.setBounds(630,390,100,30);
        Other.setBackground(Color.WHITE);
        add(Other);


        ButtonGroup statusgroup=new ButtonGroup();
        statusgroup.add(married);
        statusgroup.add(unmarried);
        statusgroup.add(Other);

        JLabel address= new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        addtextfield=new JTextField();
        addtextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addtextfield.setBounds(300,440,400,30);
        add(addtextfield);

        JLabel city= new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(300,490,400,30);
        add(citytextfield);

        JLabel State= new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100,540,200,30);
        add(State);

        statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(300,540,400,30);
        add(statetextfield);

        JLabel Pin= new JLabel("Pin Code:");
        Pin.setFont(new Font("Raleway", Font.BOLD, 20));
        Pin.setBounds(100,590,200,30);
        add(Pin);

        pincodetextfield=new JTextField();
        pincodetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pincodetextfield.setBounds(300,590,400,30);
        add(pincodetextfield);

        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralewa", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        String formno = "" +random;
        String name= nametextfield.getText();
        String fname=fnametextfield.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender= null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailtextfield.getText();
        String maritalstatus=null;
        if(married.isSelected()){
            maritalstatus="Married";
        }
        else if(unmarried.isSelected()){
            maritalstatus="Unmarried";
        }
        else if(Other.isSelected()){
            maritalstatus="Other";
        }

        String address=addtextfield.getText();
        String city=citytextfield.getText();
        String state=statetextfield.getText();
        String pincode=pincodetextfield.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[]args){
        new SignupOne();
    }
}
