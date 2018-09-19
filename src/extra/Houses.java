package extra;

import org.jointheleague.graphical.robot.Robot;

public class Houses {  
	static  Robot rob = new Robot();
public static void main(String[] args) { 
 
	
	rob.setSpeed(1000);  
	rob.setX(50); 
	rob.setY(500);
	drawHouse(200);   
	drawPoint(25);  
	drawHouse(600); 
	drawPoint(75); 
	drawPoint(15); 
	drawHouse(75); 
	drawPoint(200); 
	drawHouse(60); 
	drawPoint(45);
	
	

	/* 
	rob.turn(180); 
	rob.turn(90); 
	rob.move(400);
	rob.turn(180); 
	rob.turn(90);
	rob.move(250);
	rob.turn(180); 
	rob.setRandomPenColor(); 
	rob.penDown(); 
	rob.move(100); 
	rob.turn(90); 
	rob.move(35); 
	rob.turn(90);
	rob.move(100); 
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);
	rob.setRandomPenColor(); 
	rob.move(60); 
	rob.turn(25); 
	rob.move(25);  
	rob.turn(125); 
	rob.move(25); 
	rob.turn(27); 
	rob.move(60);
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);
	rob.setRandomPenColor();   
	rob.move(200); 
	rob.turn(90); 
	rob.move(50); 
	rob.turn(90);
	rob.move(200); 
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);
	rob.setRandomPenColor(); 
	rob.move(25); 
	rob.turn(25); 
	rob.move(25);  
	rob.turn(125); 
	rob.move(25); 
	rob.turn(27); 
	rob.move(25);
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);
	rob.setRandomPenColor();    
	rob.move(300); 
	rob.turn(25); 
	rob.move(25);  
	rob.turn(125); 
	rob.move(25); 
	rob.turn(27); 
	rob.move(300);
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);
	rob.setRandomPenColor();    
	
	*/
	
	
	}	
	static void drawHouse(int height) { 
		rob.setRandomPenColor(); 
		rob.penDown(); 
		rob.move(height); 
		rob.turn(90); 
		rob.move(35); 
		rob.turn(90);
		rob.move(height); 
		rob.turn(180);
		rob.turn(90); 
		rob.setPenColor(0, 3500, 0); 
		rob.move(50); 	
		rob.turn(180);  
		rob.turn(90);
		
	} 
static void drawPoint(int height) { 
	rob.setRandomPenColor(); 
	rob.move(height); 
	rob.turn(45); 
	rob.move(25);  
	rob.turn(90); 
	rob.move(25); 
	rob.turn(45); 
	rob.move(height);
	rob.turn(180);
	rob.turn(90); 
	rob.setPenColor(0, 3500, 0); 
	rob.move(50); 	
	rob.turn(180);  
	rob.turn(90);

	
	
}

			
}

	
	
	


	
	

	
	
	