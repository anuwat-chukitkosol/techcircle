package day08_loops;

public class BrowserSelection {

	public static void main(String[] args) {


		String targetBrowser = "Chrome";
		
		switch (targetBrowser) {
		case "Chrome":
			//WebDriver driver = new ChromeDriver();
			System.out.println("Open Chrome browser");
			break;

		case "IE":
			//WebDriver driver = new IE();
			System.out.println("Open IE browser");
			break;
			
		case "Safari":
			//WebDriver driver = new Safari();
			System.out.println("Open Safari browser");
			break;
			
		default:
			break;
		}

	}

}
