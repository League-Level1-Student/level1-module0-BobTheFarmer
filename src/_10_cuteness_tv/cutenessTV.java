package _10_cuteness_tv;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JButton unicorn = new JButton();
	JButton frog = new JButton();
	JButton duck = new JButton();
	void run() {
		frog.setText("Frog");
		unicorn.setText("Unicorn");
		duck.setText("Duck");
		frog.addActionListener(this);
		unicorn.addActionListener(this);
		duck.addActionListener(this);
		
		Frame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		panel.add(frog);
		panel.add(unicorn);
		panel.add(duck);
		frame.add(panel);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked==unicorn) {
			showFluffyUnicorns();
		} else if(buttonClicked==frog) {
			showFrog();
	} else {
		showDucks();
}
	}
	
	
	
	
	
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
