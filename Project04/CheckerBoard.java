import javax.swing.JPanel;

public class CheckerBoard extends JPanel {
	//instance variables:	COLUMNS // 0   1   2   3   4   5   6   7	  ROWS
	private char [][] boardStatus = {{'e','b','e','b','e','b','e','b'}, // 0
									 {'b','e','b','e','b','e','b','e'}, // 1
									 {'e','b','e','b','e','b','e','b'}, // 2
									 {'e','e','e','e','e','e','e','e'}, // 3
									 {'e','e','e','e','e','e','e','e'}, // 4
									 {'r','e','r','e','r','e','r','e'}, // 5
									 {'e','r','e','r','e','r','e','r'}, // 6
									 {'r','e','r','e','r','e','r','e'}};// 7
	
	public CheckerBoard(char [][] boardStatus) {
		this.boardStatus = boardStatus;

		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 8; column++) {
				CheckerPiece newDrawing = new CheckerPiece(row, column, boardStatus[row][column]);
				add(newDrawing, row * 8 + column);
			}
		}
		
		
	}
	
	
	public void setBoardStatus(char [][] boardStatus) {
		this.boardStatus = boardStatus;
		repaint();
	}
	
	
	public void setCheckerPiece(int row, int column, char status) {
		boardStatus[row][column] = status;
		repaint();
	}
	
	
}
