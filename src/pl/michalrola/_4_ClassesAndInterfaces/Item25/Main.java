package pl.michalrola._4_ClassesAndInterfaces.Item25;

public class Main {

	public static void main(String[] args) {
//		System.out.println(Utensil.NAME);
//		System.out.println(Dessert.NAME);
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

	private static class Utensil {

		static final String NAME = "pan";
	}

	private static class Dessert {

		static final String NAME = "cake";
	}
}
