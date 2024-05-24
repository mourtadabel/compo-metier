package compoMetierAtl1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banque b1 = Banque.getInstance(1000);
		int cashb1 = b1.getCash();
		System.out.println("b1: "+cashb1);
		
		Banque b2 = Banque.getInstance(500);
		int cashb2 = b2.getCash();
		System.out.println("b2: "+cashb2);
		System.out.println("b1: "+cashb1);

	}

}
