
public class RedState implements State {
	Piece piece;
	
	public RedState(Piece piece) {
		this.piece = piece;
	}
	public void move() {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving upward because I am red and unpromoted");
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
		
	}
	public void isJumped() {
		piece.setState()
	}
}
