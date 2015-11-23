package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot URobot = new Robot("batman");
		String y=JOptionPane.showInputDialog("What shape");
		if (y.equals("octogon")){
			for (int i = 0; i < 8; i++) {
				URobot.penDown();
				URobot.move(100);
				URobot.turn(360/8);
				
				
				
			}
		
		}
		if (y.equals("Pentagon")){
			URobot.penDown();
			URobot.move(100);
			URobot.turn(360/5);
		}
		if (y.equals("haha")){
				URobot.penDown();
				URobot.move(100);
				URobot.turn(360/100);
		}

	}

}
