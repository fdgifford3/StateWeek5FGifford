
public class RedPromotedState implements State {
	public void move() {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving upward or downward because I am red and promoted");
	}
	public void jump() {
		System.out.println("Checking if jump is legal...");
		System.out.println("Jumping a black piece while moving upward or downward because I am red and promoted");
	}
	public void print() {
		System.out.println("This space has a promoted red piece");
	}
}
