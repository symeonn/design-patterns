package creational.builder;

public class Main {

    public static void main(String[] args) {

        ProductBuildDirector productBuildDirector = new ProductBuildDirector();

        productBuildDirector.setProductBuilder(new ProductBuilderA());
        productBuildDirector.construct();
        System.out.println(productBuildDirector.getProduct());

        productBuildDirector.setProductBuilder(new ProductBuilderB());
        productBuildDirector.construct();
        System.out.println(productBuildDirector.getProduct());
    }
}
