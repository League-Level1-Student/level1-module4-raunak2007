package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame f;
	JPanel p;
	JButton b;
	int a;
	int c;
	int d;
	public static void main(String[] args) {
		new SlotMachine().createUI();
	}
	void createUI() {
		f=new JFrame();
		f.setVisible(true);
		p=new JPanel();
		b=new JButton();
		b.setText("SPIN");
		b.addActionListener(this);
		p.add(b);
		f.add(p);
		f.pack();
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			if(new Random().nextInt(3)==0) {
		try {
			p.add(createLabelImage("lime.jpg"));
			a+=1;
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(new Random().nextInt(3)==1) {
			try {
				p.add(createLabelImage("cherry.jpg"));
				c+=1;
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		if(new Random().nextInt(3)==2) {
			try {
				p.add(createLabelImage("orange.jpg"));
				d+=1;
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(a==3) {
			JOptionPane.showMessageDialog(null, "You win");
		}
		if(c==3) {
			JOptionPane.showMessageDialog(null, "You win");
		}
		if(d==3) {
			JOptionPane.showMessageDialog(null, "You win");
		}
		
		}
	}
    
}
}
}
