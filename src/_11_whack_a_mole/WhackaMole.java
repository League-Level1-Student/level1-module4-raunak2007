package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	JFrame f;
	JPanel p;
	int v=0;
	int n=0;
	public static void main(String[] args) {
		new WhackaMole().drawButtons(10);
	}
	void drawButtons(int s) {
		f=new JFrame();
		f.setVisible(true);
		p=new JPanel();
		for(int i=0;i<24;i++) {
			JButton b = new JButton();
			p.add(b);
			b.addActionListener(this);
			if(i==s) {
				b.setText("mole!");
			}
		}
		f.add(p);
		f.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date t= new Date();
		Date t1=new Date();
		if((((JButton) e.getSource()).getText()!="mole!")) {
			speak("You missed!");
			t=new Date();
			v+=1;
		}
		if(((JButton) e.getSource()).getText().equals("mole!")) {
			n+=1;
			t1=new Date();
		}
		if(n==10) {
			endGame(t1,10);
		}
		if(v==5) {
			speak("You lost!");
			endGame(t,0);
		}
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

}
