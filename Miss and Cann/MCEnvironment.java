enum Position {RIGHT, LEFT}
public class MCEnvironment {
	
	
	private int canLeft;
	private int misLeft;
	private int canRight;
	private int misRight;
	private Position boat;
	
	
	public MCEnvironment(int canLeft, int misLeft, Position boat,
			int canRight, int misRight) {
		this.canLeft = canLeft;
		this.misLeft = misLeft;
		this.boat = boat;
		this.canRight = canRight;
		this.misRight = misRight;
	}
	
	public MCEnvironment() {
        this(3, 3,Position.LEFT, 0, 0);
    }
	
	public int getCanLeft() {
		return canLeft;
	}

	public void setCanLeft(int canLeft) {
		this.canLeft = canLeft;
	}

	public int getMisLeft() {
		return misLeft;
	}

	public void setMisLeft(int misLeft) {
		this.misLeft = misLeft;
	}

	public int getCanRight() {
		return canRight;
	}

	public void setCanRight(int canRight) {
		this.canRight = canRight;
	}

	public int getMisRight() {
		return misRight;
	}

	public void setMisRight(int misRight) {
		this.misRight = misRight;
	}

	public void goToLeft() {
		boat = Position.LEFT;
	}

	public void goToRight() {
		boat = Position.RIGHT;
	}

	public boolean isOnLeft() {
		return boat == Position.LEFT;
	}

	public boolean isOnRigth() {
		return boat == Position.RIGHT;
	}

	
	public boolean isGoal() {
		return canLeft == 0 && misLeft == 0;
	}
	
	@Override
	public String toString() {
		if (boat == Position.LEFT) {
			return "(" + canLeft + "," + misLeft + ",L,"
        			+ canRight + "," + misRight + ")";
		} else {
			return "(" + canLeft + "," + misLeft + ",R,"
        			+ canRight + "," + misRight + ")";
		}
     }
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MCEnvironment)) {
			return false;
		}
		MCEnvironment s = (MCEnvironment) obj;
        return (s.canLeft == canLeft && s.misLeft == misLeft
        		&& s.boat == boat && s.canRight == canRight
        		&& s.misRight == misRight);
	}
	
	

}
