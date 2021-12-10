package paket;

class TestClass {
	protected void showMessage() {
		System.out.println("Hello!");
	}
}

public class Manipulation_1_4 {
	public void readProtected(){
		TestClass tc = new TestClass();
		tc.showMessage();
	}
}

