
public class EmptyState implements State {
	Piece piece;
	
	public EmptyState(Piece piece) {
		this.piece = piece;
	}
	public void move(int toRow, int toCol) {
		System.out.println("Cannot move, this piece was destroyed");
	}
	public void jump() {
		System.out.println("Cannot jump, this piece was destroyed");
	}
	public void print() {
		System.out.println("This piece was destroyed");
	}
	
	public void promote() {
		System.out.println("Cannot Promote, this piece was destroyed");
	}
	public void isJumped() {
		System.out.println("Cannot Jump, this piece was destroyed");
	}
}
