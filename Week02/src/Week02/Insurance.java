package Week02;

import java.util.Scanner;

public class Insurance {

	public static int userValues() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Current Year");
		int currentYear = sc.nextInt();
		sc.nextLine(); 
		
		
		System.out.print("Birth Year");
		int birthYear = sc.nextInt();
		sc.nextLine();
		
		
		
		int premium = (((int)(currentYear - birthYear)/10) + 15)*20;
		
		return (premium);
		
	}
	
	public static void main(String[] args) {
		int premium = userValues();
		display(premium);

	}
	public static void display(int premium ) {
		System.out.println("Premium amount: $" + premium);
	}

}
