import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class CheckerPiece extends JComponent{
	//instance variables
	public int row, column;
	public char status;
	
	
	public CheckerPiece(int row, int column, char status) throws IllegalArgumentException {
		if (row > 7 || row < 0 || column > 7 || column < 0) throw new IllegalArgumentException();
		if (status != 'b' && status != 'r' && status != 'e') throw new IllegalArgumentException();
		this.row = row;
		this.column = column;
		this.status = status;

		
	}
	
	@Override
	public void paintComponent(Graphics g) {		
		if ((row + column) % 2 == 0) { 
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 60, 60);
		}
		else {
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, 60, 60);
		}
		
		if (status == 'b') { //for black checker
			g.setColor(Color.BLACK);
			g.fillOval(7, 7, 40, 40); //fills in checker
		}
		else if (status == 'r') { //for red checker
			g.setColor(Color.RED);
			g.fillOval(7, 7, 40, 40); //fills in checker
		}
	}
}
