
public class RedState implements State {
	Piece piece;
	
	public RedState(Piece piece) {
		this.piece = piece;
	}
	public void move(int toRow, int toCol) {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving upward because I am red and unpromoted");
		//assume some logic tests whether move is legal
		piece.setRow(toRow);
		piece.setRow(toCol);
		//hard code top row as 7 for simplicity
		if(piece.getRow() == 7) {
			promote();
		}
	}
	public void jump() {
		System.out.println("Checking if jump is legal...");
		System.out.println("Jumping a black piece while moving upward because I am red and unpromoted");
	}
	public void print() {
		System.out.println("This space has an unpromoted red piece");
	}
	
	public void promote() {
		System.out.println("Promoting to Red Promoted");
		piece.setState(piece.getRedPromotedState());
	}
	public void isJumped() {
		piece.setState(piece.getEmptyState());
	}
}
