
public class RedPromotedState implements State {
	public void move() {
		System.out.println("Checking if move is legal...");
		System.out.println("Moving upward because I am red and unpromoted");
	}
	public void jump() {
		System.out.println("Checking if jump is legal...");
		System.out.println("Jumping a black space while moving upward because I am red and unpromoted");
	}
	public void print() {
		System.out.println("I am a red piece and I am unpromoted");
	}
}
