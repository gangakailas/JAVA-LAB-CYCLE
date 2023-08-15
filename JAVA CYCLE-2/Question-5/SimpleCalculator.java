package SimpleCalculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ganga
 */
public class SimpleCalculator extends JFrame{
    
    JPanel myPanel;
    JButton myButton;
    JLabel myLabel1, myLabel2;
    JTextField myTextField1, myTextField2, myResult;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bGroup;
    
    public SimpleCalculator()
    {
        this.setTitle("Simple Calculator");
        this.setSize(400,600);
        this.setLocation(500,150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        myPanel = new JPanel();
        
        myLabel1 = new JLabel("Enter first number: ");
        myLabel1.setBounds(40, 70, 200, 30);
        
        myTextField1 = new JTextField();
        myTextField1.setBounds(180, 70, 150, 30);
        
        myLabel2 = new JLabel("Enter second number: ");
        myLabel2.setBounds(40, 120, 200, 30);
        
        myTextField2 = new JTextField();
        myTextField2.setBounds(180, 120, 150, 30);
        
        rb1 = new JRadioButton("+");
        rb1.setBounds(120, 200, 50, 50);
        
        rb2 = new JRadioButton("-");
        rb2.setBounds(230, 200, 50, 50);
        
        rb3 = new JRadioButton("*");
        rb3.setBounds(120, 250, 50, 50);
        
        rb4 = new JRadioButton("/");
        rb4.setBounds(230, 250, 50, 50);
        
        myButton = new JButton("Calculate");
        myButton.setBounds(145, 335, 100, 30);
        
        myResult= new JTextField();
        myResult.setBounds(120, 400, 150, 30);     
        
        bGroup= new ButtonGroup();
        bGroup.add(rb1);
        bGroup.add(rb2);
        bGroup.add(rb3);
        bGroup.add(rb4);
        
        this.add(myPanel);
        myPanel.setLayout(null);
        myPanel.add(myLabel1);
        myPanel.add(myLabel2);
        myPanel.add(myTextField1);
        myPanel.add(myTextField2);
        myPanel.add(rb1);
        myPanel.add(rb2);
        myPanel.add(rb3);
        myPanel.add(rb4);
        myPanel.add(myButton);
        myPanel.add(myResult);
        this.add(myPanel);
        this.setVisible(true);
        
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(null, "Your Clicked", "Response", 1);
                int x = Integer.parseInt(myTextField1.getText());
                int y = Integer.parseInt(myTextField2.getText());
        
                int z=0;
                if(rb1.isSelected())
                    z=x+y;
                else if(rb2.isSelected())
                    z=x-y;
                else if(rb3.isSelected())
                    z=x*y;
                else if(rb4.isSelected())
                    z=x/y;

                myResult.setText(Integer.toString(z));
                
            }
        });
        
    }
    
    public static void main(String[] args){
        new SimpleCalculator();
    }
}
