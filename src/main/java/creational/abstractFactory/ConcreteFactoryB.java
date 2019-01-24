package creational.abstractFactory;

public class ConcreteFactoryB implements AbstractFactory {

	public ConcreteFactoryB() {
		System.out.println("in ConcreteFactoryB");
	}

	public void createProduct1() {
		System.out.println("In createProduct1");
		new ConcreteProduct1B();
	}

	public void createProduct2() {
		System.out.println("In createProduct2");
		new ConcreteProduct2B();
	}

}
