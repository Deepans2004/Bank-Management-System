package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signup2 extends JFrame implements ActionListener {

    JTextField pan,aadhar;
    JButton next;
    JRadioButton male,female,married,unmarried,Other;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,categor,occupation,education,income,occp;
    String formno;


    signup2(String formno){
        this.formno=formno;

        setLayout(null);

        setTitle("New Account Applivation form - Page2");


        JLabel AdditionalDetails= new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);

        JLabel Religion= new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100,140,100,30);
        add(Religion);

        String valreligion[]={"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        religion = new JComboBox(valreligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel Category= new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100,190,200,30);
        add(Category);

        String category[]={"General", "OBC", "ST", "SC", "Others"};
        categor = new JComboBox(category);
        categor.setBounds(300,190,400,30);
        categor.setBackground(Color.WHITE);
        add(categor);


        JLabel Income= new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100,240,200,30);
        add(Income);


        String valincome[]={"NULL", "<1,50,000>", "<2,50,000>", "<5,00,000>", "Upto 10,00000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel Education= new JLabel("Educational:");
        Education.setFont(new Font("Raleway", Font.BOLD, 20));
        Education.setBounds(100,290,200,30);
        add(Education);

        JLabel qualify= new JLabel("Qualification:");
        qualify.setFont(new Font("Raleway", Font.BOLD, 20));
        qualify.setBounds(100,315,200,30);
        add(qualify);

        String valeducational[]={"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        education = new JComboBox(valeducational);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel Occupation= new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);

        String valoccp[]={"Salaried", "Self-Employed", "Bussiness", "Student","Retired", "Others"};
        occp = new JComboBox(valoccp);
        occp.setBounds(300,390,400,30);
        occp.setBackground(Color.WHITE);
        add(occp);

        JLabel PAN= new JLabel("PAN No:");
        PAN.setFont(new Font("Raleway", Font.BOLD, 20));
        PAN.setBounds(100,440,200,30);
        add(PAN);

        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel Aadhar= new JLabel("Aadhar Number:");
        Aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        Aadhar.setBounds(100,490,200,30);
        add(Aadhar);

        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel Senior= new JLabel("Senior Citizen:");
        Senior.setFont(new Font("Raleway", Font.BOLD, 20));
        Senior.setBounds(100,540,200,30);
        add(Senior);

        syes=new JRadioButton("yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorcitizen=new ButtonGroup();
        seniorcitizen.add(syes);
        seniorcitizen.add(sno);

        JLabel Existing= new JLabel("Existing Account:");
        Existing.setFont(new Font("Raleway", Font.BOLD, 20));
        Existing.setBounds(100,590,200,30);
        add(Existing);

        eyes=new JRadioButton("yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup excisting=new ButtonGroup();
        excisting.add(eyes);
        excisting.add(eno);

        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scatedory= (String) categor.getSelectedItem();
        String sincome= (String) income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occp.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }

        else if(sno.isSelected()){
            seniorcitizen="no";
        }
        String Existing=null;
        if(eyes.isSelected()){
            Existing="yes";
        }
        else if(eno.isSelected()){
            Existing="No";
        }

        String span =pan.getText();
        String saadhar=aadhar.getText();

        try{
                conn c=new conn();
                String query= "insert into signup2 values('"+formno+"','"+sreligion+"','"+scatedory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+Existing+"')";
                c.s.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[]args){
        new signup2("");
    }
}
