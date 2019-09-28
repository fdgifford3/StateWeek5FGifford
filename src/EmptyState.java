
public class EmptyState implements State {
	Piece piece;
	
	public EmptyState(Piece piece) {
		this.piece = piece;
	}
	public void move() {
		System.out.println("Cannot move, this space is empty");
	}
	public void jump() {
		System.out.println("Cannot jump, this space is empty");
	}
	public void print() {
		System.out.println("This space is empty");
	}
	
	public void promote() {
		System.out.println("Cannot Promote, this space is empty");
	}
	public void isJumped() {
		System.out.println("Cannot Jump, this space is empty");
	}
}
