
public class BlackState implements State {
	Piece piece;
	
	public BlackState(Piece piece) {
		this.piece = piece;
	}
	public void move() {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving downward because I am black and unpromoted");
	}
	public void jump() {
		System.out.println("Checking if jump is legal...");
		System.out.println("Jumping a red piece while moving downward because I am black and unpromoted");
	}
	public void print() {
		System.out.println("This space has an unpromoted black piece");
	}
	
	public void promote() {
		System.out.println("Promoting to Black Promoted");
		piece.setState(piece.getBlackPromotedState());
	}
	public void isJumped() {
		piece.setState(piece.getEmptyState());
	}
}
