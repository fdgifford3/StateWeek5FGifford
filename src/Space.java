
public class Space {
	State redState;
	State blackState;
	State redPromotedState;
	State blackPromotedState;
	State emptyState;
	
	State state;
	
	//Initialize as an emptyState space
	public Space(String type) {
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
}
