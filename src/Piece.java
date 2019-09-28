
public class Piece {
	int row, col;
	
	State redState;
	State blackState;
	State redPromotedState;
	State blackPromotedState;
	State emptyState;
	
	State state;
	
	//Initialize as an emptyState space
	public Piece(String type, int row, int col) {
		this.row = row;
		this.col = col;
		redState = new RedState();
		blackState = new BlackState();
		redPromotedState = new RedPromotedState();
		blackPromotedState = new BlackPromotedState();
		emptyState = new EmptyState();
		
		if(type.equalsIgnoreCase("red")) {
			state = redState;
		} else if (type.equalsIgnoreCase("black")) {
			state = blackState;
		} else {
			state = emptyState;
		}
	}
	
	public void move(int toRow, int toCol) {
		// check if move is legal
		// check if move is a move or a jump
		// if move is a jump then run the isJumped() method on the jumped piece
		// check if in last row, if so, promote
	}
	
    public State getState() {
        return state;
    }
    
    public State getRedState() {
        return redState;
    }
    
    public State getBlackState() {
        return blackState;
    }
    
    public State getRedPromotedState() {
        return redPromotedState;
    }
    
    public State getBlackPromotedState() {
        return blackPromotedState;
    }
    
    public State getEmptyState() {
        return emptyState;
    }
    
	public void setState(State state) {
		this.state = state;
	}
    
}
