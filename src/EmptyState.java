
public class EmptyState implements State {
	public void move() {
		System.out.println("Cannot move, this space is empty");
	}
	public void jump() {
		System.out.println("Cannot jump, this space is empty");
	}
	public void print() {
		System.out.println("This space is empty");
	}
}
