package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton b;
	JButton b1;
	public static void main (String[] args) {
		new ChuckleClicker().makeButtons();
	}
	void makeButtons() {
		JFrame f=new JFrame();
		f.setVisible(true);
		JPanel p=new JPanel();
		b=new JButton();
		b1=new JButton();
		p.add(b);
		p.add(b1);
		b.setText("Joke");
		b1.setText("Punchline");
		b.addActionListener(this);
		b1.addActionListener(this);
		f.add(p);
		f.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			JOptionPane.showMessageDialog(null, "Why did the football coach go to the bank");
		}
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(null, "Because he wanted his quarter back");
		}
	}

}
