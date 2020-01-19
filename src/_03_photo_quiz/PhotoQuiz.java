package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String imageString = "https://i.ytimg.com/vi/b57fxUduuL4/hqdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image=createImage(imageString);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String anwser = JOptionPane.showInputDialog("What color is not on the minion furry?\nA: Orange \nB: Red \nC: Yellow");
		// 7. print "CORRECT" if the user gave the right answer
		if(anwser.equalsIgnoreCase("red")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect \n :(");
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		imageString = "https://i.chzbgr.com/full/8979973/hFA384455/cursed-images-such-as-a-melted-teletubby-doll";
		
		image=createImage(imageString);
		
		quizWindow.add(image);
		
		quizWindow.pack();
		

		// 12. pack the quiz window
		
		// 13. ask another question
		anwser = JOptionPane.showInputDialog("Which side is better? \n A: Left \n B: Right");
		// 7. print "CORRECT" if the user gave the right answer
		if(anwser.equalsIgnoreCase("left")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect \n :(");
		// 14+ check answer, say if correct or incorrect, etc.
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
