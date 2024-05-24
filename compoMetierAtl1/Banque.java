package compoMetierAtl1;

public final class Banque {
	private int cash;
	private static Banque instance;
	
	private Banque(int cash) {
		this.cash = cash;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	
	public static Banque getInstance(int cash) {
		if (instance == null) {
			instance = new Banque(cash);
		}
		return instance;
	}
	
	

}
