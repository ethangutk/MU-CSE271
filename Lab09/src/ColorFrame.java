import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ColorFrame extends JFrame implements ActionListener{ 
	JPanel colorBox = new JPanel();
	
	public ColorFrame() {
		//Create Action Listeners 
		
		
		//Create menu bar, menu, and menu items
		JMenuBar menuBar = new JMenuBar();
		JMenu menuBackgroundColor = new JMenu("Background Color");
		JMenuItem blueItem = new JMenuItem("Blue");
		JMenuItem redItem = new JMenuItem("Red");
		JMenuItem greenItem = new JMenuItem("Green");
		
		//creates actionlisteners 
		blueItem.addActionListener(this);
		redItem.addActionListener(this);
		greenItem.addActionListener(this);
		
		
		//adds menu items to menu
		menuBackgroundColor.add(blueItem);
		menuBackgroundColor.add(redItem);
		menuBackgroundColor.add(greenItem);
		menuBar.add(menuBackgroundColor);
		setJMenuBar(menuBar);
		add(colorBox);
		
		
	}
	
	
	
	//Driver
	public static void main(String [] args) {
		ColorFrame ab = new ColorFrame();
		ab.setSize(685	, 550);
		ab.setTitle("JMenu Tester");
		ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ab.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Red")) {
			colorBox.setBackground(Color.red);
		}
		if (e.getActionCommand().equals("Blue")) {
			colorBox.setBackground(Color.blue);
		}
		if (e.getActionCommand().equals("Green")) {
			colorBox.setBackground(Color.green);
		}
	}

}
