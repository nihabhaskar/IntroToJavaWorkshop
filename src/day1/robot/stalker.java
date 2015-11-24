package day1.robot;

import javax.swing.JOptionPane;

public class stalker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= JOptionPane.showInputDialog(null, "What is your full name?");
		String food= JOptionPane.showInputDialog(null, "What is your favorite food?");
	    String color= JOptionPane.showInputDialog("What is your favorite color?");
	    String school= JOptionPane.showInputDialog("What school do you go to?");
	    String subject= JOptionPane.showInputDialog("Where could I find you today at 9:00");
	    JOptionPane.showMessageDialog(null, "Hi "+ name);
	    JOptionPane.showMessageDialog(null, "I know all about you");
	    JOptionPane.showMessageDialog(null, "Your favorite food is " + food);
	    JOptionPane.showMessageDialog(null, "Your favorite color is " + color);
	    JOptionPane.showMessageDialog(null, "You attend " + school);
	    JOptionPane.showMessageDialog(null, "You will be at " + subject + " at 9:00");
	    JOptionPane.showMessageDialog(null, "And I will find you and kill you");
	    
	}

}
