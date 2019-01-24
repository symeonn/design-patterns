package creational.abstractFactory;

public class Main {

    public static void main(String[] args) {


        AbstractFactory factoryA = new ConcreteFactoryA();
        factoryA.createProduct1();
        factoryA.createProduct2();

        AbstractFactory factoryB = new ConcreteFactoryB();
        factoryB.createProduct1();
        factoryB.createProduct2();


    }
}
