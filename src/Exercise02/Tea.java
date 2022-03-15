package Exercise02;

public class Tea extends Beverages{

	@Override
	void addCondiments() {
		System.out.println("Adding lemon.");
	}
	
	@Override
	void brew() {
		System.out.println("Steeping the tea.");
	}
}
