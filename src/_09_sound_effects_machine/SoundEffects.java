package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton beep = new JButton();
	JButton saw = new JButton();
	void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		saw.setText("Saw Thingy");
		saw.addActionListener(this);
		panel.add(saw);
		beep.setText("Beep Sound");
		beep.addActionListener(this);
		panel.add(beep);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked==saw) {
		playSound("sawing-wood-daniel_simon.wav");
		} else {
			playSound("beep.wav");
		}
		}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
