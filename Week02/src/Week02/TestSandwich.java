package Week02;

public class TestSandwich {

	public static void main(String[] args) {
		Sandwich sc = new Sandwich();
		sc.setIngredient("Tuna");
		sc.setBread("Wheat");
		sc.setPrice(4.99);
		
		display(sc);

	}
	public static void display(Sandwich sc) {
	System.out.println(sc.getIngredient());	
	System.out.println(sc.getBread());	
	System.out.println(sc.getPrice());	
	}
}
