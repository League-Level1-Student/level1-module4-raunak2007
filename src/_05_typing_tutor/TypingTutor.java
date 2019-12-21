package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame f;
	public static void main(String[] args) {
		new TypingTutor().createUI();
	}
	void createUI() {
		f=new JFrame();
		f.setVisible(true);
		currentLetter = generateRandomLetter();
		JLabel l=new JLabel();
		l.setText(currentLetter+"");
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		f.addKeyListener(this);
	}
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==currentLetter+"") {
			System.out.println("correct");
			f.setBackground(new Color(0,255,0));
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
			currentLetter=generateRandomLetter();
	}
}
