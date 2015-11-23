package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class efficienttri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot LRobot = new Robot("batman");
		LRobot.setPenColor(Color.GREEN);
		LRobot.penDown();

		LRobot.move(50);
		for (int i = 0; i < 10; i++) {
			LRobot.move(20);
			for (int k = 0; k < 360; k++) {
				LRobot.move(1);
				LRobot.turn(1);
		
			}
		}

	}

}
