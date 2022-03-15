package Exercise02;

public class Coffee extends Beverages{

	@Override
    void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

    @Override
    void brew() {
        System.out.println("Stripping coffie through filter.");
    }
}
