package programming;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		case ("chrome"):
			System.out.println("You Select the CHROME browser");
			break;

		case ("firefox"):
			System.out.println("You Select the FIRFOX Browser");
			break;

		case ("internetExplorer"):
			System.out.println("You Select the INTERNETEXPLORER Browser");
			break;

		case ("opera"):
			System.out.println("You Select the OPERA Browser");

		default:
			System.out.println("You have not selected the correct browser");

		}

	}

}
