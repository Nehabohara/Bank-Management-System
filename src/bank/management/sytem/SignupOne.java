 
package bank.management.sytem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {
    
    long random;
    JTextField nameTextField, fnameTextfield, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField,pinTextField ;
    
    SignupOne(){
        
        setLayout(null);
        
       Random ran = new Random() ;
       random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        
        JLabel formno = new JLabel ("APPLICATION FORM NO."+ random);
        formno.setFont(new Font("Raleway", Font.BOLD,25));
        formno.setBounds(250,20,600,30);
        add(formno);
        
        JLabel personalDetails = new JLabel ("page 1:personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD,25));
        personalDetails.setBounds(250,50,600,40);
        add(personalDetails);
        
        JLabel name = new JLabel ("Name:");
       name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,100,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        nameTextField.setBounds(300,100,400,30);
        add(nameTextField);
        
        JLabel fname= new JLabel ("Father's Name:");
       fname.setFont(new Font("Raleway", Font.BOLD,20));
       fname.setBounds(100,140,200,30);
        add(fname);
        
       
          
       JTextField fnameTextField = new JTextField();
       fnameTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
       fnameTextField.setBounds(300,140,400,30);
       add(fnameTextField);
        
        JLabel dob = new JLabel ("Date of Birth:");
       dob.setFont(new Font("Raleway", Font.BOLD,20));
       dob.setBounds(100,180,200,30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
      
        dateChooser.setBounds(300,180,400,30);
        dateChooser.setForeground(new Color (105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel ("Gender:");
       gender.setFont(new Font("Raleway", Font.BOLD,20));
      gender.setBounds(100,220,200,30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,220,120,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("female");
        female.setBounds(450,220,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel ("Email Address:");
       email.setFont(new Font("Raleway", Font.BOLD,20));
      email.setBounds(100,260,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        emailTextField.setBounds(300,260,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel ("Marital Status:");
      marital.setFont(new Font("Raleway", Font.BOLD,20));
      marital.setBounds(100,300,200,30);
        add(marital);
        
        JRadioButton married = new JRadioButton("married");
        married.setBounds(300,300,100,30);
        married.setBackground(Color.WHITE);
        add(married);
                
    
        
        JRadioButton unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450,300,100,30);
    unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("other");
        other.setBounds(610,300,90,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
               
        
        JLabel address = new JLabel ("Address:");
       address.setFont(new Font("Raleway", Font.BOLD,20));
       address.setBounds(100,340,200,30);
        add( address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        addressTextField.setBounds(300,340,400,30);
        add(addressTextField);
        
        JLabel city= new JLabel ("City:");
       city.setFont(new Font("Raleway", Font.BOLD,20));
  city.setBounds(100,380,200,30);
        add( city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        cityTextField.setBounds(300,380,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel ("State:");
       state.setFont(new Font("Raleway", Font.BOLD,20));
      state.setBounds(100,420,200,30);
        add( state);
        
     stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        stateTextField.setBounds(300,420,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel ("Pin Code:");
      pincode.setFont(new Font("Raleway", Font.BOLD,20));
    pincode.setBounds(100,460,200,30);
        add( pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14)); 
        pinTextField.setBounds(300,460,400,30);
        add(pinTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,500,80,30);
        add(next);
       
        getContentPane().setBackground(Color.RED);
        
        setSize(850,600);
        setLocation(200,10);
        setVisible(true);
    }
    
    public static void main (String args[]){
        new SignupOne();
    }
   
    
}
