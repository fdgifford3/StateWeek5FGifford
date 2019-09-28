
public interface State {
	public void move(int toRow, int toCol);
	public void jump();
	public void print();
	public void promote();
	public void isJumped();
	
}
