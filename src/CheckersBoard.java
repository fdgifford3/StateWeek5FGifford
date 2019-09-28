//Simplified implementation to create spaces and initialize them in certain states
public class CheckersBoard {
	Space[][] checkersBoard;
	
	public CheckersBoard() {
		checkersBoard = new Space[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == j % 2 && i < 3) {
					checkersBoard[i][j] = new Space("black");
				} else if (i % 2 == j % 2 && i > 4) {
					checkersBoard[i][j] = new Space("red");
				} else {
					checkersBoard[i][j] = new Space("empty");
				}
			}
		}
	}
	
	public State getRedState(Space space) {
		return space.state;
	}
	
	public void setState(State state) {
		space.state;
	}
}
