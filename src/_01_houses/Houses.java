package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robo = new Robot("batman");
	public void run() {
		robo.setX(10);
		robo.setY(500);
		robo.setSpeed(1000);
		robo.penDown();
		for(int i=0; i<10; i+=1) {
			drawHouse("large", "flat", 150, 200, 255);
		}
	
}
	public void drawHouse(String height, String type, int colorR, int colorG, int colorB) {
		int heightInt = 0;
		boolean error=false;
		robo.setPenColor(colorR, colorG, colorB);
		robo.setPenWidth(3);
		if(height.equalsIgnoreCase("small")) {
			heightInt = 60;
		} else if(height.equalsIgnoreCase("medium")) {
			heightInt =120;
		} else if(height.equalsIgnoreCase("large")) {
			heightInt = 250;
		} else {
			error=true;
			System.err.println("Error: " + height + " is not a valid input for the meathod drawHouse(String, String, int, int, int);   :(");
		}
		
		
		
		if(error==false) {
		robo.move(heightInt);
		if(type.equalsIgnoreCase("pointy")) {
		robo.turn(45);
		robo.move(30);
		robo.turn(90);
		robo.move(30);
		robo.turn(45);
		} else if(type.equalsIgnoreCase("flat")) {
		robo.turn(90);
		robo.move(30);
		robo.turn(90);
		} else {
			System.err.println("Error: " + type + " is not a valid input for the meathod drawHouse(String, String, int, int, int);   :(");
			for(int x = 0; x>-1; x+=1) {
				
			}
		
		}
		robo.move(heightInt);
		robo.turn(-90);
		robo.setPenWidth(10);
		robo.setPenColor(100, 255, 100);
		robo.move(40);
		robo.turn(-90);
		}
	}

}