package creational.abstractFactory;

public class ConcreteFactoryA implements AbstractFactory {

    public ConcreteFactoryA() {
        System.out.println("In ConcreteFactoryA");
    }

    public void createProduct1() {
        System.out.println("In createProduct1");
        new ConcreteProduct1A();
    }

    public void createProduct2() {
        System.out.println("In createProduct2");
        new ConcreteProduct2A();
    }

}
