
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
		redState = new RedState(this);
		blackState = new BlackState(this);
		redPromotedState = new RedPromotedState(this);
		blackPromotedState = new BlackPromotedState(this);
		emptyState = new EmptyState(this);
		
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
		state.move(toRow,toCol);

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
    public int getRow() {
    	return this.row;
    }
    public int getCol() {
    	return this.col;
    }
    
    public void setRow(int toRow) {
    	this.row = toRow;
    }
    public void setCol(int toCol) {
    	this.col = toCol;
    }

}

