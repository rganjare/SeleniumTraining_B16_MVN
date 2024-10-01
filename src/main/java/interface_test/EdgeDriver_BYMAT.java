package interface_test;

public class EdgeDriver_BYMAT implements WebDriver_Bymat { // 900

	@Override
	public void click() {
		System.out.println("Code to click in Edge Browser");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Code to open the URL in Edge Browser");
		
	}

	@Override
	public void getText() {
		System.out.println("Code to get Text in Edge Browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Code to quit in Edge Browser");
		
	}

	@Override
	public void close() {
		System.out.println("Code to close in Edge Browser");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Code to send data to fields in Edge Browser");
		
	}

	@Override
	public void takeScreenShot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
