import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class Emoticon extends JComponent{ 
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setSize(1800	, 600);
		frame.setTitle("Emoticons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Emoticon drawing = new Emoticon();
		frame.add(drawing);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(100, 150, 300, 300); //face 1
		g.fillOval(500, 150, 300, 300); //face 2
		g.fillOval(900, 150, 300, 300); //face 3
		g.fillOval(1300, 150, 300, 300); //face 4
		
		g.setColor(Color.blue);
		g.fillOval(150,  225, 50, 50);//face 1 eye 1
		g.fillOval(300,  225, 50, 50);//face 1 eye 2
		g.fillOval(550,  225, 50, 50);//face 2 eye 1
		g.fillOval(700,  225, 50, 50);//face 2 eye 2
		g.fillOval(950,  225, 50, 50);//face 3 eye 1
		g.fillOval(1100, 225, 50, 50);//face 3 eye 2
		g.fillOval(1350, 225, 50, 50);//face 4 eye 1
		g.drawLine(1500, 250, 1550, 250);//face 4 eye 2
		
		g.setColor(Color.red);
		g.drawArc(200, 350, 75, 50, 180, 180);//mouth 1
		g.drawArc(600, 350, 75, 50, 0, 180);//mouth 2
		g.drawArc(1000, 350, 75, 50, 0, 180);//mouth 3
		g.drawArc(1000, 350, 75, 50, 180, 180);//mouth 3
		g.drawArc(1400, 350, 75, 50, 180, 180);//mouth 4
	}

	
}
