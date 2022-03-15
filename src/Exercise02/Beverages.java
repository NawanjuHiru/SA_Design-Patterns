package Exercise02;

public abstract class Beverages {
	
	abstract void addCondiments();
    abstract void brew();
    
	void boilWater() {
		System.out.println("Boiling water.");
	}
	
	void pourInCup() {
		System.out.println("Pour into cup.");
	}
	
	final void prepareRecepie() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
