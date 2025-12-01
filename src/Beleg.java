public class Beleg {

	public static void main(String[] args) {
		druckeRechnung();

	}
	
	
    public static void druckeRechnung() {
    	System.out.printf("%s %n%n", "Rechnung:");
    	
        System.out.printf("%-15s %2d x %2.2f%n", "Butter", 2, 2.99);
        System.out.printf("%22.2f%n", 5.98);

        System.out.printf("%-15s %2d x %2.2f%n", "Wasser", 6, 0.19);
        System.out.printf("%22.2f%n", 1.14);

        System.out.printf("%-15s %2d x %5.2f%n", "Pfand", 6, 0.25);
        System.out.printf("%22.2f%n", 3.00);

        System.out.printf("%-15s %2d x %5.2f%n", "Bonbons", 1, 0.99);
        System.out.printf("%22.2f%n", 0.99);

        System.out.println("-----------------------------------------");

        System.out.printf("%-15s %22.2f%n", "Summe:", 11.11);
        System.out.printf("%-15s %22.2f%n", "Bezahlt:", 15.00);
        System.out.printf("%-15s %22.2f%n", "Wechselgeld:", 3.89);
    }

}
