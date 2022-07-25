import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class CheckerGame extends JFrame{
	//instance variables:	COLUMNS // 0   1   2   3   4   5   6   7	  ROWS
	private char [][] boardStatus = {{'e','b','e','b','e','b','e','b'}, // 0
									 {'b','e','b','e','b','e','b','e'}, // 1
									 {'e','b','e','b','e','b','e','b'}, // 2
									 {'e','e','e','e','e','e','e','e'}, // 3
									 {'e','e','e','e','e','e','e','e'}, // 4
									 {'r','e','r','e','r','e','r','e'}, // 5
									 {'e','r','e','r','e','r','e','r'}, // 6
									 {'r','e','r','e','r','e','r','e'}};// 7
	//A two-dimensional character array, 8 x 8, that stores the status 
	//value for each of the squares.
	
	JPanel panel;
	JMenu game, help; //two menues at the  top
	JMenuItem newgame, exit, rules, about; //options in the menu
	JLabel creator, status;
	
	
	public CheckerGame() {
		setSize(505, 585);
		setTitle("Checkers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		JPanel infoBar = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		game = new JMenu("Game");
		help = new JMenu("Help");
		newgame = new JMenuItem("New Game");
		exit = new JMenuItem("Exit");
		rules = new JMenuItem("Game Rules");
		about = new JMenuItem("About Game");
		
		game.add(newgame);
		game.add(exit);
		help.add(rules);
		help.add(about);
		menuBar.add(game);
		menuBar.add(help);
		setJMenuBar(menuBar);

		infoBar.setLayout(new GridLayout(2, 1));
		CheckerBoard board = new CheckerBoard(boardStatus);
		add(board, BorderLayout.CENTER);
		status = new JLabel("this is where the status will be", SwingConstants.CENTER);
		infoBar.add(status, 0);
		creator = new JLabel("This game was developed by Ethan", SwingConstants.CENTER);
		infoBar.add(creator, 1);
		add(infoBar, BorderLayout.SOUTH);
		
		
	}
	
	
	public static void main(String[] args) {
		CheckerGame game = new CheckerGame();
		game.setVisible(true);
	}
	
}
