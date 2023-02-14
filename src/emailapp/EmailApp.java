package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email e1 = new Email("Harry", "Potter");
		
		// e1.setAlternateEmail("3610897@company.com");
		
		// System.out.println(e1.getAlternateEmail());
		
		System.out.println(e1.showInfo());
		System.out.println(e1.getPassword());
		
	}

}
