
public class BlackPromotedState implements State {
	Piece piece;
	
	public BlackPromotedState(Piece piece) {
		this.piece = piece;
	}
	public void move() {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving upward or downward because I am black and promoted");
	}
	public void jump() {
		System.out.println("Checking if jump is legal...");
		System.out.println("Jumping a red piece while moving upward or downward because I am black and promoted");
	}
	public void print() {
		System.out.println("This space has a promoted black piece");
	}
	
	public void promote() {
		System.out.println("Cannot Promote, already Promoted");
	}
	public void isJumped() {
		piece.setState(piece.getEmptyState());
	}
}
