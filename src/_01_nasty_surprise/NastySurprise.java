package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton b=new JButton();
	JButton b1=new JButton();
	public static void main(String[] args) {
		NastySurprise n=new NastySurprise();
		n.createUI();
	}
	void createUI() {
		JFrame f=new JFrame();
		f.setVisible(true);
		JPanel p=new JPanel();
		f.add(p);
		p.add(b);
		p.add(b1);
		f.pack();
		b.setText("Trick");
		b1.setText("Treat");
		b.addActionListener(this);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			showPictureFromTheInternet("http://cdn.akc.org/content/article-body-image/siberian_husky_cute_puppies.jpg");
		}
		else if(e.getSource()==b1) {
			showPictureFromTheInternet("https://www.biography.com/.image/t_share/MTY2NjgyOTkyNTMyNTMwMjMx/gettyimages-2637237.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
}
