/*
 * Frederick Gifford
 * CPSC-60000 Week 5 State Pattern
 * Since my final project is a simple Checkers game, I wanted to try to implement the State pattern
 * As a way to keep track of the state of a piece on the Checkers board, whether that be Red, Black,
 * RedPromoted, BlackPromoted, or Empty. This will be a simple implementation that just prints statements, but
 * The final project would be able to make algorithm changes based on the state about what the legal moves will be.
 * 9.27.2019
 * Prof Nowak
 */
public class StateWeek5FGifford {

	public static void main(String[] args) {
		System.out.println("Frederick Gifford\nCPSC-60000\nWeek 5 State Pattern\n");
		
		Piece piece1 = new Piece("red",3,3);
		piece1.move(4, 4);
		

	}

}
