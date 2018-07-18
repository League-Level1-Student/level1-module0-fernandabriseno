/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Window;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String dog = "http://cdn1-www.dogtime.com/assets/uploads/gallery/30-impossibly-cute-puppies/impossibly-cute-puppy-2.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component component; 
		// 3. use the "createImage()" method below to initialize your Component
component = createImage(dog); 
		// 4. add the image to the quiz window
quizWindow.add(component);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String dogs = JOptionPane.showInputDialog("Are dogs or cats cuter/better/thebest/awesomer/likeWAYbetter");
		// 7. print "CORRECT" if the user gave the right answer
if (dogs.equals("dogs")) {  
JOptionPane.showInputDialog("CORRECT!!! :) YOU ARE SUPER CORRECT DONT LET ANYONE TELL YOU THAT YOU ARE WRONG CUZ YOU ARE RIGHT!!! XD YOU ARE SO AWESOME!!!");
}
		// 8. print "INCORRECT" if the answer is wrong
if (dogs.equals("cats")) { 
JOptionPane.showInputDialog("INCORRECT!! YOU ARE SO WRONG!! DOGS ARE WAY BETTER IM SO SORRY BUT THAT IS THE TRUTH!! FACE IT!! have a good day.. :)");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
String rose = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiYiMTc4qncAhVzCDQIHWqGDdcQjRx6BAgBEAU&url=https%3A%2F%2Fwww.jackseeds.com%2Fproducts%2F25-rare-holland-rainbow-rose-flower-seeds&psig=AOvVaw2Hxj1elBBO5_LOd5Yh4ucu&ust=1532041829175315";
		// 11. add the second image to the quiz window
quizWindow.add(component);
		Window frame = null;
// 12. pack the quiz window 
frame.pack();
		// 13. ask another question
JOptionPane.showInputDialog("Is a rainbow rose artificially colored or is it real??? :)");
		// 14+ check answer, say if correct or incorrect, etc.
if (rose.equals("artificial")) { 
JOptionPane.showInputDialog("CORRECT!! How can it be real? I wish it was though...");
} 
if (rose.equals("real")) {
JOptionPane.showInputDialog("INCORRECT!! Sorry! How can it be real? I wish it was though...");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





