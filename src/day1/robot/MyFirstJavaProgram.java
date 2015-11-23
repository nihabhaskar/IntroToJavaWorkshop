package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot TRobot=new Robot ();
TRobot.setSpeed(30000);
	TRobot.move(300);
	TRobot.miniturize();
	TRobot.setSpeed(3000000);
	TRobot.turn(180);
	TRobot.move(100,100);
	TRobot.setPenColor(Color.GREEN);
	TRobot.setPenWidth(20);
	TRobot.penDown();
	TRobot.expand();
Robot KRobot=new Robot ("batman");
KRobot.setSpeed(100);
	KRobot.move(7000);
Robot JRobot=new Robot ("june");
	JRobot.sparkle();


	}
}
